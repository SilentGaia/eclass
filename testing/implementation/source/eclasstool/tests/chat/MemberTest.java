package eclasstool.tests.chat;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.chat.*;

public class MemberTest {

    @Test
    public void testMember() {
        Member member = new Member("Daniel");
        assertTrue(member.getName() != null);
        assertTrue(member.getChatrooms() != null);
    }

    @Test
    public void testGetName() {
        Member member = new Member("Daniel");
        assertEquals("Daniel", member.getName());
    }

    @Test
    public void testAddChatroom() {
        Member member = new Member("Daniel");
        Chatroom chatroom = new Chatroom();
        member.addChatroom(chatroom);
        assertTrue(member.getChatrooms().size() != 0);
    }

    @Test
    public void testRemoveChatroom() {
        Member member = new Member("Daniel");
        Chatroom chatroom = new Chatroom();
        member.addChatroom(chatroom);
        member.removeChatroom(chatroom);
        assertTrue(member.getChatrooms().size() == 0);
    }
}
