package eclasstool.view.roster;

import java.util.*;
import eclasstool.model.roster.*;
import java.awt.event.*;

public class MyListener implements ActionListener 
{
    private RosterModel roster;

    public MyListener(RosterModel model)
    {
        roster = model;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String cameFrom = evt.getActionCommand();
        if (cameFrom.contains(":"))
        {
            StringTokenizer tokens = new StringTokenizer(cameFrom, ":");
            int studentIndex = Integer.parseInt(tokens.nextToken());
            String privilege = tokens.nextToken();
        
            if (privilege.equals("chat"))
            {
                roster.changePrivilege(studentIndex, Privilege.kChat);
            }
            else if (privilege.equals("draw"))
            {
                roster.changePrivilege(studentIndex, Privilege.kDraw);
            }
            else
            {
                roster.changePrivilege(studentIndex, Privilege.kAssign);
            }
        }
        else
        {
            // Opens question dialog 
            roster.setQuestionReady(true);
        }
    }
}
