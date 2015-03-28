package eclasstool.view.drawingtools;

import javax.swing.*;
import eclasstool.model.drawingtools.*;
/****
 * Class SelectorUI provides the JFrame for the Selector Tool's 
 * toolbox. It also provides methods for the selection of each tool.
 *  
 * @author Carmen
 */
public class SelectorUI extends javax.swing.JFrame {

    /**
     * Creates new form Selector
     */
    public SelectorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        selectAll = new javax.swing.JToggleButton();
        width = new javax.swing.JTextField();
        height = new javax.swing.JTextField();

        setLocation(new java.awt.Point(80, 23));
        setResizable(false);

        widthLabel.setText(" Width:");

        heightLabel.setText("Height:");

        selectAll.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/select_all.png"))); // NOI18N
        selectAll.setMaximumSize(new java.awt.Dimension(55, 55));
        selectAll.setMinimumSize(new java.awt.Dimension(55, 55));
        selectAll.setPreferredSize(new java.awt.Dimension(55, 55));
        selectAll.setSize(new java.awt.Dimension(55, 55));
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
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Allows selection of the entire canvas.
     * 
     * @param evt ActionEvent performed.
     */
    private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {
        //System.out.println("Select all objects.");
    }

    /**
     * Modifies the selection area width.
     * 
     * @param evt ActionEvent performed.
     */
    private void widthActionPerformed(java.awt.event.ActionEvent evt) {
        //System.out.println("Width changed to " + width.getText() + ".");
    }

    /**
     * Modifies the selection area height.
     * 
     * @param evt ActionEvent performed.
     */
    private void heightActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	//System.out.println("Height changed to " + height.getText() + ".");
    }

   /** JTextField for the selection area height. */
    private javax.swing.JTextField height;
    /** JLabel for the height label. */
    private javax.swing.JLabel heightLabel;
    /** JToggleButton for the Select All Tool. */
    private javax.swing.JToggleButton selectAll;
    /** JTextField for the selection area width. */
    private javax.swing.JTextField width;
    /** JLabel for the width label. */
    private javax.swing.JLabel widthLabel;
}
