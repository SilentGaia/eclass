package eclasstool.model.chat;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * A Chatroom is a room inside the Chatbox. It has a Members component to
 * indicate the users in the room. It has a comments component to store 
 * Members' posts (Strings) onto the chatroom.
 * @author Daniel Lee (dlee104@calpoly.edu)
 */
public class Chatroom implements Serializable{
   /**
    * The members in this chatroom.
    */
   private ArrayList<Member> members;
   /**
    * The comments made in this chatroom.
    */
   private ArrayList<String> comments;

   /**
    * Constructs a new chatroom with blank users and comments.
    */
   public Chatroom() {
      members = new ArrayList<Member>();
      comments = new ArrayList<String>();
   }

   /**
    * GetMembers returns the members in this chatroom.
    * @return the list of members in this chatroom
   */
   public ArrayList<Member> getMembers() {
      System.out.println("In Chatroom.getMembers");
      return members;
   }

   /**
    * GetComments returns posted comments in this chatroom.
    * @return the packed list of comments into a single string
    */
   public String getComments() {
      System.out.println("In Chatroom.getComments");
      String result = "";

      for (String comment : comments) {
         result += comment + "\n";
      }
      return result;
   }

   /**
    * AddComment adds the given message to this.comments with the
    * given member's name.
    * @param member the member that is posting onto chatroom
    * @param message the message to comment
    */
   /*@
   requires
      //
      // The message is not empty.
      //
      (message.length() > 0)
      
      &&

      //
      // The member exists in this chatroom.
      //
      members.contains(member);

   ensures
      //
      // The message is posted onto the chatroom and is added
      // to comments.
      //
      comments.contains(message);
   @*/
   public void addComment(Member member, String message) {
      System.out.println("In Chatroom.addComment");
      comments.add(member.getName() + ": " + message);
      System.out.println("Current comments:");

      for (String comment : comments)
      {
         System.out.println(comment);
      }
   }

   /**
    * AddQuestion adds a question to the chatroom.
    *
    * @param question the question to post to the chatroom
    */
   public void addQuestion(String question) {
      System.out.println("In Chatroom.addQuestion");
      comments.add("QUESTION: " + question);
   }

   /**
    * AddMember adds the given member to this.members. 
    * @param chat the chat the given member is in
    * @param member the member to add onto this chatroom
    */
   /*@
   requires
      //
      // The member exists in chat's collection of members.
      //
      chat.members.contains(member);

   ensures
      //
      // The member is added to this chatroom's collection of members.
      //
      members.contains(member);
   @*/
   public void addMember(Chat chat, Member member) {
      members.add(member);
      //System.out.println("In Chatroom.addMember");
   }

   /**
    * RemoveMember removes the given member from this.members. This will 
    * only be called once the given member decides to leave the chatroom. 
    * @param member the member to remove
    */
   public void removeMember(Member member) {
      members.remove(member);
      System.out.println("In Chatroom.removeMember");
   }
}
