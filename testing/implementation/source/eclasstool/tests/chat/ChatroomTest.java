package eclasstool.tests.chat;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.chat.*;
/****
 *
 * Class ChatroomTest is the companion testing class for <a href=
 * Chat.html> Chat </a> It impelments the following module test plan:
 *													<pre>
 * Phase 1: Unit test the constructors
 *
 * Phase 2: Unit test simple acces method getMembers
 *
 * Phase 3: Unit test constructive methods addComment, addMember
 *
 * Phase 4: Unit test removeMember
 *
 * Phase 5: Repeat phases 1 through 4
 *
 * Phase 6: Stress test by adding and deleting 100000 members and comments
 */
public class ChatroomTest {

    @Test
    public void testChatroom() {
        Chatroom chatroom = new Chatroom();
        assertTrue(chatroom.getMembers() != null);
        assertTrue(chatroom.getComments() != null);
    }

    @Test
    public void testGetMembers() {
        Chatroom chatroom = new Chatroom();
        assertTrue(chatroom.getMembers() != null);
    }

    @Test
    public void testAddComment() {
        Chatroom chatroom = new Chatroom();
        chatroom.addComment(new Member("Daniel"), "testing");
        assertEquals("Daniel: testing\n", chatroom.getComments());
    }

    @Test
    public void testAddMember() {
        Chatroom chatroom = new Chatroom();
        chatroom.addMember(null, new Member("Daniel"));
        assertTrue(chatroom.getMembers().size() != 0);
    }

    @Test
    public void testRemoveMember() {
        Chatroom chatroom = new Chatroom();
        Member member = new Member("Daniel");
        chatroom.addMember(null, member);
        chatroom.removeMember(member);
        assertTrue(chatroom.getMembers().size() == 0);
    }

}
