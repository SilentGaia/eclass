/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclasstool.view.layers;

import javax.swing.*;
import eclasstool.view.presentation.*;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import eclasstool.model.layers.*;
import eclasstool.view.drawingtools.*;
/**
 * The Class LayerManagerUI is the main frame of the EClass Layer Manager.
 *
 * @author Tammy Kong (takong@calpoly.edu)
 * @version 20jan15
 */
public class LayerUI extends javax.swing.JPanel {
    
    /**
     * Creates new form LayerUI
     */
    public LayerUI(DrawingToolsUI toolbox, Layer layer, SlideUI slide, int num) {
        this.number = num;
        initComponents();
        this.layer = layer;
        this.toolbox = toolbox;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slideImage = new javax.swing.JPanel();
        layerNumber = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(343, 100));

        slideImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout slideImageLayout = new javax.swing.GroupLayout(slideImage);
        slideImage.setLayout(slideImageLayout);
        slideImageLayout.setHorizontalGroup(
            slideImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        slideImageLayout.setVerticalGroup(
            slideImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        layerNumber.setText("Layer " + number);
	
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(slideImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(layerNumber)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(layerNumber)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean getVisibility() {
        return layer.getVisibility();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel layerNumber;
    private javax.swing.JPanel slideImage;
    // End of variables declaration//GEN-END:variables
    private int number;
    private Layer layer;
    private DrawingToolsUI toolbox;
     

}