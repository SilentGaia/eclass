package eclasstool.tests.chat;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.chat.*;

public class ChatQuestionTest {

    @Test
    public void test() {
        ChatQuestion question = new ChatQuestion("What happen?");
        assertEquals("What happen?", question.getQuestion());
    }

}
