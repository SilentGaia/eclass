package eclasstool.model.layers;
import java.util.Collection;
import java.util.ArrayList;
import eclasstool.view.drawingtools.*;

/**
  * The LayersManager object consists of a list of Layers for a slide.  
  *
  * @author Tammy Kong (takong@calpoly.edu)
  * @version 20jan15
  *
  */
public class LayersManager {

	/**
	 * The collection of the current layer list being used
	 */
	private ArrayList<Layer> currentList;
	/**
 	 * The collection of public layers
 	 */
	private ArrayList<Layer> publicList;
	/**
 	 * The collection of private layers
 	 */
	private ArrayList<Layer> privateList;
	/**
	 * current Layer user is editing
	 */
	private Layer currLayer;
	/**
	 * Toolbox for the drawingtools.
	 */
	private DrawingToolsUI toolbox;

	/**
 	 * The constructor for the LayersManager Object taking in a DrawingToolsUI.
 	 */ 
	public LayersManager(DrawingToolsUI toolbox) {
		publicList = new ArrayList<Layer>();
		privateList = new ArrayList<Layer>();
		currentList = privateList;
		this.toolbox = toolbox;
		addLayer();
	}

	/**
	 * Adds a new layer to the collection of layers.
	 */
	/*@
		requires
                        //
			//layerList exists
			//
			(layerList != null);

		ensures
                        //
			//layerList consist of at least one Layer.
			//
			(layerList.size() >= 1) 
			&&
                        // 
			//The given Layer is in this.layerList
			//
			(layerList.contains(newLayer));
	@*/
	public void addLayer() {
		Layer newLayer = new Layer(toolbox);
		currentList.add(newLayer);
                currLayer = currentList.get(currentList.size() - 1);
		System.out.println("New Layer added to Collection. Collection size: " + currentList.size());
	}

	/**
	  * Deletes a layer from the collection of layers.
	  */
	/*@
		requires
		    //
		    //layerList exists
		    //
		    (layerList != null)

		    &&

		    //
		    //at least one Layer in layerList
		    //
		    (layerList.size() > 0)

		    &&

		    //
		    //The curLayer is in the layerList
		    //
		    (layerList.contains(curLayer));

		ensures
			//
			//Makes sure curLayer is removed from the layerList
			//
			(\forall Layer layer;
				layerList.contains(layer) <==>
					!layer.equals(curLayer) && \old(layerList).contains(layer));
    @*/
	public void deleteLayer() {
		if(currentList.remove(currLayer))
		{
			currLayer = null;
		}
	}

	/**
	 * Obtains the Layer the user is currently viewing. 
	 *
	 * @return the current Layer user is viewing
	 */
	public Layer getCurLayer() {
		System.out.println("In LayersManager.getCurLayer.");
		return currLayer;
	}

	/**
	 * Sets the currLayer to the Layer user wants to view.
	 *
	 * @param layerNdx index of the Layer user wants to view
	 */

        /*@
                requires
                //
                //layerNdx exists
                //
                (layerNdx != null);
        @*/
	public void setCurLayer(int layerNdx) {
		System.out.println("In LayersManager.setCurLayer.");
		currLayer = currentList.get(layerNdx);
	}

        /**
         * Gets the size of the currently selected list
         * @return Returns the size of the currently selected list
         */ 
	public int getListSize() {
		return currentList.size();
	}
	
        /**
         * Resets the currently selected list.
         * @param isPublic True if public list is selected, else false
         */ 
	public void setList(boolean isPublic)
	{
		if(isPublic)
		{
			currentList = publicList;
		}
		else
		{
			currentList = privateList;
		}
	}
}
