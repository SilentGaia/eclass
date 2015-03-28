package eclasstool.model.layers;

import java.util.ArrayList;
import java.util.Collection;

import eclasstool.model.drawingtools.*;
import eclasstool.view.drawingtools.*;
import eclasstool.view.drawingtools.DrawingToolsUI;

/**
  * The Layer is the implementation of one layer 
  * in the LayersManager window for the E-Classroom.
  *
  * @author Tammy Kong (takong@calpoly.edu)
  * @version 20jan15
  *
  */
public class Layer {
    /**
     * Boolean for whether or not visibility is on.
     */
    private boolean visibility;
    /**
     * The percentage of ink pacity.
     */
    private int inkOpacity;
    /**
     * The percentage of background opacity.
     */
    private int bkgOpacity;
    /**
     * Reference to Drawing to obtain tools to draw, write text, take notes on slide.
     */
    public DrawingToolsUI toolbox;
    /**
     * Collection of Canvas for holding the drawings made by the drawing tools
     */ 
    public ArrayList<CanvasPanel> drawings;

    /**
     * Constructs a Layer with default settings.
     */
    public Layer(DrawingToolsUI toolbox) {
	this.toolbox = toolbox;
	drawings = new ArrayList<CanvasPanel>();
        DrawingCanvas canvas = new DrawingCanvas();
        DrawingToolBar toolbar = this.toolbox.getToolBar();
	drawings.add(new CanvasPanel(toolbar, canvas));
		
        visibility = true;
        inkOpacity = 100;
        bkgOpacity = 0;
    }  

    /**
      * Adjust background opacity for specific layer.
      * @param newOpacity the new percentage the user wants the BKG slider to be at
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
    public void adjustBKG(int newOpacity) {
        System.out.println("In Layer.adjustBKG.");
        bkgOpacity = newOpacity;
	System.out.println("Background Opacity changed to " + bkgOpacity);
    }

    /**
      * Adjust ink opacity for specific layer.
      * @param newOpacity the new percentage the user wants the Ink slider to be at
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
    public void adjustInk(int newOpacity) {
        System.out.println("In Layer.adjustInk.");
        inkOpacity = newOpacity;
	System.out.println("Ink opacity is changed to " + inkOpacity);
    }

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
    public void changeVisibility() {
       System.out.println("In Layer.changeVisibility.");
       if(visibility)
          visibility = false;
       else
          visibility = true;
       System.out.println("Visibility is changed");
    }

    /**
     * Returns the visibility of Layer
     * @return Returns true if layer is visible, else false
     */ 
    public boolean getVisibility() {
        return visibility;
    }

    /**
     * Returns the ink opacity of Layer
     * @return Returns the value of the ink opacity
     */ 
    public int getInkOpacity() {
        return inkOpacity;
    }

    /**
     * Returns the background opacity of Layer
     * @return Returns the value of the background opacity
     */ 
    public int getBkgOpacity() {
        return bkgOpacity;
    }
    
    /**
     * If layer is the first on the list, sets the drawing visible.
     * @param b True if first layer, else false
     */ 
    public void setFirstLayerVisible(boolean b)  {
    	drawings.get(0).setVisible(b);
    }
}
