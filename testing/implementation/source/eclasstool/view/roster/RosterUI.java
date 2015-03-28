package eclasstool.view.roster;

import eclasstool.model.roster.*;
import eclasstool.model.chat.RemoteChat;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * RosterUI represents the roster for the eclasstool. 
 * @author Eric Tran (etran04@calpoly.edu)
 * @version 1
 */
public class RosterUI extends JInternalFrame implements Observer 
{
    // Main panel containing all the information 
    private JPanel listContainer;

    // Instance of the model
    private RosterModel roster;

    // Instance of the importDialog
    private ImportDialog importBox;

    // Instance of my action listener
    private MyListener myListener;

    // Stub for accessing the server's logged in students
    private RemoteChat stub;
    
    // Name of user who opened this rosterUI
    private String openBy;

    // Different icons to use
    private final ImageIcon qIcon = 
        new ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/roster/q.png"));
    private final ImageIcon attendedIcon = 
        new ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/roster/gc.png"));
    private final ImageIcon absentIcon = 
        new ImageIcon(getClass().getClassLoader().getResource("eclasstool/view/roster/rc.png"));

    /**
     * Default constructor for the roster gui. 
     * @param stub the server 
     */
    public RosterUI(RemoteChat stub)
    {
        super("Roster", false, true);
        this.stub = stub;
        initUI();
        pull();
    }

