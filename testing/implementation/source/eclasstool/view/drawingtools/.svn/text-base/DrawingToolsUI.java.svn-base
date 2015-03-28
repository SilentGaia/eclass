package eclasstool.view.drawingtools;
import eclasstool.model.drawingtools.*;

import java.awt.Graphics.*;

import javax.swing.*;
/****
 * DrawingToolsUI provides a JFrame for the overall Toolbar and
 * provides methods for the selection of different tools.
 * 
 * @author Carmen
 */
public class DrawingToolsUI extends JInternalFrame {

    /**
     * Creates new form DrawingToolsUI
     */
    public DrawingToolsUI() {
	super("", false, true);
    	//setVisible(true);
        initComponents();
        initToolbars();
    	//setVisible(true);
    }
    
    /**
     * Initializes the toolbars for the tools. Sets the drawing tool 
     * as default.
     */
    private void initToolbars()  {
        drawingToolbar = new DrawingUI();
        drawingToolbar.setVisible(false);
        selectorToolbar = new SelectorUI();
        selectorToolbar.setVisible(false);
        textToolbar = new TextUI();
        textToolbar.setVisible(false);
        //textInput = new TextInputDialog();
        //textInput.setVisible(false);
        notesToolbar = new NotesUI();
        notesToolbar.setVisible(false);
        shapeToolbar = new ShapeUI();
        shapeToolbar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	setMinimumSize(new java.awt.Dimension(75, 335));

        selector = new javax.swing.JToggleButton();
        shape = new javax.swing.JToggleButton();
        text = new javax.swing.JToggleButton();
        draw = new javax.swing.JToggleButton();
        note = new javax.swing.JToggleButton();


        selector.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/select_all.png"))); // NOI18N
        selector.setSelected(true);
        selector.setMaximumSize(new java.awt.Dimension(55, 55));
        selector.setMinimumSize(new java.awt.Dimension(55, 55));
        selector.setPreferredSize(new java.awt.Dimension(55, 55));
        selector.setSize(new java.awt.Dimension(55, 55));
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        shape.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/shape.png"))); // NOI18N
        shape.setMaximumSize(new java.awt.Dimension(55, 55));
        shape.setMinimumSize(new java.awt.Dimension(55, 55));
        shape.setPreferredSize(new java.awt.Dimension(55, 55));
        shape.setSize(new java.awt.Dimension(55, 55));
        shape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeActionPerformed(evt);
            }
        });

        text.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/text.png"))); // NOI18N
        text.setMaximumSize(new java.awt.Dimension(55, 55));
        text.setMinimumSize(new java.awt.Dimension(55, 55));
        text.setPreferredSize(new java.awt.Dimension(55, 55));
        text.setSize(new java.awt.Dimension(55, 55));
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        draw.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/draw.png"))); // NOI18N
        draw.setMaximumSize(new java.awt.Dimension(55, 55));
        draw.setMinimumSize(new java.awt.Dimension(55, 55));
        draw.setPreferredSize(new java.awt.Dimension(55, 55));
        draw.setSize(new java.awt.Dimension(55, 55));
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        note.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/note.png"))); // NOI18N
        note.setMaximumSize(new java.awt.Dimension(55, 55));
        note.setMinimumSize(new java.awt.Dimension(55, 55));
        note.setPreferredSize(new java.awt.Dimension(55, 55));
        note.setSize(new java.awt.Dimension(55, 55));
        note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteActionPerformed(evt);
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
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }
    
    public DrawingToolBar getToolBar()
    {
        return shapeToolbar.getToolBar();
    }
    
    /**
     * Changes the selection in the toolbar to the selector tool and 
     * sets the SelectorUI toolbar to visible.
     * 
     * @param evt Action event performed.
     */
    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(selector.isSelected())  {
            changeSelection(selector);
            selectorToolbar.setVisible(true);
            //System.out.println("Selector tool is selected.");
        }
        else  {
            selector.setSelected(true);
            selector.updateUI();
        }
    }

    /**
     * Changes the selection in the toolbar to the Text tool and 
     * sets the TextUI toolbar to visible.
     * 
     * @param evt Action event performed.
     */
    private void textActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(text.isSelected())  {
            changeSelection(text);
            textToolbar.setVisible(true);
            //System.out.println("Text Tool is selected.");
        }
        else  {
            text.setSelected(true);
            text.updateUI();
        }
    }

    /**
     * Changes the selection in the toolbar to the Note tool and
     * sets the NoteUI toolbar to visible.
     * 
     * @param evt ActionEvent performed.
     */
    private void noteActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(note.isSelected())  {
            changeSelection(note);
            notesToolbar.setVisible(true);
            //System.out.println("Note Tool is selected.");
        }
        else  {
            note.setSelected(true);
            note.updateUI();
        }
    }

    /**
     * Changes the selection in the toolbar to the Draw Tool and 
     * sets the DrawUingUI toolbar to visible. 
     * 
     * @param evt ActionEvent performed.
     */
    private void drawActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(draw.isSelected())  {
            changeSelection(draw);
            drawingToolbar.setVisible(true);
            //System.out.println("Drawing Tool is selected.");
        }
        else  {
            draw.setSelected(true);
            draw.updateUI();
        }    
    }
    
    /**
     * Changes the selection in the toolbar to the Shape Tool and
     * sets the ShapeUI toolbar to visible.
     * 
     * @param evt ActionEvent performed.
     */
    private void shapeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(shape.isSelected())  {
            changeSelection(shape);
            shapeToolbar.setVisible(true);
            //System.out.println("Shape Tool is selected.");
        }
        else  {
            shape.setSelected(true);
            shape.updateUI();
        }
    }

    /**
     * Method deselects all the buttons that were already selected,
     * and sets the toolbar related to the button to not visible.
     * 
     * @param button JToggleButton pressed.
     */
    private void changeSelection(javax.swing.JToggleButton button)  {
        if(!button.equals(selector))  {
            selector.setSelected(false);
            selector.updateUI();
            selectorToolbar.setVisible(false);
        }
        if(!button.equals(draw))  {
            draw.setSelected(false);
            draw.updateUI();
            drawingToolbar.setVisible(false);
        }
        if(!button.equals(note))  {
            note.setSelected(false);
            note.updateUI();
            notesToolbar.setVisible(false);
        }
        if(!button.equals(shape))  {
            shape.setSelected(false);
            shape.updateUI();
            shapeToolbar.setVisible(false);
        }
        if(!button.equals(text))  {
            text.setSelected(false);
            text.updateUI();
            // textInput.setVisible(false);
        }
    }
   
    /**
     * Method that returns the selected tool.
     * 
     * @return String representation of the selected tool.
     */
    public String selectedTool()  {
    	if(draw.isSelected())  {
    		return "Brush";
    	}
    	else if(note.isSelected())  {
    		return "Note";
    	}
    	else if(selector.isSelected())  {
    		return "Selector";

    	}
    	else if(shape.isSelected())  {
    		return "Shape";
    	}
    	else if(text.isSelected())  {
    		return "Text";
    	}
    	else 
    		return null;
    }
    
    /**
     * Get method that returns the instance variable shapeToolbar.
     * 
     * @return Returns the instance variable shapeToolbar.
     */
    public ShapeUI getShapeToolbar()  {
    	return shapeToolbar;
    }
    
    /**
     * Get method that returns the instance variable selectorToolbar.
     * 
     * @return Returns the instance variable selectorToolbar.
     */
    public SelectorUI getSelectorToolbar()  {
    	return selectorToolbar;
    }
    
    /**
     * Get method that returns the instance variable noteToolbar.
     * 
     * @return Returns the instance variable noteToolbar.
     */
    public NotesUI getNotesToolbar()  {
    	return notesToolbar;
    }
    
    /**
     * Get method that returns the instance variable drawingToolbar.
     * 
     * @return Returns the instance variable drawingToolbar.
     */
    public DrawingUI getDrawingToolbar()  {
    	return drawingToolbar;
    }
    
    /** JToggleButton for the Drawing Tool. */
    private javax.swing.JToggleButton draw;
    /** JToggleButton for the Note Tool. */
    private javax.swing.JToggleButton note;
    /** JToggleButton for the Selector Tool. */
    private javax.swing.JToggleButton selector;
    /** JToggleButton for the Shape Tool. */
    private javax.swing.JToggleButton shape;
    /** JToggleButton for the Text Tool. */
    private javax.swing.JToggleButton text;
    /** JFrame for the Drawing Tool's toolbar. */
    private DrawingUI drawingToolbar;
    /** JFrame for the Selector Tool's toolbar. */
    private SelectorUI selectorToolbar;
    /** JFrame for the Text Tool's toolbar. */
    private TextUI textToolbar;
    /** JFrame for the Notes Tool's toolbar. */
    private NotesUI notesToolbar;
    /** JFrame for the Shape Tool's toolbar. */
    private ShapeUI shapeToolbar;
}
