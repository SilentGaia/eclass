package eclasstool.view.drawingtools;
import eclasstool.model.drawingtools.*;

import javax.swing.*;
/****
 * Class DrawingUI provides the JFrame for the Drawing Tool's 
 * toolbox. It also provides methods for modifying the selected
 * DrawingTool tools selected.
 * @author Carmen
 */
public class DrawingUI extends javax.swing.JFrame {

    /**
     * Creates new form Drawing.
     */
    public DrawingUI() {
        initComponents();

        color = new ColorSwatch();
        color.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        brushSize = new javax.swing.JComboBox();
        colorSwatch = new javax.swing.JButton();
        brush = new javax.swing.JToggleButton();
        eraser = new javax.swing.JToggleButton();

        setLocation(new java.awt.Point(80, 23));

        brushSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "20", "25", "30", "35", "40", "45", "50", "75", "100" }));
        brushSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushSizeActionPerformed(evt);
            }
        });

        colorSwatch.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/color_swatch.png"))); // NOI18N
        colorSwatch.setMaximumSize(new java.awt.Dimension(55, 55));
        colorSwatch.setMinimumSize(new java.awt.Dimension(55, 55));
        colorSwatch.setPreferredSize(new java.awt.Dimension(55, 55));
        colorSwatch.setSize(new java.awt.Dimension(55, 55));
        colorSwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorSwatchActionPerformed(evt);
            }
        });

        brush.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/draw.png"))); // NOI18N
        brush.setSelected(true);
        brush.setMaximumSize(new java.awt.Dimension(55, 55));
        brush.setMinimumSize(new java.awt.Dimension(55, 55));
        brush.setPreferredSize(new java.awt.Dimension(55, 55));
        brush.setSize(new java.awt.Dimension(55, 55));
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });

        eraser.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/eraser.png"))); // NOI18N
        eraser.setMaximumSize(new java.awt.Dimension(55, 55));
        eraser.setMinimumSize(new java.awt.Dimension(55, 55));
        eraser.setPreferredSize(new java.awt.Dimension(55, 55));
        eraser.setSize(new java.awt.Dimension(55, 55));
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
                .addContainerGap(10, Short.MAX_VALUE))
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
    }

    /**
     * Changes the Brush Size.
     * 
     * @param evt ActionEvent performed.
     */
    private void brushSizeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Brush brushes = new Brush();
        //brushes.changeSize(5);
    	//System.out.println((brush.isSelected() ? "Brush" : "Eraser") + " size is changed to " + brushSize.getSelectedItem() + ".");
    }

    /**
     * Selects the Brush Tool.
     * 
     * @param evt ActionEvent performed.
     */
    private void brushActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //Brush brushes = new Brush();
        //brushes.draw();
    	//if(brush.isSelected())  {
            //eraser.setSelected(false);
            //eraser.updateUI();
            //System.out.println("Brush is selected.");
        //}
        //else  {
            //brush.setSelected(true);
            //brush.updateUI();
        //}
    }
    
    /**
     * Selects the Eraser Tool. 
     * 
     * @param evt ActionEvent performed.
     */
    private void eraserActionPerformed(java.awt.event.ActionEvent evt) {                                       
        /*Brush brushes = new Brush();
        brushes.erase();
    	if(eraser.isSelected())  {
            brush.setSelected(false);
            brush.updateUI();
            //System.out.println("Eraser is selected.");
        }
        else  {
            eraser.setSelected(true);
            eraser.updateUI();
        }*/
    }

    /**
     * Sets the ColorSwatchUI to visible for color selection.
     * 
     * @param evt ActionEvent performed.
     */
    private void colorSwatchActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //System.out.print("Brush");
        color.setVisible(true);
    }
    
    /**
     * Method to return the currently selected tool.
     * 
     * @return String representation of the currently selected tool.
     */
    public String getSelected()  {
    	if(brush.isSelected())  {
    		return "Brush";
    	}
    	else  {
    		return "Eraser";
    	}
    }
    
    /** ColorSwatch for modifying color selection. */
    private ColorSwatch color;
    /** JToggleButton for the DrawingTool's Brush Tool. */
    private javax.swing.JToggleButton brush;
    /** JComboBox for the DrawingTool's current Brush Size.*/
    private javax.swing.JComboBox brushSize;
    /** JButton for the DrawingTool's ColorSwatch Tool. */
    private javax.swing.JButton colorSwatch;
    /** JToggleButton for the DrawingTool's Eraser Tool. */
    private javax.swing.JToggleButton eraser;
}
