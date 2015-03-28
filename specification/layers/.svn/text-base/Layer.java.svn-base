package layers;

import java.util.Collection;
import drawingtools.*;
/**
  * The Layer is the implementation of one layer 
  * in the Layers window for the E-Classroom.
  */
public abstract class Layer {

    /**
     * Boolean for whether or not visibility is on.
     */
    boolean visibility;

    /**
     * The percentage of ink pacity.
     */
    int inkOpacity;

    /**
     * The percentage of background opacity.
     */
    int bkgOpacity;

    /**
     * Reference to Drawing needed to draw, write text, take notes on slide.
     */
    Drawing draw; 

    /**
     * Constructs a Layer with default settings.
     */
    Layer() {
        visibility = true;
        inkOpacity = 100;
        bkgOpacity = 0;
    }  

    /**
      * Adjust background opacity for specific layer.
      */
    /*@
        requires
            //
            //newOpacity must be greater than or equal to zero
            //and must be less than or equal to one hundred.
            //
            (newOpacity >= 0 && newOpacity <= 100);

        ensures
            //
            //Makes sure bkgOpacity is changed.
            //
            (this.bkgOpacity == newOpacity); 
    @*/
    abstract void adjustBKG(int newOpacity);

    /**
      * Adjust ink opacity for specific layer.
      */
    /*@ 
        requires
            //
            //newOpacity must be greater than or equal to zero
            //and must be less than or equal to one hundred.
            //
            (newOpacity >= 0 && newOpacity <= 100);
        
        ensures
            //
            //Makes sure bkgOpacit is changed.
            //
            (this.inkOpacity == newOpacity);
    @*/
    abstract void adjustInk(int newOpacity);

    /**
      * Changes the visbility of a specific layer.
      */
    /*@
        ensures
            //
            //The visibility boolean has changed.
            //
            visibility != \old(visibility);
    @*/ 
    abstract void changeVisbility();
}
