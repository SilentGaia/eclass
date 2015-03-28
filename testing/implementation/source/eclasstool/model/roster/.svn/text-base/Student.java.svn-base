package eclasstool.model.roster;

/**
 * A student class contains the privileges a student has,
 * the name of the student, his/her attendance status, and
 * a question's class for his/her questions.  
 *
 * @author Eric Tran (etran04@calpoly.edu)
 *
 */
public class Student implements Comparable<Student>
{
    /**
     * The name of the student.
     */
    private String name; 
    
    /**
     * Information regarding the student's attendance.
     */
    private AttendanceStatus attending;
    
    /**
     * Information regarding the privileges of the student. 
     */
    private Privilege privileges;
    
    /**
     * Data representing a student's question. 
     */
    private RosterQuestion rosterQ; 

    /**
     * Default constructor for the Student class. 
     */ 
    public Student(String name, AttendanceStatus attending, Privilege privilege)
    {
        this.name = name;
        this.attending = attending;
        this.privileges = privilege;
        this.rosterQ = new RosterQuestion(name, null); //tempoary, not working on for this milestone
    }

    /**
     * Gets the attendance status.
     */
    public AttendanceStatus getAttending()
    {
        return attending;
    }
    
    
    /**
     * Gets the name of the student.
     * @return the name of the student
     */
    /*@
    requires 
    // 
    // Student's name should never be empty.
    //

    (name.length() != 0) && (name.matches("[a-zA-Z ]*\\d+.*"));

    @*/
    public String getName()
    {
        return name;
    }

    /**
     * Sets a privilege of the student.
     * @param flag the new value to change to
     * @check which privilege needs to be changed
     */ 
    public void setPrivilege(boolean flag, int check)
    {
        // Can chat
        if (check == Privilege.kChat)
        {
            privileges.setCanChat(flag);
        }
        // Can draw
        else if (check == Privilege.kDraw)
        {
            privileges.setCanDraw(flag);
        }
        // Can assign 
        else if (check == Privilege.kAssign)
        {
            privileges.setCanAssign(flag);
        }

        System.out.println(toString());
        System.out.println("------------");
    }

    /**
     * Gets the student's privileges.
     * @param check privilege to check for
     */
    public boolean getPriv(int check)
    {
        boolean priv = false;
        // Can chat
        if (check == Privilege.kChat)
        {
            priv = privileges.getChat();
        }
        // Can draw
        else if (check == Privilege.kDraw)
        {
            priv = privileges.getDraw();
        }
        // Can assign 
        else if (check == Privilege.kAssign)
        {
            priv = privileges.getAssign();
        }
        
        return priv;
    }
    
    /**
     * Gets the students privielge.
     */
    public Privilege getPrivilege()
    {
        return privileges; 
    }
    
    /**
     * Sets the student's roster question.
     * @param rosterQ the question to be saved to the student
     */
    public void setRosterQ(RosterQuestion rosterQ)
    {
        this.rosterQ = rosterQ;
    }

    /**
     * Gets the student's roster question.
     * @return the student's roster question
     */
    public RosterQuestion getRosterQ()
    {
        return rosterQ;
    }

    /**
     * Gets the string representation of a student. 
     * @return a string that represents the student 
     */
    public String toString()
    {
        String answer = 
            "Name: " + name + "\n" +
            "Attending: " + attending.getAttended() + "\n" + 
            "Privilege: " + privileges.toString() + "\n" + 
            "Roster Q: " + rosterQ.toString() + "\n";
        return answer;
    }
    
    public int compareTo(Student student)
    {
        if (!this.rosterQ.toString().equals("N/A") && student.getRosterQ().toString().equals("N/A"))
        {
            return -1;
        }
        else
        {
            // If both attending, compare their names 
            if ((attending.getAttended() && student.getAttending().getAttended()) ||
                (!attending.getAttended() && !student.getAttending().getAttended()))
            {
                // both here
                return this.name.compareTo(student.getName());
            }
            else 
            {
                // Other student is higher ranked
                if (student.getAttending().getAttended())
                {
                    return 1;
                }
                else
                {
                    // This student is higher ranked 
                    return -1; 
                }
            }
        }
    }
}