package roster;

/** 
 * Question represents a question object.
 * It will contain a string representing the question, a string 
 * to represent the name of the author, and a boolean to represent 
 * whether or not it has been answered.
 */
abstract class RosterQuestion {
   String question;
   String studentName; 
   boolean resolvedFlag;
   
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
   abstract void resolveQuestion();
}