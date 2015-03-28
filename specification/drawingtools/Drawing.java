package drawingtools;
/**
 * Drawing is an implementation of the tool used to draw on the lecture slides for the E-classroom.
 */
public abstract class Drawing  {
   /**
     * List of Shapes that compose the Drawing.
     */
   java.util.List <Shape> drawing;
   
   /**
     * Adds the shape to the List and returns true if the shape is successfully
     * added, else, returns False.
     */
   /*@
      requires
         //
         // The shape being added has to exist.
         //
         shape != null;
      ensures
         //
         // Returns true if the shape was added, returns false if the shape was
         // not added.
         //
      (\result == (shape != null));
   @*/
   abstract boolean addShape(Shape shape);
   
   /**
     * Deletes the shape from the List.
     */
   /*@
      requires 
      //
      // The shape being deleted has to exist.
      //
      shape != null;
   ensures
      //
      // The shape is deleted if it is found in the list of shapes.
      //
      drawing.contains(shape);
   @*/
   abstract void deleteShape(Shape shape);
}
