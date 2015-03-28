/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Daniel Lee (dlee104@calpoly.edu)
 */
package eclasstool.view.chat;

import java.lang.Thread;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;
import javax.swing.JOptionPane;
import java.io.Serializable;

import eclasstool.model.chat.*;

/**
 * ChatUI models the main graphical user interface for chatroom functionality
 * of E-classroom. 
 *
 * @author Daniel Lee
 */
public class ChatUI extends javax.swing.JInternalFrame implements Observer, Serializable {
    private DefaultListModel model;
    private RemoteChat stub;

    /**
     * Constructs a ChatUI that initializes its components.
     */
    public ChatUI(String name, RemoteChat stub) {
        super("Chat", false, true);
        this.stub = stub;
        initChat(name);
        initComponents();
        initChatrooms();
        initChatButtons();

        pull();
    }

    /**
     * Initializes chat with this user.
     */
    private void initChat(String name) {
        chat = new Chat(new Member(name), stub);
    }
    
    /**
     * Initializes chatrooms for this user.
     */
    private void initChatrooms() {
        model = new DefaultListModel();
        ChatroomsList.setModel(model);
        model.addElement("Classroom");
        ChatroomsList.setSelectedIndex(0);
        
        ChatroomsList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    //System.out.println(model.get(ChatroomsList.getSelectedIndex()) + " pressed.");
                    Comments.setText("");
                    chat.setChatroom(ChatroomsList.getSelectedIndex());
                    Comments.setText(chat.getChatroom().getComments());
                }
            }
        });
    }
    
    /**
     * Initializes chat buttons for adding users, viewing users, and leaving chatroom.
     */
    private void initChatButtons() {
        AddUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserDialog addDialog = new AddUserDialog(chat);
                addDialog.setVisible(true);
                addDialog.setLocationRelativeTo(ChatUI.this);
                addDialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
                addDialog.setResizable(false);
            }
        });
        
        ViewUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //System.out.println("View Users pressed.");
                ArrayList<Member> members = chat.getChatroom().getMembers();
                java.util.List<String> names;
                String membersStrings = "";
                System.out.println("Members in chatroom:");
                for (Member member : members)
                {
                    membersStrings += member.getName() + "\n";
                    System.out.println(member.getName());
                }

                if (stub != null && ChatroomsList.getSelectedIndex() == 0)
                {
                    try {
                        names = stub.getLogins();
                        for (String name : names)
                        {
                            if (membersStrings.indexOf(name) == -1)
                                membersStrings += name + "\n";
                        }
                    }
                    catch (Exception err) {
                        err.printStackTrace();
                    }
                }

                JOptionPane.showMessageDialog(null,
                    membersStrings, "Members",
                    JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        LeaveChatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //System.out.println("Leave Chatroom pressed.");
                DefaultListModel model = (DefaultListModel) ChatroomsList.getModel();
                int selectedIndex = ChatroomsList.getSelectedIndex();

                if (selectedIndex > 0) 
                {
                    model.remove(selectedIndex);
                    chat.leaveChatroom();
                    ChatroomsList.setSelectedIndex(0);
                }
                else if (selectedIndex == 0)
                {
                    JOptionPane.showMessageDialog(null,
                        "You cannot leave the default classroom chatroom.",
                        "Error", JOptionPane.ERROR_MESSAGE);
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

        ChatPanel = new javax.swing.JPanel();
        CommentPanel = new javax.swing.JScrollPane();
        Comments = new javax.swing.JTextArea();
        CommentField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        AddUsersButton = new javax.swing.JButton();
        ViewUsersButton = new javax.swing.JButton();
        LeaveChatButton = new javax.swing.JButton();
        NewChatButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChatroomsList = new javax.swing.JList();
        AskQuestion = new javax.swing.JButton();

        ChatPanel.setBackground(new java.awt.Color(102, 102, 102));

        CommentPanel.setBackground(new java.awt.Color(255, 255, 255));
        CommentPanel.setBorder(null);
        CommentPanel.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Comments.setColumns(20);
        Comments.setLineWrap(true);
        Comments.setRows(5);
        Comments.setBorder(null);
        CommentPanel.setViewportView(Comments);

        CommentField.setText("Comment...");
        CommentField.setToolTipText("Add Comment...");
        CommentField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CommentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentFieldActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));

        AddUsersButton.setText("+");

        ViewUsersButton.setText("Users");

        LeaveChatButton.setText("Leave");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddUsersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewUsersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(LeaveChatButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUsersButton)
                    .addComponent(ViewUsersButton)
                    .addComponent(LeaveChatButton))
                .addContainerGap())
        );

        NewChatButton.setText("New Chat");
        NewChatButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NewChatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewChatButtonActionPerformed(evt);
            }
        });

        ChatroomsList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChatroomsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ChatroomsList);

        AskQuestion.setText("Ask Question");
        AskQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AskQuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChatPanelLayout = new javax.swing.GroupLayout(ChatPanel);
        ChatPanel.setLayout(ChatPanelLayout);
        ChatPanelLayout.setHorizontalGroup(
            ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChatPanelLayout.createSequentialGroup()
                .addGroup(ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewChatButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(AskQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommentField)
                    .addComponent(CommentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        ChatPanelLayout.setVerticalGroup(
            ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChatPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AskQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NewChatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChatPanelLayout.createSequentialGroup()
                        .addComponent(CommentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CommentField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(ChatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(ChatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    /**
     * Callback function for entering a comment.
     */
    private void CommentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentFieldActionPerformed
        // TODO add your handling code here:
        Comments.append(chat.getUser().getName() + ": " + CommentField.getText() + "\n");
        chat.postComment(CommentField.getText());
        CommentField.setText("");
    }//GEN-LAST:event_CommentFieldActionPerformed

    /**
     * Callback function for pressing new chat button.
     */
    private void NewChatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewChatButtonActionPerformed

        //System.out.println("New Chat pressed.");
        model.addElement("Chatroom " + (model.getSize() + 1));
        chat.createChatroom();
    }//GEN-LAST:event_NewChatButtonActionPerformed

    /**
     * Callback function for pressing ask question button.
     */
    private void AskQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AskQuestionActionPerformed
        // TODO add your handling code here:
        AskQuestionDialog question = new AskQuestionDialog(chat);
        question.setVisible(true);
        question.setLocationRelativeTo(this);
        question.setDefaultCloseOperation(HIDE_ON_CLOSE);
        question.setResizable(false);
    }//GEN-LAST:event_AskQuestionActionPerformed

    /**
     * Callback function for updating chatroom comments when
     * server is called.
     *
     * @param obs the client that invoked server methods
     * @param obj the optional object parameter
     */
    public void update(Observable obs, Object obj)
    {
        ChatroomsList.setSelectedIndex(0);
        //Comments.setText("");

        try {
           if (stub != null) {
              Comments.setText(stub.getComments());
           }
        }
        catch (Exception error)
        {
           error.printStackTrace();
        }
    }

    /**
     * Pulls from the server awaiting model changes.
     */
    public void pull()
    {
        thread = new Thread() {
            public void run() {
                String comments;
                try {
                    while (true)
                    {
                        if (ChatroomsList.getSelectedIndex() == 0)
                        {
                            update(null, null);
                        }
                        Thread.sleep(1000);
                    }
                } catch(InterruptedException v) {
                    System.out.println(v);
                }
            }  
        };
        thread.start();
    }

    /**
     * Chat model for chat functionality.
     */
    private Chat chat;
    /**
     * Thread for pulling from server.
     */
    private Thread thread;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
     * Add user button in chatroom.
     */
    private javax.swing.JButton AddUsersButton;
    /**
     * Ask question button in chat.
     */
    private javax.swing.JButton AskQuestion;
    /**
     * Panel for chatroom.
     */
    private javax.swing.JPanel ChatPanel;
    /**
     * List of chatrooms available.
     */
    private javax.swing.JList ChatroomsList;
    /**
     * Comment box for user input.
     */
    private javax.swing.JTextField CommentField;
    /**
     * Panel for commenting on chatroom.
     */
    private javax.swing.JScrollPane CommentPanel;
    /**
     * Posted comments of the chatroom.
     */
    private javax.swing.JTextArea Comments;
    /**
     * Leave chatroom button.
     */
    private javax.swing.JButton LeaveChatButton;
    /**
     * New chatroom button.
     */
    private javax.swing.JButton NewChatButton;
    /**
     * View users in chatroom button.
     */
    private javax.swing.JButton ViewUsersButton;
    /**
     * Main panel for chat.
     */
    private javax.swing.JPanel jPanel3;
    /**
     * Scroll pane for comments.
     */
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
