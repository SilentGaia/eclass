package eclasstool.tests.roster;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.roster.*;

public class StudentTest {

	@Test
	public void testStudent()
   {
       Student stud = new Student("Name", new AttendanceStatus(), new Privilege());
       assertNotNull(stud);
	}
   
   @Test
   public void testGetAttending()
   {
       Student stud = new Student("Name", new AttendanceStatus(), new Privilege());
       assert(!stud.getAttending().getAttended());
   }

   @Test
   public void testGetName()
   {
       Student stud = new Student("Jo", new AttendanceStatus(), new Privilege());
       assertEquals("Name should be 'Jo'", "Jo", stud.getName());
   }
   
   @Test
   public void testGetPriv()
   {
       Student stud = new Student("Jo", new AttendanceStatus(), new Privilege());
       assert(!stud.getPriv(Privilege.kChat));
       assert(!stud.getPriv(Privilege.kAssign));
       assert(!stud.getPriv(Privilege.kDraw));
   }
   
   @Test 
   public void testGetRosterQ()
   {
       Student stud = new Student("Jo", new AttendanceStatus(), new Privilege());
       assertEquals("Student's question is 'N/A'", "N/A", stud.getRosterQ().toString());
   }

   @Test 
       public void testSetRosterQ()
    {
	assert(true);
    }
 
    @Test
	public void testGetPrivilege()
    {
	Student stud = new Student("Jo", new AttendanceStatus(), new Privilege());
	assertNotNull(stud.getPrivilege());
    }

    @Test
	public void testToString()
    {
	Student stud = new Student("Jo", new AttendanceStatus(), new Privilege());
	assertNotNull(stud.toString());
    }
}
