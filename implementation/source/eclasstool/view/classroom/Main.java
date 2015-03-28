/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclasstool.view.classroom;

import eclasstool.view.taskbar.*;
import eclasstool.view.login.*;
import eclasstool.model.login.*;
import eclasstool.view.roster.*;
import eclasstool.model.chat.*;
import java.util.Observer;
import java.util.Observable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Leah Pichay
 */
public class Main implements Observer {
    private static RosterUI roster;
    private static LoginModel model; 
    private static RemoteChat stub;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new TaskbarUI().setVisible(true);
        Main mainClass = new Main();
        stub = null;
        mainClass.loadServer();
	roster = new RosterUI(stub);
	roster.setVisible(false);
        model = new LoginModel(roster.getModel());
        model.addObserver(mainClass);
        new LoginDialog(model).setVisible(true);
    }

    public void loadServer()
    {
        Registry registry;

        try {
            registry = LocateRegistry.getRegistry(null);
            stub = (RemoteChat) registry.lookup("chat");
        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
    }

    public void update(Observable obs, Object obj)
    {
        String name = (String) obj;
	if (!name.equals("Guest"))
	{
	    roster.getModel().changeStudentAttended(name);
	    roster.belongsTo(name);
	    roster.update(null,null);
	}
        new ClassroomUI(name, roster, stub).setVisible(true);
    }
    
}
