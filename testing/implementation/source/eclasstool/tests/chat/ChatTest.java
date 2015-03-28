package eclasstool.tests.chat;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.chat.*;
/****
 *
 * Class ChatTest is the companion testing class for <a href=
 * Chat.hmtl> Chat </a>.  It implements the following module test plan:
 * 								  <pre>
 * 	Phase 1: Unit test the constructors
 * 	
 * 	Phase 2: Unit test simple access/set methods getChatrooms, SetChatroom,
 *		 	 getChatroom
 *
 * 	Phase 3: Unit test the constructive methods CreateChatroom, addUser
 *
 *  Phase 4: Unit test the leaveChatroom, postComment, askQuestion, withdrawQuestion,
 *			 setChatPrivilege
 *  
 *	Phase 5: Repeat phases 1 through 4
 *  
 *  Phase 6: Stress test by adding and deleting 100000 students, questions, and comments
 *									</pre>
 */
public class ChatTest {

    @Test
    public void testChat() {
        Chat chat = new Chat(new Member("Daniel"), null);
        assertTrue(chat != null);
    }

    @Test
    public void testGetChatrooms() {
        Chat chat = new Chat(new Member("Daniel"), null);
        assertTrue(chat.getChatrooms().size() != 0);
    }

    @Test
    public void testCreateChatroom() {
        Chat chat = new Chat(new Member("Daniel"), null);
        assertTrue(chat.getChatrooms().indexOf(chat.getChatroom()) ==
            0);
    }

    @Test
    public void testSetChatroom() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.createChatroom();
        chat.setChatroom(chat.getChatroom());
        assertTrue(chat.getChatrooms().indexOf(chat.getChatroom()) ==
            1);
        chat.setChatroom(0);
        assertTrue(chat.getChatrooms().indexOf(chat.getChatroom()) ==
            0);
    }

    @Test
    public void testGetChatroom() {
        Chat chat = new Chat(new Member("Daniel"), null);
        assertTrue(chat.getChatroom() != null);
    }

    @Test
    public void testAddUser() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.addUser(new Member("Bruce"));
        assertTrue(chat.getChatroom().getMembers().size() == 2);
    }

    @Test
    public void testLeaveChatroom() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.createChatroom();
        chat.leaveChatroom();
        assertTrue(chat.getChatrooms().indexOf(chat.getChatroom()) ==
            0);
    }

    @Test
    public void testPostComment() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.postComment("YO");
        assertTrue(chat.getChatroom().getComments().length() != 0);
        chat.createChatroom();
        chat.postComment("YO");
        assertTrue(chat.getChatroom().getComments().length() != 0);
    }

    @Test
    public void testAskQuestion() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.askQuestion("what?");
        assertTrue(chat.getQuestion() != null);
    }

    @Test
    public void testWithdrawQuestion() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.askQuestion("What?");
        chat.withdrawQuestion();
        assertTrue(chat.getQuestion() == null);
    }

    @Test
    public void testSetChatPrivilege() {
        Chat chat = new Chat(new Member("Daniel"), null);
        chat.setChatPrivilege(true);
        assertTrue(chat.getPrivilege());
    }

}
