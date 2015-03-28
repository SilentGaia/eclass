package chat;
import java.util.Collection;

/**
 * A Chatroom is a room inside the Chatbox. It has a Members component to
 * indicate the users in the room. It has a comments component to store 
 * Members' posts (Strings) onto the chatroom.
 */
public abstract class Chatroom {
   Collection<Member> members;
   Collection<String> comments;

   /**
    * AddComment adds the given message to this.comments with the
    * given member's name.
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
   abstract void addComment(Member member, String message);

   /**
    * AddMember adds the given member to this.members. 
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
   abstract void addMember(Chat chat, Member member);

   /**
    * RemoveMember removes the given member from this.members. This will 
    * only be called once the given member decides to leave the chatroom. 
    */
   abstract void removeMember(Member member);
}
