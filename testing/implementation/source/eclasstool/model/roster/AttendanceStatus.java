package eclasstool.model.roster;

/** 
 * The AttendanceStatus indicates whether a student 
 * is present in the class and whether or not they
 * have a question for the instructor.
 *
 * @author Eric Tran (etran04@calpoly.edu)
 * 
 */ 
public class AttendanceStatus 
{
    boolean attended;
    boolean hasAQuestion;

    /**
     * Default constructor of an AttendanceStatus. 
     */
    public AttendanceStatus()
    {
        attended = false;
        hasAQuestion = false;
    }

    /**
     * Gets the attendance status currently stored.
     * @return whether or not attended
     */
    public boolean getAttended()
    {
        return attended;
    }
    
    /**
     * Sets an attendance.
     */
    public void setAttended(boolean flag)
    {
        attended = flag;
    }
}