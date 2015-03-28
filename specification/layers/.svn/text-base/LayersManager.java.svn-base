package layers;
import java.util.Collection;

/**
  * The LayersManager object is derived from 
  * the main view of Section 2.5.2 of the requirements.
  * LayerManager is the list of Layer for a slide.  
  */
public abstract class LayersManager {

	/**
	 * The collection of Layer
	 */
	Collection<Layer> layerList;

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
	abstract void addLayer(Layer newLayer);

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
	abstract void deleteLayer(Layer curLayer);
}
