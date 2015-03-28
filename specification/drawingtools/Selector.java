package drawingtools;
/**
 * Selector is an implementation of the Selector tool used to select objects on the lecture slides.
 */
public abstract class Selector  {
    final static int CANVASHEIGHT = 1000;
    final static int CANVASWIDTH = 1000;
    /**
     * Set width for the selection area.
     */
    int setWidth;
    /**
     * Set height for the selection area.
     */
    int setHeight;
    /**
     * The X position for the upper left hand corner of the selection area.
     */
    int x_pos;
    /**
     * The Y position for the upper left hand corner of the selection area.
     */
    int y_pos;

    /**
     * Modifies the set height for the selector tool.
     */
    /*@
      requires
         //
         // Height is within the canvas's range
         //
         height >= 0 && height <= CANVASHEIGHT;
    @*/
    abstract void modifySetHeight(int height); 
    
    /**
     * Modifies the set width for the selector tool.
     */
    /*@
      requires
         //
         // Width is within the canvas's range
         //
         width >= 0 && width <= CANVASWIDTH;
     @*/
    abstract void modifySetWidth(int width);
    
    /**
     * Implements the functionality to select the whole canvas.
     */
    abstract void selectAll(); 
}