    /**
     * Initializes the initial roster. 
     */
    private void initUI() 
    {
        setTitle("Roster");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listContainer = new JPanel();
        listContainer.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        listContainer.setOpaque(true);
        listContainer.setBackground(Color.WHITE);

        listContainer.setLayout(new BoxLayout(listContainer, BoxLayout.Y_AXIS));
        add(new JScrollPane(listContainer), BorderLayout.CENTER);

        // 309 declarations
        roster = new RosterModel(stub);
        roster.addObserver(this);
        importBox = new ImportDialog(this);

        Scanner rdr = new Scanner(getClass().getClassLoader().getResourceAsStream("eclasstool/view/roster/roster.in"));
        ArrayList<Student> toImport = new ArrayList<Student>();
        String studentName = "";
        while (rdr.hasNextLine())
        {
            studentName = rdr.nextLine();
            if (studentName.equals("Gene Fisher"))
            {
                toImport.add(new Instructor(studentName, new AttendanceStatus(), new Privilege(true)));
            }
            else
            {
                toImport.add(new Student(studentName, new AttendanceStatus(), new Privilege()));
            }
        }
        Collections.sort(toImport);
        roster.addStudents(toImport);

        myListener = new MyListener(roster);

        JButton button = new JButton("Import");
        button.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    for (Component component: listContainer.getComponents())
                    {
                        listContainer.remove(component);
                    }

                    importBox.showDialog();
                    roster.addStudents(importBox.getStudentsToImport());
                    ArrayList<Student> students = importBox.getStudentsToImport();

                    int index = 1;
                    for (Student currStudent: students)
                    {
                        final JPanel newPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        newPanel.setName("User " + index);
                        newPanel.setOpaque(true);
                        newPanel.setBackground(Color.WHITE);

                        JButton status = new JButton();

                        int padBytes = 25 - currStudent.getName().length();
                        StringBuilder builder = new StringBuilder();
                        while (padBytes-- > 0)
                        {
                            builder.append(" ");
                        }
                        JLabel nameLabel = new JLabel(currStudent.getName() + builder.toString());

                        status.setBackground(new java.awt.Color(255, 255, 0));
                        status.setForeground(new java.awt.Color(255, 255, 0));
                        status.setPreferredSize(new Dimension(28, 26));

                        if (!currStudent.getRosterQ().toString().equals("N/A"))
                        {
                            status.setIcon(qIcon);
                            status.setActionCommand(index + "");
                            status.addActionListener(myListener);
                        }   
                        else if (currStudent.getAttending().getAttended())
                        {
                            status.setIcon(attendedIcon);
                        }
                        else
                        {
                            status.setIcon(absentIcon);
                        }

                        newPanel.add(status);
                        newPanel.add(nameLabel);

                        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        checkPanel.setName("Check");
                        JCheckBox chatCheck = new JCheckBox("Chat");
                        chatCheck.setActionCommand(index + ":chat");
                        JCheckBox drawCheck = new JCheckBox("Draw");
                        drawCheck.setActionCommand(index + ":draw");
                        JCheckBox assignCheck = new JCheckBox("Assign");
                        assignCheck.setActionCommand(index + ":assign");
                        
                        chatCheck.addActionListener(myListener);
                        drawCheck.addActionListener(myListener);
                        assignCheck.addActionListener(myListener);
                        
                        checkPanel.add(chatCheck);
                        checkPanel.add(drawCheck);
                        checkPanel.add(assignCheck);
                        newPanel.add(checkPanel);

                        listContainer.add(newPanel);

                        listContainer.revalidate();

                        // Scroll down to last added panel
                        SwingUtilities.invokeLater(new Runnable() 
                            {
                                @Override
                                public void run() {
                                    newPanel.scrollRectToVisible(newPanel.getBounds());
                                }
                            });

                        index++;
                    }
                }
            });

        repaintRoster();
        add(button, BorderLayout.PAGE_START);
        setSize(500, 500);
        setResizable(false);
    }

    /**
     * Helper method for reconstructing the gui. 
     */
    private void repaintRoster()
    {
        for (Component component: listContainer.getComponents())
        {
            listContainer.remove(component);
        }

        int index = 1;
        for (Student currStudent: roster.getListStudents())
        {
            final JPanel newPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            newPanel.setName(currStudent.getName());
            newPanel.setOpaque(true);
            newPanel.setBackground(Color.WHITE);
            newPanel.setPreferredSize(new Dimension(300, 50));

            JButton status = new JButton();

            int padBytes = 50 - currStudent.getName().length();
            StringBuilder builder = new StringBuilder();
            while (padBytes-- > 0)
            {
                builder.append(".");
            }
            JLabel nameLabel = new JLabel(currStudent.getName() + builder.toString());

            status.setBackground(new java.awt.Color(255, 255, 0));
            status.setForeground(new java.awt.Color(255, 255, 0));
            status.setPreferredSize(new Dimension(28, 26));

            if (!currStudent.getRosterQ().toString().equals("N/A"))
            {
                status.setIcon(qIcon);
                status.setActionCommand(index + "");
                status.addActionListener(myListener);
            }   
            else if (currStudent.getAttending().getAttended())
            {
                status.setIcon(attendedIcon);
            }
            else
            {
                status.setIcon(absentIcon);
            }

            newPanel.add(status);
            newPanel.add(nameLabel);

            JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JCheckBox chatCheck = new JCheckBox("Chat");
            chatCheck.setSelected(currStudent.getPriv(Privilege.kChat));
            chatCheck.setActionCommand(index + ":chat");

            JCheckBox drawCheck = new JCheckBox("Draw");
            drawCheck.setSelected(currStudent.getPriv(Privilege.kDraw));
            drawCheck.setActionCommand(index + ":draw");

            JCheckBox assignCheck = new JCheckBox("Assign");
            assignCheck.setSelected(currStudent.getPriv(Privilege.kAssign));
            assignCheck.setActionCommand(index + ":assign");
            chatCheck.addActionListener(myListener);
            drawCheck.addActionListener(myListener);
            assignCheck.addActionListener(myListener);
                        
            checkPanel.add(chatCheck);
            checkPanel.add(drawCheck);
            checkPanel.add(assignCheck);
            checkPanel.setName("Check");
            newPanel.add(checkPanel, BorderLayout.EAST);

            listContainer.add(newPanel);
            listContainer.revalidate();

            index++;
        }
    }

    /**
     * Method to pull constantly from the server. 
     */
    private void pull()
    {
        Thread thread = new Thread() 
        {
            public void run() 
            {
                try 
                {
                    java.util.List<String> names;
                    String lastModStudent;
                    Student student;
                    Student lastStud;
                    while (true)
                    {
                        names = stub.getLogins();
                        for (String name : names)
                        {
			    if (roster.getStudentIndexByName(name) != -1)
			    {
				student = roster.getStudent(
				    roster.getStudentIndexByName(name));
                                if (!student.getAttending().getAttended())                            
				{
                                    roster.changeStudentAttended(name);
                                }
			    }
                        }
                        lastModStudent = stub.getLastStudent();
                        if (lastModStudent != null)
                        {
                            lastStud = roster.getStudent(
                                roster.getStudentIndexByName(lastModStudent));
                            boolean[] vals = stub.getPriv();
                            if (vals[0] != lastStud.getPriv(Privilege.kChat) ||
                                vals[1] != lastStud.getPriv(Privilege.kDraw) ||
                                vals[2] != lastStud.getPriv(Privilege.kAssign) )
                            {
                                roster.setAllPriv(roster.getStudentIndexByName(lastModStudent), vals[0], vals[1], vals[2]);
                            }
                        }
                        Thread.sleep(1000);
                    }
                } catch (Exception err) {
                    err.printStackTrace();
                }
            }
        };

        thread.start();
    }

    /**
     * Helper method for getting the model. (Used to login)
     * @return the model the roster gets its data from 
     */
    public RosterModel getModel()
    {
        return roster;
    }
    
    /**
     * Sets the person who opened this eclassroom roster.
     * @param name the name of the user who opened this roster 
     */
    public void belongsTo(String name)
    {
        this.openBy = name; 
    }
    
    /**
     * Standard update method for the roster gui. 
     * @param obs the observable from which it updated from
     * @param ob anything passed from the update
     */
    public void update(Observable obs, Object ob)
    {
        repaintRoster();
        if (openBy != null)
        {
            Student user = roster.getListStudents().get(roster.getStudentIndexByName(openBy));
            if (!(user instanceof Instructor) && (user.getPriv(Privilege.kAssign) == false))
            {
                for (Component component: listContainer.getComponents())
                {
                    JPanel studentPanel = (JPanel) component;
                    for (Component com: studentPanel.getComponents())
                    {
                        if (com.getName() != null && com.getName().equals("Check"))
                        {
                            JPanel checkPanel = (JPanel) com;
                            for (Component cmn: checkPanel.getComponents())
                            {
                                ((JCheckBox)cmn).setEnabled(false);
                            }
                        }
                    }
                }
            }
        }
        RosterQuestion currQ = roster.getQuestion();
        if (currQ != null && roster.getQReady() && !currQ.getResolved())
        {      
            currQ.addObserver(this);
            QuestionDialog questionDiag = new QuestionDialog(currQ, this);
            questionDiag.setLocationRelativeTo(this);
            questionDiag.setVisible(true);
        }
    }
}
