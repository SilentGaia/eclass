package eclasstool.view.drawingtools;
import eclasstool.model.drawingtools.*;

import java.awt.Color;
/****
 * Class ColorSwatch provides methods to change the color being used
 * for the tools.
 * 
 * @author Carmen
 */
public class ColorSwatch extends javax.swing.JFrame {

    /**
     * Creates new form ColorSwatch
     */
    public ColorSwatch() {
        initComponents();
        color = null;
    }

    public Color getColor()
    {
        return color;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        okay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();


        okay.setText("Okay");
        okay.setPreferredSize(new java.awt.Dimension(86, 29));
        okay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addGap(1, 1, 1)
                        .addComponent(okay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Closes the ColorSwatch JFrame when the Okay button is clicked,
     * and changes the overall color to the selected color.
     * 
     * @param evt Mouse event performed.
     */
    private void okayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayActionPerformed
        //System.out.print(" color changed to " + jColorChooser1.getColor().toString() + ".\n");
        color = jColorChooser1.getColor();
        this.setVisible(false);
    }

    /**
     * Closes the ColorSwatch Jframe when the Cancel button is clicked.
     *
     * @param evt Mouse event performed.
     */
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //System.out.println("color not changed.\n");
        this.setVisible(false);
    }

    /** JButton for cancel. */
    private javax.swing.JButton cancel;
    /** JColorChooser for choosing the color. */
    private javax.swing.JColorChooser jColorChooser1;
    /** JButton for okay. */
    private javax.swing.JButton okay;
    /** Most recent color selected. */
    private Color color;
}
