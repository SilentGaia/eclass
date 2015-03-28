package eclasstool.model.chat;

import java.util.*;
import java.io.Serializable;

/**
 * The Chat object is derived from the main view of Section 2.7 of
 * the Milestone 4 requirements. The functionality described in that 
 * section makes it clear that a Chat is the primary data object of 
 * the Chatbox tool.  
 *                                                                               <p>
 * The User component of a Chat represents the actual user. 
 * The Members component of a Chat is a collection of all users in the
 * classroom. The Chatrooms component of a Chat is a collection of
 * chatrooms available for the user. The CurrentChatroom keeps track
 * of what chatroom the user is on. 
 * @author Daniel Lee (dlee104@calpoly.edu)
 */

public class Chat extends Observable implements Serializable {

   /**
    * The registry to use for connecting to the server.
    */
//   private Registry registry;
   /**
    * The server interface that handles client calls to the server.
    */
   private RemoteChat stub;
   /**
    * The main user.
    */
   private Member user;
   /**
    * All students in this user's classroom.
    */
   private ArrayList<Member> members;
   /**
    * The list of chatrooms the user is involved in.
    */
   private ArrayList<Chatroom> chatrooms;
   /**
    * The current chatroom the user is in.
    */
   private Chatroom currentChatroom;
   /**
    * Any pending questions for the instructor or class.
    */
   private ChatQuestion question;
   /**
    * Chat privilege of the user.
    */
   private boolean canChat;

   /**
    * Constructs a new chat with the student as its main user.
    */
   public Chat(Member member, RemoteChat stub) {
      user = member;
      members = new ArrayList<Member>();
      members.add(member);
      chatrooms = new ArrayList<Chatroom>();
      createChatroom();
      question = null;
      canChat = true;
      this.stub = stub;
   }

   /**
    * GetChatrooms returns all available chatrooms based on
    * the Member. So, it will use this.user to calculate which chatrooms
    * to show.
    * @return The list of available chatrooms of user.
    */
   public ArrayList<Chatroom> getChatrooms() {
      return chatrooms;
   }

   /**
    * CreateChatroom makes a new chatroom and adds it to this.chatrooms.
    * It initially holds zero members besides the user who made it.
    */
   public void createChatroom() {
      Chatroom newChatroom = new Chatroom();
      newChatroom.addMember(this, user);
      chatrooms.add(newChatroom);
      setChatroom(newChatroom);
   }

   /**
    * SetChatroom sets the CurrentChatroom component to the given Chatroom.
    * This will change the main Chat view to the given Chatroom.
    * This method is used to navigate through chatrooms.
    * @param chatroom the chatroom to set as currentChatroom
    */
   /*@
   requires
      //
      // The given chatroom is in the user's list of chatrooms.
      //
      chatrooms.contains(chatroom)
      
         &&

      //
      // The given chatroom has this user in the members collection.
      //
      (chatroom.members).contains(user);

   ensures
      //
      // The current chatroom view is the given chatroom.
      //
      currentChatroom.equals(chatroom);
   @*/
   public void setChatroom(Chatroom chatroom) {
      currentChatroom = chatroom;
   }

   /**
    * SetChatroom sets the CurrentChatroom component to the given Chatroom.
    * This will change the main Chat view to the given Chatroom.
    * This method is used to navigate through chatrooms.
    * @param index the index to use to get chatroom to set by
    */
   /*@
   requires
      //
      // The given chatroom is in the user's list of chatrooms.
      //
      index > 0 && index <= chatrooms.size()
      
         &&

      //
      // The given chatroom has this user in the members collection.
      //
      (chatrooms.get(index).members).contains(user);

   ensures
      //
      // The current chatroom view is the given chatroom.
      //
      currentChatroom.equals(chatrooms.get(index));
   @*/
   public void setChatroom(int index) {
      currentChatroom = chatrooms.get(index);
   }

   /**
    * GetChatroom returns the currentChatroom.
    * @return the current chatroom in chat
   */
   public Chatroom getChatroom() {
      return currentChatroom;
   }

   /**
    * Adds the given member to the current chatroom.
    * @param member the member to add to current chatroom
   */ 
   public void addUser(Member member) {
      currentChatroom.addMember(this, member);
   }

   /**
    * Gets the user instance interacting with this chat feature.
    * @return the main user
    */
   public Member getUser() {
      return user;
   }

   /**
    * LeaveChatroom removes the User from the CurrentChatroom, if the
    * CurrentChatroom is not the main Classroom chatroom. 
    */
   /*@
   requires
      //
      // The currentChatroom is a private chatroom and
      // it exists in clasrooms collection.
      //
      (currentChatroom != null) && chatrooms.contains(currentChatroom);

   ensures
      //
      // The currentChatroom now points back to classroom (first and
      // default chatroom) and is not null.
      //
      (currentChatroom != null) && currentChatroom.equals(
         chatrooms.toArray()[0]);
   @*/
   public void leaveChatroom() {
      chatrooms.remove(currentChatroom);
      currentChatroom = chatrooms.get(0);
   }

   /**
    * PostComment passes the given message to the CurrentChatroom
    * to update the comments collection. Then it will show the comment
    * on the CurrentChatroom view. 
    * @param message the string to post onto the current chatroom
    */
   /*@
   requires
      //
      // The message is not empty.
      //
      (message.length() > 0);

   ensures
      //
      // The message is posted on the currentChatroom.
      //
      currentChatroom.comments.contains(message);
   @*/
   public void postComment(String message) {
      currentChatroom.addComment(user, message);

      if (chatrooms.indexOf(currentChatroom) == 0)
      {
         try {
            if (stub != null) {
               stub.addComment(user.getName() + ": " + message);
            }
         }
         catch (Exception error)
         {
            error.printStackTrace();
         }
      }
   }

   /**
    * GetQuestion returns the pending question of this user.
    *
    * @return the pending question
    */
   public ChatQuestion getQuestion() {
      return question;
   }

   /**
    * AskQuestion prompts the user for a string and passes it to the
    * Roster, which will add the user to the question queue. 
    * @param question the question to queue onto the roster
    */
   public void askQuestion(String question) {
      this.question = new ChatQuestion(question);
      Chatroom chatroom = chatrooms.get(0);
      chatroom.addQuestion(question);

      try {
         if (stub != null) {
            stub.addComment("QUESTION: " + question);
         }
      }
      catch (Exception error)
      {
         error.printStackTrace();
      }
   }

   /**
    * WithdrawQuestion will delete the pending question from the
    * instructor's roster.
    */
   public void withdrawQuestion() {
      question = null;
   }

   /**
    * GetPrivilege returns this user's chat privilege.
    *
    * @return the user's chat privilege
    */
   public boolean getPrivilege() {
      return canChat;
   }

   /**
    * SetChatPrivilege sets the CanChat component to the given value.
    * This controls the user's ability to chat.
    * @param value the value to set as the chat privilege
    */
   public void setChatPrivilege(boolean value) {
      canChat = value;
   }

   /**
    * ChangeState notifies its observers of a change in state.
    */
   public void changeState()
   {
      setChanged();
      notifyObservers();
   }
}
