package eclasstool.model.chat;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A Member is a student or instructor with access to the Chat. The name 
 * is the user's name. The CanChat indicates the user's permission to post
 * onto the Chat. The collection of chatrooms is the list of chatrooms
 * the user is actively in. The chat represents the overall chatbox that
 * has a collection of chatrooms and members available in the classroom.
 * @author Daniel Lee (dlee104@calpoly.edu)
 */
public class Member implements Serializable{
   /**
    * Chat model for chat functionality.
    */
   private Chat chat;
   /**
    * The full name of this member.
    */
   private String name;
   /**
    * The chatrooms this member is involved in.
    */
   private ArrayList<Chatroom> chatrooms;

   /**
    * Constructs a new member with a given name.
    */
   public Member(String name) {
      this.name = name;
      chatrooms = new ArrayList<Chatroom>();
   }

   /**
    * GetName will return the name of this member.
   */
   public String getName() {
      return name;
   }
   
   /**
    * AddChatroom will add the given Chatroom to this.chatrooms.
    */
   /*@
   requires
      //
      // The chatroom exists in chatrooms of chat.
      //
      chat.chatrooms.contains(chatroom);

   ensures
      //
      // The chatroom is added to the collection of this member's
      // chatrooms.
      //
      chatrooms.contains(chatroom)

      &&

      // 
      // The chatroom has this member added to its collection of
      // members.
      //
      chatroom.members.contains(this);
   @*/
   public void addChatroom(Chatroom chatroom) {
      chatrooms.add(chatroom);
   }

   /**
    * Gets the chatrooms of this member.
    *
    * @return this member's chatrooms
    */
   public List<Chatroom> getChatrooms() {
      return chatrooms;
   }

   /**
    * RemoveChatroom will remove the given Chatroom from this.chatrooms.
    */
   /*@
   requires
      //
      // The chatroom exists in chatrooms of chat and this.chatrooms.
      //
      chat.chatrooms.contains(chatroom) && chatrooms.contains(chatroom)

      &&

      //
      // The chatroom has this member in its collection of members.
      //
      chatroom.members.contains(this);

   ensures
      //
      // The chatroom no longer has this member in its collection of
      // members
      //
      !chatroom.members.contains(this)

      &&

      //
      // The chatroom no longer exists in this member's collection of
      // chatrooms.
      //
      !chatrooms.contains(chatroom);
   @*/
   public void removeChatroom(Chatroom chatroom) {
      chatrooms.remove(chatroom);
   }
}
