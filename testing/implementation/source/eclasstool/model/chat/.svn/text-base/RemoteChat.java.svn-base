package eclasstool.model.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Observer;
import java.util.List;

/**
 * RemoteChat models an interface for handling
 * comments made in the chatroom from client
 * to the server.
 *
 * @author Daniel Lee
 */
public interface RemoteChat extends Remote {
    /**
     * Adds the comments to the list of comments.
     * 
     * @param comments the given comment to add
     */
    public void addComment(String comments) throws RemoteException;
    /**
     * Gets the list of comments as a string.
     *
     * @return a string representation of all comments
     */
    public String getComments() throws RemoteException;
    /**
     * Adds a client to the list of observers for this server.
     *
     * @param obs the observer to add
     */
    public void addClient(Chat chat) throws RemoteException;
    /**
     * Adds the logged in user into the server.
     * 
     * @param name the name of the user to add
     */
    public void addLogin(String name) throws RemoteException;
    /**
     * Gets the list of users logged in.
     *
     * @return the list of users logged in as strings
     */
    public List<String> getLogins() throws RemoteException;
    
    /**
     * Gets the privileges of the last logged in user.
     *
     * @return the list of privileges of the last logged in user
     */
    public boolean[] getPriv() throws RemoteException;
    /**
     * Sets the privileges of the last logged in user.
     *
     * @param vals the privileges to be set
     */
    public void setPriv(boolean[] vals) throws RemoteException; 

    /**
     * Gets the last student that was logged in as a string.
     *
     * @return the name of the student that logged in
     */
    public String getLastStudent() throws RemoteException; 
    /**
     * Sets the last logged in student.
     *
     * @param studentName the name of the student that last logged in.
     */
    public void setLastModStudent(String studentName) throws RemoteException;
}
