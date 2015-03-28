package eclasstool.model.login;

import eclasstool.model.roster.*;
import eclasstool.view.roster.*;
import java.util.*;

/**
 * LoginModel represents the class where all student and user 
 * authentication takes place. 
 * 
 * @author Eric Tran (etran04@calpoly.edu)
 */
public class LoginModel extends Observable
{
    // Contains the name and password of all valid users
    private HashMap<String, String> users; 
    
    // Whether or not login is successful.
    private boolean loginSuccessful;
    
    // Whether or not register is successful
    private boolean registerSuccessful;
    
    // Contains the name of the last user who logged in
    private String lastLoginUser;

    /**
     * Default constructor for the login model. 
     * @param roster roster to pull names from 
     */
    public LoginModel(RosterModel roster)
    {
        users = new HashMap<String, String>();
        RosterModel model = roster;
        
        for (Student currStudent: model.getListStudents())
        {
            users.put(currStudent.getName(), "password");
        }
        
        loginSuccessful = false; 
        registerSuccessful = false;
        lastLoginUser = "";
    }

    /**
     * Registers a user, taking their name and password and adding to database 
     * @param name name of registered user
     * @param password password of registered user
     * @return whether or not login was successful 
     */
    public boolean registerUser(String name, String password)
    {
        users.put(name, password);
        registerSuccessful = true;
        return registerSuccessful;
    }

    /**
     * Attempts to validate the user
     * @param name name of user who tried to log in.
     * @param password attempted password 
     * @return whether or not it was successful 
     */
    public boolean confirmUser(String name, String password)
    {
        if (users.get(name) != null && users.get(name).equals(password))
        {
            // User is valid, put them through 
            loginSuccessful = true;
            lastLoginUser = name;
            
            setChanged();
            notifyObservers(lastLoginUser);
        }
        return loginSuccessful;
    }
    
    /**
     * Allows one to register as a guest. 
     */
    public void guestLogin()
    {
        loginSuccessful = true; 
        setChanged();
        notifyObservers("Guest");
    }

    /**
     * Gets whether or not login was successful. 
     * @return whether or not login was successful
     */
    public boolean getLoginSuccessful()
    {
        return loginSuccessful;
    }

    /**
     * Resetst the succesful values. 
     */
    public void resetSuccess()
    {
        loginSuccessful = false; 
        registerSuccessful = false;
    }

    /**
     * Gets the entire map of users and passwords.
     * @return entire map of users and passwords
     */
    public HashMap<String, String> getUsers()
    {
        return users;
    }

    /**
     * Gets the last user who logged in 
     * @return name of last user who logged in 
     */
    public String getLoginUser()
    {
        return lastLoginUser;
    }
}
