package eclasstool.model.server;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import eclasstool.model.chat.*;
import eclasstool.model.roster.*;
import java.util.*;

/**
 * Server handles all method invocations from
 * clients and sets the commments accordingly.
 * @author Daniel Lee
 */
public class Server implements RemoteChat {
   private ArrayList<String> comments;
   private ArrayList<String> names;
   private ArrayList<Chat> chats;
   private String lastChangedStudent;
   private boolean[] newPrivVals;

   /**
    * Constructs a server initializing all of its components.
    *
    */
   public Server() 
   {
      chats = new ArrayList<Chat>();
      comments = new ArrayList<String>();
      names = new ArrayList<String>();
      lastChangedStudent = null;
   }

   /**
    * Adds the comments to the list of comments.
    * 
    * @param comments the given comment to add
    */
   public void addComment(String comment)
   {
      comments.add(comment);

      for (Chat chat : chats)
      {
         chat.changeState();
      }
   }

   /**
    * Gets the list of comments as a string.
    *
    * @return a string representation of all comments
    */
   public String getComments() 
   {
      String result = "";

      for (String comment : comments) {
         result += comment + "\n";
      }

      return result;
   }

   /**
    * Adds a client to the list of observers for this server.
    *
    * @param obs the observer to add
    */
   public void addClient(Chat chat) {
      chats.add(chat);
   }

   /**
    * Adds the logged in user into the server.
    * 
    * @param name the name of the user to add
    */
   public void addLogin(String name) {
      names.add(name);
   }

   /**
    * Gets the list of users logged in.
    *
    * @return the list of users logged in as strings
    */
   public List<String> getLogins() {
      return names;
   }

   /**
    * Sets the privileges of the last logged in user.
    *
    * @param vals the privileges to be set
    */
   public void setPriv(boolean[] vals)
   {
      newPrivVals = vals;
   }

   /**
    * Gets the privileges of the last logged in user.
    *
    * @return the list of privileges of the last logged in user
    */
   public boolean[] getPriv()
   {
      return newPrivVals;
   }

   /**
    * Gets the last student that was logged in as a string.
    *
    * @return the name of the student that logged in
    */
   public String getLastStudent()
   {
      return lastChangedStudent;
   }

   /**
    * Sets the last logged in student.
    *
    * @param studentName the name of the student that last logged in.
    */
   public void setLastModStudent(String studentName)
   {
      lastChangedStudent = studentName;
   }

   /**
    * Main method to run the server.
    *
    */
   public static void main(String args[]) {
      Registry registry;

      try {
         Server obj = new Server();
         LocateRegistry.createRegistry(1099);
         RemoteChat stub = (RemoteChat) UnicastRemoteObject.
            exportObject(obj, 0);

         // Bind the remote object's stub in the registry
         registry = LocateRegistry.getRegistry();
         registry.bind("chat", stub);

         System.err.println("Server ready");
      } catch (Exception e) {
         System.err.println("Server exception: ");
         e.printStackTrace();
      }
   }
}
