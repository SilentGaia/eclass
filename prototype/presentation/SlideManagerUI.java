/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.swing.DefaultListModel;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Tammy
 */
public class SlideManagerUI extends javax.swing.JFrame {
    private DefaultListModel model;

    /**
     * Creates new form SlideManagerUI
     */
    public SlideManagerUI() {
        initComponents();
        initSlides();
    }
    private void initSlides() {
        model = new DefaultListModel();
        slideList.setModel(model);
        model.addElement("Slide 1");
        slideList.setSelectedIndex(0);
        
        slideList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    System.out.println(model.get(slideList.getSelectedIndex()) + " selected.");
                }
            }
        });
        
        slideList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(evt.getClickCount() == 2) {
                    System.out.println(model.get(slideList.getSelectedIndex()) + " edit window opened.");
                    EditSlideUI slide = new EditSlideUI();
                    slide.setVisible(true);
                    slide.setLocationRelativeTo(SlideManagerUI.this);
                    slide.setDefaultCloseOperation(HIDE_ON_CLOSE);    
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        htmlButton = new javax.swing.JButton();
        addSlide = new javax.swing.JButton();
        deleteSlide = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        slideScroll = new javax.swing.JScrollPane();
        slideList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        htmlButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        htmlButton.setText("HTML");
        htmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlButtonActionPerformed(evt);
            }
        });

        addSlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/add.png"))); // NOI18N
        addSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSlideActionPerformed(evt);
            }
        });

        deleteSlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/delete.png"))); // NOI18N
        deleteSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSlideActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Chapter 1: Presentation 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(htmlButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addSlide)
                            .addComponent(deleteSlide)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(htmlButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        slideList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slideList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Slide 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        slideScroll.setViewportView(slideList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(slideScroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(slideScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSlideActionPerformed
        // TODO add your handling code here:
        System.out.println("New slide added.");
        model.addElement("Slide " + (model.getSize() + 1));
    }//GEN-LAST:event_addSlideActionPerformed

    private void deleteSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSlideActionPerformed
        // TODO add your handling code here:
        System.out.println("Selected slide deleted.");
        model.removeElementAt(slideList.getSelectedIndex());
    }//GEN-LAST:event_deleteSlideActionPerformed

    private void htmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlButtonActionPerformed
        // TODO add your handling code here:
        HTMLSlideUI html = new HTMLSlideUI();
        html.setVisible(true);
        html.setLocationRelativeTo(this);
        html.setDefaultCloseOperation(HIDE_ON_CLOSE);
        System.out.println("HTML Window opened.");
    }//GEN-LAST:event_htmlButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSlide;
    private javax.swing.JButton deleteSlide;
    private javax.swing.JButton htmlButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList slideList;
    private javax.swing.JScrollPane slideScroll;
    // End of variables declaration//GEN-END:variables
}
