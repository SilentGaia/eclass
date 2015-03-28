package drawingtools;

/**
 * Note is an implementation of the tool used to add notes to the lecture slides for the E-classroom.
 */
public abstract class Note  {
    final static int CANVASHEIGHT = 1000;
    final static int CANVASWIDTH = 1000;
    /**
     * Set height for the note.
     */
    int height;
    /**
     * Set width for the note.
     */
    int width;
    /**
     * X position of the upper left hand corner of the note.
     */
    int x_pos;
    /**
     * Y position of the uppper left hand corner of the note.
     */
    int y_pos;
    /**
      * Text for the note.
      */
    java.lang.String text;
    /**
     * Handles the mouse clicks and drags to move the note.
     */
    /**
      * Set color for the background of the note.
      */
    int color;
    /*@
      requires 
         //
         // The new x and y positions are within the canvas size.
         //
         x_pos >= 0 && x_pos <= CANVASWIDTH && y_pos >= 0 && y_pos <= CANVASHEIGHT;
     
    @*/
    abstract void moveNote(int x_pos, int y_pos);
    /** 
     * Implements the functionality to add text to the note. 
     */
    /*@
      requires
         //
         // Text does not already exist.
         //
         this.text != null && text != null;
    @*/
    abstract void addText(String text); 

    /**
     * Allows the functionality to change the background color of the note.
     */
    /*@
      requires 
         //
         // The new color exists.
         //
         color >= 0;
    @*/
    abstract void changeBG(int color);

    /**
     * Modifies the set height for the note.
     */
    /*@
      requires 
         //
         // The new height is not equal to 0 or greater than the canvas
         // height.
         //
         height != 0 && height <= CANVASHEIGHT;
    @*/
    abstract void modifySetHeight(int height); 
    
    /**
     * Modifies the set width for the note. 
     */
    /*@
      requires
         //
         // The new width is not equal to 0 or greater than the canvas
         // height.
         //
         width != 0 && width <= CANVASHEIGHT;
    @*/
    abstract void modifySetWidth(int width); 
}
