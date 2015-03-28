package eclasstool.model.roster;

import javax.swing.JFrame;
import java.util.*;

/** 
 * Class Roster Question is the model class for the EClass roster question handling. 
 * It contains methods for operations deal with resolving the question. 
 * It will contain a string representing the question, a string 
 * to represent the name of the author, and a boolean to represent 
 * whether or not it has been answered.
 *
 * @author Eric Tran (etran04@calpoly.edu)
 *
 */
public class RosterQuestion extends Observable
{
    /** 
     * Represents the question.
     */
    private String question;
    /**
     * The student's name.
     */
    private String studentName;
    /**
     * Wehther or not this question has been answered. 
     */
    private boolean resolvedFlag;

    /**
     * Default constructor of a Roster Question 
     */
    public RosterQuestion(String name, String userQ) 
    {
        if (userQ == null)
        {
            question = "N/A";
        }
        else
        {
            question = userQ;
        }
        studentName = name;
        resolvedFlag = false; 
    }

    /**
     * ResolveQuestion closes the question dialog box and turns 
     * the resolvedFlag true. 
     */
     /*@
      requires 
       // 
       // The resolved flag is already false before. 
       //

       this.resolvedFlag == false; 

     @*/
    public void resolveQuestion(JFrame dialog) 
    {
        question = "N/A";
        resolvedFlag = true; 
        dialog.setVisible(false);
        
        setChanged();
        notifyObservers();
    }

    /**
     * Gets the flag determining whether or not a question has been resolved.
     * @return whether or not rosterQ is resolved
     */
    public boolean getResolved()
    {
        return resolvedFlag;
    }
    
    /**
     * ResolveQuestion hides the question dialog box.
     * @param dialog the dialog from which this came from 
     */
    /*@
     requires 
      // 
      // The resolved flag is already false before. 
      //

      this.resolvedFlag == false; 

     @*/
    public void ignoreQuestion(JFrame dialog) 
    {
        dialog.setVisible(false);
    }

    /**
     * Gets the student name associated with this question.
     * @return name of student from dialog
     */
    public String getStudentName()
    {
        return studentName;
    }
    
    /**
     * Gets the string representation of the roster question.
     * @return the question as a string 
     */
    public String toString()
    {
        return question;
    }
}