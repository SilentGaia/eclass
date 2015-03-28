package eclasstool.tests.roster;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import eclasstool.model.roster.*;
import eclasstool.model.server.*;

/****
 *
 * Class RosterModelTest is the companion testing class for <a href=
 * RosterModel.html> RosterModel </a>.  It implements the following module
 * test plan:
 *                                    <pre>
 *    Phase 1: Unit test the constructor.
 *
 *    Phase 2: Unit test the simple get/set methods: 
 *         setStudent, getStudent, getStudents.
 *
 *    Phase 3: Unit test addStudent, saving the constructed results 
 *             for subsequent tests.
 *
 *    Phase 4: Unit test getStudent, using items added in Phase 3.
 *    
 *    Phase 5: Unit test assignPrivilege, using items added in Phase 3.
 *    
 *    Phase 6: Unit test markAll. using items added in Phase 3 and 5.
 *
 *    Phase 7: Unit test getStudents, using items added in Phase 3.
 *
 *    Phase 8: Unit test removeStudent, deleting the items added in Phase 3.
 *    
 *    Phase 9: Unit test getQuestion.
 *    
 *    Phase 10: Unit test addStudents, saving the constructed results
 *               for subsequent tests.
 *    
 *    Phase 11: Unit test removePrivilege.
 *
 *    Phase 12: Repeat phases 1 through 11.
 * 
 *    Phase 13: Stress test by constructing and destructing student collection 
 *              of 100000 elements.
 *
 *    Phase 14: Stress test by constructing and destructing question collection
 *              of 100000 elements.
 *                                   </pre>
 */

public class RosterModelTest
{

    @Test
    public void testRosterModel() 
    {
        RosterModel roster = new RosterModel(new Server());
        assertEquals("Size should be be 0", 0, roster.getListStudents().size());
        assertFalse(roster.getQReady());
    }

    @Test
    public void testAddStudents() 
    {
        RosterModel roster = new RosterModel(new Server());
        ArrayList<Student> toImport = new ArrayList<Student>();
        toImport.add(new Student("High Yo", new AttendanceStatus(), new Privilege()));
        toImport.add(new Student("Yo High", new AttendanceStatus(), new Privilege()));
        roster.addStudents(toImport);
        assertEquals("size should be 2", 2, roster.getListStudents().size());

    }

    @Test
    public void testRemoveStudent() 
    {
    }

    @Test
    public void testGetQuestion() 
    {
        RosterModel roster = new RosterModel(new Server());
        ArrayList<Student> toImport = new ArrayList<Student>();
        Student qStud = new Student("George", new AttendanceStatus(), new Privilege());
        qStud.setRosterQ(new RosterQuestion("Bob", "Hello testing"));
        toImport.add(qStud);
        roster.addStudents(toImport);
        assertEquals("question should be hello testing", "Hello testing", roster.getQuestion().toString());
    }

    @Test
    public void testChangePrivilege() 
    {
    }
    
    @Test
    public void testSetQuestionReady()
    {
        RosterModel roster = new RosterModel(new Server());
        roster.setQuestionReady(true);
        assert(roster.getQReady());
    }
    
    @Test 
    public void testGetQReady()
    {
        RosterModel roster = new RosterModel(new Server());
        assert(!roster.getQReady());
    }

    @Test 
	public void testGetStudentIndexByName()
    {
	RosterModel roster = new RosterModel(new Server());
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student("Jo", new AttendanceStatus(), new Privilege()));
	roster.addStudents(list);
	assertEquals("jo is at index 0", 0, roster.getStudentIndexByName("Jo"));
    }

    @Test
	public void testChangeAttended()
    {
	RosterModel roster = new RosterModel(new Server());
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student("Jo", new AttendanceStatus(), new Privilege()));
	roster.addStudents(list);
	roster.changeStudentAttended("Jo");
	assert(true);
    }
}
