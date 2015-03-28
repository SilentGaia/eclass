package eclasstool.view.drawingtools;
import javax.swing.*;
import java.awt.*;
import eclasstool.model.drawingtools.*;
/**
 * Class TextUI provides the JFrame for the Text Tool's 
 * toolbox. It also provides methods for the selection of each tool.
 * 
 * @author Carmen
 */
public class TextUI extends javax.swing.JFrame {

    /**
     * Creates new form Text
     */
    public TextUI() {
        initComponents();
        color = new ColorSwatch();
        color.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        font = new javax.swing.JComboBox();
        textSize = new javax.swing.JComboBox();
        textColor = new javax.swing.JButton();
        highlightText = new javax.swing.JToggleButton();

        setLocation(new java.awt.Point(80, 23));

        font.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Times New Roman", "Calibiri", "Comic Sans", "Arial" }));
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });

        textSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "10", "11", "12", "14", "16", "18", "20", "24", "30", "48" }));
        textSize.setSelectedIndex(3);
        textSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSizeActionPerformed(evt);
            }
        });

        textColor.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/text_color.png"))); // NOI18N
        textColor.setMaximumSize(new java.awt.Dimension(55, 55));
        textColor.setMinimumSize(new java.awt.Dimension(55, 55));
        textColor.setPreferredSize(new java.awt.Dimension(55, 55));
        textColor.setSize(new java.awt.Dimension(55, 55));
        textColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorActionPerformed(evt);
            }
        });

        highlightText.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/highlight_text.png"))); // NOI18N
        highlightText.setMaximumSize(new java.awt.Dimension(55, 55));
        highlightText.setMinimumSize(new java.awt.Dimension(55, 55));
        highlightText.setPreferredSize(new java.awt.Dimension(55, 55));
        highlightText.setSize(new java.awt.Dimension(55, 55));
        highlightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highlightTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(font, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highlightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(font, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(textSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(highlightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Sets the ColorSwatch to visible to change the text color.
     * 
     * @param evt ActionEvent performed.
     */
    private void textColorActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //color.setVisible(true);
        //Text text = new Text();
        //text.setColor(new Color(0, 0, 0));
        
        //System.out.print("Text");
    }

    /**
     * Changes the font selected.
     * 
     * @param evt ActionEvent performed.
     */
    private void fontActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	//Text text = new Text();
    	//text.changeFont("Times New Roman");
    	//System.out.println("Font changed to " + font.getSelectedItem() + ".");
    }

    /**
     * Modifies the text size.
     * 
     * @param evt ActionEvent performed.
     */
    private void textSizeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //System.out.println("Font size changed to " + textSize.getSelectedItem() + ".");
    	//Text text = new Text();
    	//text.changeSize(0);
    }

    /**
     * Modifies the text to highlight.
     * 
     * @param evt ActionEvent performed.
     */
    private void highlightTextActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	//Text text = new Text();
    	//text.highlightText();
    	//if(highlightText.isSelected())  {
            //System.out.println("Text is highlighted.");
        //}
        //else  {
            //System.out.println("Text is un-highlighted.");
        //}
    }

    /** ColorSwatch to change the color of the font.*/
    private ColorSwatch color;
    /** JComboBox for the font. */
    private javax.swing.JComboBox font;
    /** JToggleButton for the Highlight Tool. */
    private javax.swing.JToggleButton highlightText;
    /** JButton to select the text color. */
    private javax.swing.JButton textColor;
    /** JComboBox to select text size. */
    private javax.swing.JComboBox textSize;
}
