package eclasstool.view.layers;

import javax.swing.*;
import java.awt.Component;
import java.awt.Color;
import javax.swing.border.*;

/**
 *
 * This class help generates the LayerUI into the LayerManagerUI list.
 *
 * @author Tammy Kong
 */
public class CustomListCellRenderer implements ListCellRenderer {
    
    
       /**
        * Takes in the LayerUI and generate to the given jList
        *
        * @param jList The list that the LayerUI will be added to
        * @param value The LayerUI that will be added into the jList
        * @param cellIndex The index that the LayerUI will be added to jList
        * @param isSelected Boolean to decide if the index is selected or not
        * @param cellHasFocus Boolean to decide if LayerUI is focus or not
        *
        * @return Returns the rendered LayerUI
        */ 
       public Component getListCellRendererComponent(JList jList, 
                                                  Object value, 
                                                  int cellIndex, 
                                                  boolean isSelected, 
                                                  boolean cellHasFocus) {

        LayerUI renderer = (LayerUI) value;
	Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);
	Border whiteBorder = BorderFactory.createLineBorder(Color.WHITE);
        
        if(isSelected) {
            renderer.setBorder(blueBorder);
        }
        else {
            //renderer.setBackground(jList.getBackground());
            renderer.setBorder(whiteBorder);
	}
        

	if(renderer.getVisibility() == false) {
	    renderer.setBackground(Color.GRAY);
	}
	else {
	    renderer.setBackground(Color.WHITE);
	}
	
	renderer.updateUI(); 
        return renderer;


    }
        

}
