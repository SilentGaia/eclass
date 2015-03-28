import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import eclasstool.tests.chat.*;
import eclasstool.tests.roster.*;
import eclasstool.tests.drawingtools.*;
import eclasstool.tests.layers.*;
import eclasstool.tests.presentation.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ChatQuestionTest.class,
    ChatroomTest.class,
    ChatTest.class,
    MemberTest.class,
    CircleNodeTest.class,
    PointNodeTest.class,
    RectangleNodeTest.class,
    ColorNodeTest.class,
    //LayersManagerTest.class,
    //LayerTest.class,
    PresentationTest.class,
    RosterModelTest.class,
    StudentTest.class,
    DrawingCanvasTest.class,
    LineEdgeTest.class
})
public class JUnitTestSuite {   
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}   
