package eclasstool.view.drawingtools;
import javax.swing.*;
import eclasstool.model.drawingtools.*;
/****
 * Class NotesUI provides the JFrame for the Note Tool's toolbox. It 
 * also provides methods for the selection of each tool. 
 * 
 * @author Carmen
 */
public class NotesUI extends javax.swing.JFrame {

    /**
     * Creates new form Notes
     */
    public NotesUI() {
        initComponents();
        color = new ColorSwatch();
        color.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        bgColor = new javax.swing.JButton();
        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        width = new javax.swing.JTextField();
        height = new javax.swing.JTextField();

        setLocation(new java.awt.Point(80, 23));

        bgColor.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/note_color.png"))); // NOI18N
        bgColor.setMaximumSize(new java.awt.Dimension(55, 55));
        bgColor.setMinimumSize(new java.awt.Dimension(55, 55));
        bgColor.setPreferredSize(new java.awt.Dimension(55, 55));
        bgColor.setSize(new java.awt.Dimension(55, 55));
        bgColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgColorActionPerformed(evt);
            }
        });

        widthLabel.setText(" Width:");

        heightLabel.setText("Height:");

        width.setText("100");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(widthLabel)
                            .addComponent(heightLabel)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bgColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     * Sets the ColorSwatch to visible to allow color selection change.
     *
     * @param evt ActionEvent performed.
     */
    private void bgColorActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Note notes = new Note();
        //notes.changeBG(0);
    	//System.out.print("Note background");
        color.setVisible(true);
    }

    /**
     * Modifies the set height of the note.
     * 
     * @param evt ActionEvent performed.
     */
    private void heightActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	//Note notes = new Note();
    	//notes.modifySetHeight(5);
    	//System.out.println("Height changed to " + height.getText() + ".");
    }

    /**
     * Modifies the set width of the note. 
     * 
     * @param evt ActionEvent performed.
     */
    private void widthActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	//Note notes = new Note();
    	//notes.modifySetWidth(5);
    	//System.out.println("Width changed to " + width.getText() + ".");
    }

    /** ColorSwatch for the selection of color. */
    private ColorSwatch color;
    /** JButton to open up the ColorSwatch to modify background color. */
    private javax.swing.JButton bgColor;
    /** JTextField to modify the height. */
    private javax.swing.JTextField height;
    /** JLabel for the Labeling of the height JTextField. */
    private javax.swing.JLabel heightLabel;
    /** JTextField to modify the width. */
    private javax.swing.JTextField width;
    /** JLabel for the labeling of the width JTextField. */
    private javax.swing.JLabel widthLabel;
}
