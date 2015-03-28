package eclasstool.view.drawingtools;
import javax.swing.*;

import eclasstool.model.drawingtools.*;
/**
 * Class ShapeUI provides the JFrame for the Shape Tool's 
 * toolbox. It also provides methods for the selection of each tool.
 * 
 * @author Carmen
 */
public class ShapeUI extends javax.swing.JFrame {
    private DrawingToolBar toolbar;
    
    /**
     * Creates new form Shape
     */
    public ShapeUI() {
        initComponents();
    }

    public DrawingToolBar getToolBar()
    {
        return toolbar;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        toolbar = new DrawingToolBar(new DrawingCanvas());
        add(toolbar);
        /*
        line = new javax.swing.JToggleButton();
        circle = new javax.swing.JToggleButton();
        rectangle = new javax.swing.JToggleButton();
        move = new javax.swing.JToggleButton();
        delete = new javax.swing.JToggleButton();*/

        setLocation(new java.awt.Point(80, 23));
        /*
        line.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/line.png"))); // NOI18N
        line.setSelected(true);
        line.setMaximumSize(new java.awt.Dimension(55, 55));
        line.setMinimumSize(new java.awt.Dimension(55, 55));
        line.setPreferredSize(new java.awt.Dimension(55, 55));
        line.setSize(new java.awt.Dimension(55, 55));
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });

        circle.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/circle.png"))); // NOI18N
        circle.setMaximumSize(new java.awt.Dimension(55, 55));
        circle.setMinimumSize(new java.awt.Dimension(55, 55));
        circle.setPreferredSize(new java.awt.Dimension(55, 55));
        circle.setSize(new java.awt.Dimension(55, 55));
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/rectangle.png"))); // NOI18N
        rectangle.setMaximumSize(new java.awt.Dimension(55, 55));
        rectangle.setMinimumSize(new java.awt.Dimension(55, 55));
        rectangle.setPreferredSize(new java.awt.Dimension(55, 55));
        rectangle.setSize(new java.awt.Dimension(55, 55));
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        move.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/move_shape.png"))); // NOI18N
        move.setMaximumSize(new java.awt.Dimension(55, 55));
        move.setMinimumSize(new java.awt.Dimension(55, 55));
        move.setPreferredSize(new java.awt.Dimension(55, 55));
        move.setSize(new java.awt.Dimension(55, 55));
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/drawingtools/images/delete_shape.png"))); // NOI18N
        delete.setMaximumSize(new java.awt.Dimension(55, 55));
        delete.setMinimumSize(new java.awt.Dimension(55, 55));
        delete.setPreferredSize(new java.awt.Dimension(55, 55));
        delete.setSize(new java.awt.Dimension(55, 55));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        */
        pack();
    }

    /**
     * Changes selection to the Line Tool.
     * 
     * @param evt ActionEvent performed.
     */
    /*
    private void lineActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //Line lines;
        //lines = new Line(0, 0, 0, 0);

    	if(line.isSelected())  {
            changeSelection(line);
            //System.out.println("Line is selected.");
        }
        else  {
            line.setSelected(true);
            line.updateUI();
        }
    }*/
    
    /**
     * Changes selection to the Circle Tool.
     * 
     * @param evt ActionEvent performed.
     */
    /*
    private void circleActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Circle circles = new Circle(0, 0, 0);
    	if(circle.isSelected())  {
            changeSelection(circle);
            //System.out.println("Circle is selected.");
        }
        else  {
            circle.setSelected(true);
            circle.updateUI();
        }
    }*/
    /**
     * Changes selection to the Rectangle Tool.
     * 
     * @param evt ActionEvent performed.
     */
    /*
    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Rectangle rectangles = new Rectangle(0, 0, 0, 0);
        
    	if(rectangle.isSelected())  {
            changeSelection(rectangle);
            //System.out.println("Rectangle is selected.");
        }
        else  {
            rectangle.setSelected(true);
            rectangle.updateUI();
        }
    }*/
    
    /**
     * Changes selection to the Move Tool.
     * 
     * @param evt ActionEvent performed.
     *//*
    private void moveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Shape shape = new Shape();
        shape.move(0, 0);
    	if(move.isSelected())  {
            changeSelection(move);
            //System.out.println("Move Shape is selected.");
        }
        else  {
            move.setSelected(true);
            move.updateUI();
        }    
    }*/

    /**
     * 
     * @param evt ActionEvent performed.
     *//*
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Shape shape = new Shape();
		shape.delete();
    	if(delete.isSelected())  {

            changeSelection(delete);
            //System.out.println("Delete Shape is selected.");
        }
        else  {
            delete.setSelected(true);
            delete.updateUI();
        }
    }*/

    /**
     * Changes the current button selection based on the button 
     * param. 
     * 
     * @param button Button that is currently being selected.
     *//*
    private void changeSelection(javax.swing.JToggleButton button)  {
        if(!button.equals(line))  {
            line.setSelected(false);
            line.updateUI();
        }
        if(!button.equals(move))  {
            move.setSelected(false);
            move.updateUI();
        }
        if(!button.equals(rectangle))  {
            rectangle.setSelected(false);
            rectangle.updateUI();
        }
        if(!button.equals(delete))  {
            delete.setSelected(false);
            delete.updateUI();
        }
        if(!button.equals(circle))  {
            circle.setSelected(false);
            circle.updateUI();
        }
    }*/

    /**
     * Identifies the currently selected tool and returns a String
     * representation of the selected tool.
     * @return The String representation of the selected tool.
     *//*
    public String getSelected()  {
    	if(line.isSelected())  {
    		return "Line";
    	}
    	else if(circle.isSelected())  {
    		return "Circle";
    	}
    	else if(rectangle.isSelected())  {
    		return "Rectangle";
    	}
    	else if(delete.isSelected())  {
    		return "Delete";
    	}
    	else  {
    		return "Move";
    	}
    }*/

    /** JToggleButton for the Circle Tool. */
    //private javax.swing.JToggleButton circle;
    /** JToggleButton for the Delete Tool. */
    //private javax.swing.JToggleButton delete;
    /** JToggleButton for the Line Tool. */
    //private javax.swing.JToggleButton line;
    /** JToggleButton for the Move Tool. */
    //private javax.swing.JToggleButton move;
    /** JToggleButton for the Rectangle Tool. */
    //private javax.swing.JToggleButton rectangle;
}
