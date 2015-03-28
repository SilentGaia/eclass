package chat;
import java.util.Collection;

/**
 * A Member is a student or instructor with access to the Chat. The name 
 * is the user's name. The CanChat indicates the user's permission to post
 * onto the Chat. The collection of chatrooms is the list of chatrooms
 * the user is actively in. The chat represents the overall chatbox that
 * has a collection of chatrooms and members available in the classroom.
 */
public abstract class Member {
   Chat chat;
   String name;
   Collection<Chatroom> chatrooms;
   
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
   abstract void addChatroom(Chatroom chatroom);

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
   abstract void removeChatroom(Chatroom chatroom);
}
