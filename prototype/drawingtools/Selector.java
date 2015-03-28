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
public class Selector extends javax.swing.JFrame {

    /**
     * Creates new form Selector
     */
    public Selector() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        selectAll = new javax.swing.JToggleButton();
        width = new javax.swing.JTextField();
        height = new javax.swing.JTextField();

        setResizable(false);

        widthLabel.setText(" Width:");

        heightLabel.setText("Height:");

        selectAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawingtools/select_all.png"))); // NOI18N
        selectAll.setMaximumSize(new java.awt.Dimension(55, 55));
        selectAll.setMinimumSize(new java.awt.Dimension(55, 55));
        selectAll.setPreferredSize(new java.awt.Dimension(55, 55));
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllActionPerformed(evt);
            }
        });

        width.setText("100");
        width.setToolTipText("Width:");
        width.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthActionPerformed(evt);
            }
        });

        height.setText("100");
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(widthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(selectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightLabel)
                                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(selectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(widthLabel)
                .addGap(3, 3, 3)
                .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(heightLabel)
                .addGap(3, 3, 3)
                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllActionPerformed
        if(selectAll.isSelected())  {
        //    System.out.println("Selected all.");
        }
        else  {
        //    System.out.println("Deselected all.");
        }
    }//GEN-LAST:event_selectAllActionPerformed
    
    private void selectAll()  {
        System.out.println("In Selector.selectAll.");
    }

    private void deselectAll()  {
        System.out.println("In Selector.deselectAll.");
    }

    private void widthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthActionPerformed
        System.out.println("In Selector.widthActionPerformed.");
        //System.out.println("Width changed to " + width.getText() + ".");
    }//GEN-LAST:event_widthActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        System.out.println("In Selector.heightActionPerformed.");
        //System.out.println("Height changed to " + height.getText() + ".");
    }//GEN-LAST:event_heightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField height;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JToggleButton selectAll;
    private javax.swing.JTextField width;
    private javax.swing.JLabel widthLabel;
    // End of variables declaration//GEN-END:variables
}