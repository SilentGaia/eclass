package roster;

import java.util.*;

/**
 * A roster feature comes from the need of managing the classroom's attendees 
 * for the E-Class tool. The data component of the roster is a collecton of student objects. 
 * There are two operations involved - clicking on a student's question bubble 
 * if it arises, and another to assign a privilege on the roster.
 *
 * Students are imported from an external source. Assume Collection of students are filled. 
 */
public abstract class Roster {
   Collection <Student> students; 
   RosterQuestion currentQuestion;

   /** 
    * AddStudent adds a student to the collection of students. 
    *
    */
    /*@
     ensures 
      //
      // Student will end up in the roster
      //
      
      students.contains(student);
      
    @*/  
   abstract void addStudent(Student student);

   /** 
    * RemoveStudent removes a student to the collection of students. 
    *
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
   abstract void removeStudent(Student student);

   /**
    * GetQuestion retrieves the student's question as a String, and stores it 
    * into this.currentQuestion. (A question queue implementation). Makes the dialog box pop up too.
    *   
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
   abstract void getQuestion(Student student);
   
   /**
    * AssignPrivilege allows a student the ability to do something (privilege). 
    */
    /*@
     requires
       //
       // The student is in this.students.
       // Privilege has to contain a true boolean for one of the privileges.
       //
       
       students.contains(student)
         &&
       (privilege.canDraw == true || privilege.canChat == true || privilege.canAssign == true);
   
    @*/
   abstract void assignPrivilege(Student student, Privilege privilege);
   
   /**
    * RemovePrivilege removes a student's ability to do something. 
    */
    /*@
     requires
       //
       // The student is in this.students.
       // Privilege has to contain a false boolean for one of the privileges.
       //
       
       students.contains(student)    
         &&
       (privilege.canDraw == false || privilege.canChat == false || privilege.canAssign == false);
    
    @*/
   abstract void removePrivilege(Student student, Privilege privilege);
   
   /**
    * MarkAll checks all attendee's privilege to be on/off depending on the 
    *   parameter check. (Positive meaning check on, negative means check off) 
    */
    /*@
     requires 
       //
       // Privilege has to contain a true boolean for one of the privileges, if check is 1.
       // Privilege has to contain a false boolean for one of the privileges, if check is 0. 
       
       1 == check ? 
          ((privilege.canDraw == true) || (privilege.canChat == true) || (privilege.canAssign == true)) :
             ((privilege.canDraw == false) || (privilege.canChat == false) || (privilege.canAssign == false)); 
          
    @*/
   abstract void markAll(Privilege privilege, int check);
   
} 
