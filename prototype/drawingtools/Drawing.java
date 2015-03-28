/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingtools;
import javax.swing.*;
/**
 *
 * @author Carmen
 */
public class Drawing extends javax.swing.JFrame {

    /**
     * Creates new form Drawing
     */
    public Drawing() {
        initComponents();

        color = new ColorSwatch();
        color.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brushSize = new javax.swing.JComboBox();
        colorSwatch = new javax.swing.JButton();
        brush = new javax.swing.JToggleButton();
        eraser = new javax.swing.JToggleButton();

        brushSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "20", "25", "30", "35", "40", "45", "50", "75", "100" }));
        brushSize.setPreferredSize(new java.awt.Dimension(80, 27));
        brushSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushSizeActionPerformed(evt);
            }
        });

        colorSwatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawingtools/color_swatch.png"))); // NOI18N
        colorSwatch.setMaximumSize(new java.awt.Dimension(55, 55));
        colorSwatch.setMinimumSize(new java.awt.Dimension(55, 55));
        colorSwatch.setPreferredSize(new java.awt.Dimension(55, 55));
        colorSwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorSwatchActionPerformed(evt);
            }
        });

        brush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawingtools/draw.png"))); // NOI18N
        brush.setSelected(true);
        brush.setMaximumSize(new java.awt.Dimension(55, 55));
        brush.setMinimumSize(new java.awt.Dimension(55, 55));
        brush.setPreferredSize(new java.awt.Dimension(55, 55));
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });

        eraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawingtools/eraser.png"))); // NOI18N
        eraser.setMaximumSize(new java.awt.Dimension(55, 55));
        eraser.setMinimumSize(new java.awt.Dimension(55, 55));
        eraser.setPreferredSize(new java.awt.Dimension(55, 55));
        eraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorSwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(brushSize, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(eraser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(colorSwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(brushSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brushSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushSizeActionPerformed
        System.out.println("In Drawing.brushSizeActionPerfomed.");
        //System.out.println((brush.isSelected() ? "Brush" : "Eraser") + " size is changed to " + brushSize.getSelectedItem() + ".");
    }//GEN-LAST:event_brushSizeActionPerformed

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        System.out.println("In Drawing.brushActionPerformed.");
        if(brush.isSelected())  {
            eraser.setSelected(false);
            eraser.updateUI();
            //System.out.println("Brush is selected.");
        }
        else  {
            brush.setSelected(true);
            brush.updateUI();
        }
    }//GEN-LAST:event_brushActionPerformed

    private void eraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserActionPerformed
        System.out.println("In Drawing.eraserActionPerformed.");
        if(eraser.isSelected())  {
            brush.setSelected(false);
            brush.updateUI();
        //    System.out.println("Eraser is selected.");
        }
        else  {
            eraser.setSelected(true);
            eraser.updateUI();
        }
    }//GEN-LAST:event_eraserActionPerformed

    private void colorSwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorSwatchActionPerformed
        System.out.println("In Drawing.colorSwatchActionPerformed.");
        //System.out.print("Brush");
        color.setVisible(true);
    }//GEN-LAST:event_colorSwatchActionPerformed

    private ColorSwatch color;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton brush;
    private javax.swing.JComboBox brushSize;
    private javax.swing.JButton colorSwatch;
    private javax.swing.JToggleButton eraser;
    // End of variables declaration//GEN-END:variables
}