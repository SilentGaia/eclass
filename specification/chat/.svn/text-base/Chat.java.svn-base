package chat;
import java.util.Collection;
import java.util.*;

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
 */

public abstract class Chat {
   Member user;
   Collection<Member> members;
   Collection<Chatroom> chatrooms;
   Chatroom currentChatroom;
   ChatQuestion question;
   boolean canChat;

   /**
    * ShowChatroomList displays all available chatrooms based on
    * the Member. So, it will use this.user to calculate which chatrooms
    * to show.
    */
   abstract void showChatroomList();

   /**
    * CreateChatroom makes a new chatroom and adds it to this.chatrooms.
    * It initially holds zero members besides the user who made it.
    */
   abstract void createChatroom();

   /**
    * SetChatroom sets the CurrentChatroom component to the given Chatroom.
    * This will change the main Chat view to the given Chatroom.
    * This method is used to navigate through chatrooms.
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
   abstract void setChatroom(Chatroom chatroom);

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
   abstract void leaveChatroom();

   /**
    * PostComment passes the given message to the CurrentChatroom
    * to update the comments collection. Then it will show the comment
    * on the CurrentChatroom view. 
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
   abstract void postComment(String message);

   /**
    * AskQuestion prompts the user for a string and passes it to the
    * Roster, which will add the user to the question queue. 
    */
   abstract void askQuestion();

   /**
    * WithdrawQuestion will delete the pending question from the
    * instructor's roster.
    */
   abstract void withdrawQuestion();

   /**
    * SetChatPrivilege sets the CanChat component to the given value.
    * This controls the user's ability to chat.
    */
   abstract void setChatPrivilege(boolean value);
}
