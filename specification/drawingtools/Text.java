package drawingtools;
/**
 * Text is the implementation of the text tool for the E-classroom for use directly on the lecture slide's canvas.
 */
public abstract class Text  {
    final static int CANVASHEIGHT = 1000;
    final static int CANVASWIDTH = 1000;
    /**
     * Text in the text area.
     */
    String text;
    /**
     * The font of the text.
     */
    String font;
    /**
     * Size of the text.
     */
    int textSize;
    /**
     * Boolean for whether or not the text is highlighted.
     */
    boolean highlightText;
    /**
     * Hexidecimal for text color.
     */
    int textColor;
    /**
     * The X position of the textbox's upper left hand corner.
     */
    int x_pos;
    /**
     * The Y position of the textbox's upper left hand corner.
     */
    int y_pos;
    /**
     * Set height of the text area.
     */
     int setHeight;
    /**
     * Set width of the text area.
     */
     int setWidth;

    /**
     * Implements the functionality to change the font to the font given as the parameter.
     */
     /*@
       requires
         //
         // Font needs to exist.
         //
         font != null;
      @*/
     abstract void changeFont(String Font);

     /**
      * Implements the functionality to change the size of the text.
      */

     /*@
       requires
         //
         // Size needs to be greater than 1.
         //
         size >= 1;
      @*/
    abstract void changeSize(int size);
    
    /**
     * Handles mouse click in order to move the text to the new x and y positions.
     */
    /*@
      requires
         //
         // New x and y positions have to be within the canvas range.
         //
         x_pos >= 0 && x_pos <= CANVASWIDTH && y_pos >= 0 && y_pos <=
         CANVASHEIGHT;
      @*/
    abstract void changePosition(int x_pos, int y_pos);

    /**
     * Modifies the set height for the text area.
     */
    
    /*@
      requires
         //
         // New height has to be within canvas size.
         //
         height > 0 && height < CANVASHEIGHT;
      @*/
    abstract void modifySetHeight(int height);
    /**
     * Modifies the set width for the text area.
     */
    /*@
      requires
         //
         // New width has to be within canvas size.
         //
         width > 0 && width < CANVASWIDTH;
      @*/
     abstract void modifySetWidth(int width);
}
