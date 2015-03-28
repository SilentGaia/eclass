package eclasstool.model.roster;

import eclasstool.model.chat.RemoteChat;
import java.util.*;

/** 
 * Class Roster is the model class for the main EClass Roster UI handling.  
 * It contains methods for mananging the classroom's attendee. 
 * The data component of the roster is a collecton of student objects. 
 * There are two operations involved - clicking on a student's question bubble 
 * if it arises, and another to assign a privilege on the roster.
 *
 * Students are imported from an external source. Assume Collection of students are filled. 
 *
 * @author Eric Tran (etran04@calpoly.edu)
 *
 */
public class RosterModel extends Observable
{
    /**
     *  List of students currently enrolled in the class.
     */
    private ArrayList<Student> students; 
    
    /**
     * Current question pulled from the top of the question queue.
     */
    private RosterQuestion currentQuestion;

    /**
     * Represents whether or not all the privileges should be cleared.  
     */
    private boolean clearMark;
    
    /**
     * Flag for determining when the user wants to see the question
     */
    private boolean questionReady;

    /**
     * Stub for grabbing the server's logged in students.
     */
    private RemoteChat stub;
    
    /**
     * Default constructor for model of a roster. 
     */
    public RosterModel(RemoteChat stub) 
    {
        this.students = new ArrayList<Student>();
        Collections.sort(this.students);
        currentQuestion = null; 
        questionReady = false; 
        this.stub = stub;
    }

    /** 
     * AddStudent imports students to the collection of students. 
     * @param roster the student roster to be imported
     */ 
     /*@
      requires 
       //
       // New list of students is no null
       //
       
       roster != null;
       
      ensures 
       //
       // Student will end up in the roster
       //
       
       students.contains(student);

     @*/  
    public void addStudents(ArrayList<Student> roster)
    {
        students = roster;
        Collections.sort(this.students);
    }
    
    /**
     * Gets the list of students currently in the roster.
     * @returns the list of students in the roster
     */
     /*@
      ensures 
       //
       // List of students returned will not be null. 
       // 
       
       students != null; 
  
     @*/  
    public ArrayList<Student> getListStudents()
    {
        Collections.sort(students);
        return students;
    }
    
    /**
     * Helper method for getting the index of the student given his/her name. 
     * @param name student to be searched for 
     */
    public int getStudentIndexByName(String name)
    {
        int counter = 0;;
        for (Student student: students)
        {
            if (student.getName().equals(name))
            {
                return counter; 
            }
            counter++;
        }
        return -1; 
    }
    
    /**
     * Helper method for changing a student's attendance after logging in. 
     * @param studentName student who just logged in 
     */
    public void changeStudentAttended(String studentName)
    {
        Student student = students.get(getStudentIndexByName(studentName)); 
        student.getAttending().setAttended(true);

        try {
            stub.addLogin(studentName);
        }
        catch (Exception err) {
            err.printStackTrace();
        }

        setChanged();
        notifyObservers();
    }
    
    /**
     * Gets the student at a specific position of the list.
     * @param index the index of the student to be retreived
     * @returns the Student at the specified index.
     */
     /*@
      requires
       //
       // There is a student at index
       //
       
       students.get(index) != null;
   
     @*/  
    public Student getStudent(int index)
    {
        return students.get(index);
    }

    /** 
     * RemoveStudent removes a student to the collection of students. 
     * @param student The student to be removed from the class
     */
     /*@
      requires 
       //
       // At least one student in the roster
       //
       
       students.isEmpty() != true;
      
      ensures 
       //
       // Student will not be in the roster
       //  
       
       !students.contains(student);
  
     @*/ 
    public void removeStudent(Student student)
    {
        System.out.println("In RosterModel.removeStudent");
    }

    /**
     * GetQuestion retrieves the student's question as a RosterQuestion.
     * @return RosterQuestion The question to be sentto the dialog.   
     */
     /*@
      requires
       // 
       // The student is in the this.students.
       // The student has a question.
       //
       
       students.contains(student)
         &&
       (student.rosterQ.question.length() != 0);
    
     @*/
    public RosterQuestion getQuestion()
    {
        currentQuestion = students.get(0).getRosterQ();
        return currentQuestion;
    }

    /**
     * AssignPrivilege allows a student the ability to do something (privilege). 
     *
     * @param index index of the student privilege is being assigned to
     * @param check the privilege being changed
     */
     /*@
      requires
       //
       // The student is in this.students.
       // The Privilege being changed is one of the allowed Privileges
       //
       
       students.get(index) != null;
         &&
       (Privilege.kDraw == check || Privilege.kChat == check || Privilege.kAssign == check);
   
     @*/
    public void changePrivilege(int index, int check)
    {
        if (students.get(index-1).getPriv(check))
        {
            students.get(index-1).setPrivilege(false, check);
        }
        else
        {
            students.get(index-1).setPrivilege(true, check);
        }
        
        try 
        {
            boolean[] vals = new boolean[3];
            vals[0] = students.get(index-1).getPriv(Privilege.kChat);
            vals[1] = students.get(index-1).getPriv(Privilege.kDraw);
            vals[2] = students.get(index-1).getPriv(Privilege.kAssign);

            stub.setLastModStudent(students.get(index-1).getName());
            stub.setPriv(vals);
        }
        catch (Exception err) {
            err.printStackTrace();
        }

        setChanged();
        notifyObservers();
    }

    /**
     * SetAllPriv assigns a student a specific set of privileges. 
     * @param index Index of the student to change.
     * @param chat the new value of chat
     * @param draw the new value of draw
     * @param assign the new value of assign
     */
    public void setAllPriv(int index, boolean chat, boolean draw, boolean assign)
    {
        students.get(index).setPrivilege(chat, Privilege.kChat);
        students.get(index).setPrivilege(draw, Privilege.kDraw);
        students.get(index).setPrivilege(assign, Privilege.kAssign);
        setChanged();
        notifyObservers();
    }

    /**
     * MarkAll checks all attendee's privilege to be on/off depending on the 
     *   parameter check. (Positive meaning check on, negative means check off) 
     * @param newValue the new value to change to  
     * @param check the identifier for which privilege to change
     */
     /*@
      requires 
       //
       // New Value for privilege is true or false.
       // Check is a possible privilege. 
       //
       
       (newValue != null) && (check == Privilege.kChat || check == Privilege.kDraw
           || check == Privilege.kAssign );
          
     @*/
    public void markAll(boolean newValue, int check)
    {
        for (Student student: students)
        {
            student.setPrivilege(newValue, check);
        }
        setChanged();
        notifyObservers();
    }

    /**
     * Gets the string representation of the list of students.
     * @return string representation of roster
     */
    public String toString()
    {
        String answer = "Roster size: " + students.size() + "\n\n" +
            "Student names: \n";
        for (Student stud: students)
        {
            answer += stud.getName() +"\n";
        }
        return answer;
    }
    
    /**
     * Sets the model so that the question is ready to be extracted
     * @param flag state of whether question is ready to be answered
     */
    public void setQuestionReady(boolean flag)
    {
        questionReady = flag; 
        setChanged();
        notifyObservers();
    }
    
    /**
     * Gets the flag indicating whether question is ready to be pulled. 
     * @return whether question is readyto be answered 
     */ 
    public boolean getQReady()
    {
        return questionReady;
    }
} 
