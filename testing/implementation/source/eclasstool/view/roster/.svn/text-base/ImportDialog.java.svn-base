package eclasstool.view.roster;

import eclasstool.model.roster.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 *
 *  Class   ImportDialog is the dialog  asking for the  html files representing 
 *  the class roster to import.
 *
 *  @author Eric Tran   (etran04@calpoly.edu)
 *
 */
public class ImportDialog
{
    /**
     * Filechooser used to select html files to import students from.
     */
    private JFileChooser fileChoose;

    /**
     * Return value from the filechooser.
     */
    private int returnVal;

    /**
     * Instance of the ui that called this dialog.
     */
    private RosterUI roster;

    /**
     * File with the students name in it. 
     */
    private File studentFile;

    /**
     * List of students to import into the roster.
     */
    private ArrayList<Student> toImport;

    /**
     * Default constructor for the Import  dialog. 
     */
    public ImportDialog(RosterUI roster)
    {
        this.roster = roster;
        fileChoose = new JFileChooser();
        toImport = new ArrayList<Student>();
    }

    /**
     * Retrieves the    response    from the    filechooser.
     * @return list of students to be imported to roster
     */
    public ArrayList<Student> getStudentsToImport()
    {
        return toImport;
    }

    /**
     * Helper method for parseing student file.
     * @param studentFile the file containing the list of students to read from 
     */
    private void makeListFromFile(File studentFile)
    {
        try
        {
            Scanner rdr = new Scanner(studentFile);
            toImport = new ArrayList<Student>();
            String studentName = "";
            while (rdr.hasNextLine())
            {
                studentName = rdr.nextLine();
                toImport.add(new Student(studentName, new AttendanceStatus(), new Privilege()));
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }

    /**
     * Shows the File Chooser
     */ 
    public void showDialog()
    {
        returnVal = fileChoose.showOpenDialog(roster);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            studentFile = fileChoose.getSelectedFile();
            makeListFromFile(studentFile);
        }
    }
}
