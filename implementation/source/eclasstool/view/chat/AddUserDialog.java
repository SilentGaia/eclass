/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Daniel Lee (dlee104@calpoly.edu)
 */
package eclasstool.view.chat;

import javax.swing.JList;
import java.util.ArrayList;
import eclasstool.model.chat.*;

/**
 * AddUserDialog models a graphical user interface for adding
 * members into a chatroom. It displays a list of available
 * members who may be selected to add to the chatroom.
 *
 * @author Daniel Lee
 */
public class AddUserDialog extends javax.swing.JFrame {

    /**
     * Constructs a new add user dialog.
     */
    public AddUserDialog(Chat chat) {
        this.chat = chat;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        UserList = new javax.swing.JList();
        Cancel = new javax.swing.JButton();
        Submit = new javax.swing.JButton();

        UserList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Daniel Lee", "Eric Tran", "Leah Pichay", "Jordan Tang", 
                "Tammy Kong", "Carmen Dang", "Gene Fisher", "Bruce Willis", "Robert Downey Jr.", "Jaden Smith" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(UserList);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Submit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Callback function for cancelling dialog.
     */
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * Callback function for submitting dialog.
     */
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        Object[] selectedUsers = (Object[]) UserList.getSelectedValues();

        for (Object student : selectedUsers)
        {
            chat.addUser(new Member((String) student));
        }
        this.setVisible(false);
    }//GEN-LAST:event_SubmitActionPerformed


    // Model variables declaration
    /**
     * Chat model for chat functionality.
     */
    private Chat chat;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
     * Cancel add button.
     */
    private javax.swing.JButton Cancel;
    /**
     * Submit add button.
     */
    private javax.swing.JButton Submit;
    /**
     * List of users to add from.
     */
    private javax.swing.JList UserList;
    /**
     * Simple scroll pane for adding users.
     */
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
