/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclasstool.view.presentation;

import javax.swing.*;
import java.awt.Component;
import java.awt.Color;
import javax.swing.border.*;

public class PresentationListCellRenderer implements ListCellRenderer {
    
    //public CustomListCellRenderer()
    //{
    //    setOpaque(true);
    //    setHorizontalAlignment(CENTER);
    //    setVerticalAlignment(CENTER);
    //}
    
    public Component getListCellRendererComponent(JList jList, 
                                                  Object value, 
                                                  int cellIndex, 
                                                  boolean isSelected, 
                                                  boolean cellHasFocus) {

        JPanel renderer = (JPanel) value;
	Border blueBorder = BorderFactory.createLineBorder(Color.BLUE);
	Border whiteBorder = BorderFactory.createLineBorder(Color.WHITE);
        
        if(isSelected) {
            renderer.setBorder(blueBorder);
        }
        else {
            //renderer.setBackground(jList.getBackground());
            renderer.setBorder(whiteBorder);
	}
        

	//if(renderer.getVisibility() == false) {
	    renderer.setBackground(Color.GRAY);
	//}
	//else {
	//    renderer.setBackground(Color.WHITE);
	//}
	
	renderer.updateUI(); 
        return renderer;


    }
}
