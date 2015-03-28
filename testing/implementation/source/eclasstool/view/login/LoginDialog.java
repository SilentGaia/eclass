package eclasstool.view.login;

import eclasstool.model.login.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * Login dialog for authenticating users. User information is stored in the model . 
 * @author Eric Tran (etran04@calpoly.edu)
 */
public class LoginDialog extends javax.swing.JFrame
{
    /**
     * Creates new form LoginDialog
     */
    public LoginDialog(LoginModel model)
    {
        this.model = model;
        initComponents();
    }

    /**
     * Helper method for setting up the dialog window. 
     */
    private void initComponents()
    {
        mainPanel = new javax.swing.JPanel();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        
        UsernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        PasswordField.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt)
                {
                    ConfirmButtonActionPerformed(evt);
                }
            });
        
        RegisterButton = new javax.swing.JButton();
        NotUserLabel = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        GuestButton = new javax.swing.JButton();

        UserNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        UserNameLabel.setText("Full Name: ");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PasswordLabel.setText("Password: ");

        RegisterButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    RegisterButtonActionPerformed(evt);
                }
            });

        NotUserLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NotUserLabel.setText("Not a user? ");

        ConfirmButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ConfirmButton.setText("Login");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ConfirmButtonActionPerformed(evt);
                }
            });

        GuestButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        GuestButton.setText("Guest");
        GuestButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    GuestLoginClicked();
                }
            });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(UserNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(PasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PasswordField)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(RegisterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GuestButton))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(NotUserLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton)
                        .addGap(35, 35, 35))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameLabel)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(NotUserLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegisterButton)
                            .addComponent(GuestButton))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        this.setResizable(false);
    }// </editor-fold>                        

    /**
     * Opens up the register dialog and allows for one to register into the database. 
     */
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        RegisterDialog register = new RegisterDialog(model);
    }                                              

    /**
     * Checks to see if the user is a valid user from a database of some sort. 
     */
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                              
        String username = UsernameTextField.getText();
        String password = new String(PasswordField.getPassword());

        if (!model.confirmUser(username, password))
        {
            JOptionPane.showMessageDialog(this,
                "Incorrect username and/or password.",
                "Invalid user",
                JOptionPane.ERROR_MESSAGE);
            UsernameTextField.setText("");
            PasswordField.setText("");
        }
        else
        {
            // Confirmed user, close window
            dispose();
        }
    }    
    
    /**
     * Helper method for guest button being clicked. 
     */
    private void GuestLoginClicked()
    {
        model.guestLogin();
        dispose();
    }
    
    /*
    public static void main(String[] args)
    {
        new LoginDialog(null).setVisible(true);
    }*/
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton GuestButton;
    private javax.swing.JLabel NotUserLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JPanel mainPanel;

    private LoginModel model ;
    // End of variables declaration                   
}
