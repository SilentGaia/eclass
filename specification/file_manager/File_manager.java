package file_manager;

import java.util.*;
/**
 * Overhead for file manager.  Takes care of file methods including removing, importing, creating, and opening.
 * Has fields for storing folders and files
 **/
public abstract class File_manager {

   List<Folder> folders;
   /**
     * Removes a selected file from the file manager.  
     * The file is selected within the file manager, so there
     * is a need to check that a file is selected.
     * After the file is deleted, the manager makes sure the files
     * are still in alphabetical/numerical order.
   */
   /*@
      ensures
         //
         //Files are in alphabetical order
         //
         (\forall int i ; i > 0 && (i < folders.size() - 1) ;
            folders.get(i).foldername.compareTo( folders.get(i + 1).foldername) < 0); 
   @*/
   abstract void removeFolder(File file);

   /**
    * Creates a new folder directly insie of the eclass tool.
    * After the folder is created, it is organized within the list
    * of folders alphabetically or numerically.
   */
   /*@
      requires
         //
         //File being creating does not already exist
         //
         (\forall int i ; i > 0 && (i < folders.size()) ;
            folders.get(i).foldername.equals(foldername)) ;
            
      ensures
         //
         //Folders are in alphabetical order
         //
         (\forall int i ; i > 0 && (i < folders.size() - 1) ;
            folders.get(i).foldername.compareTo(folders.get(i + 1).foldername) < 0);             
   @*/
   abstract void createFolder(String foldername);
   
   /**
    * Allows user to rename files.
    * The selected file's name is changed to what the user inputs
   */
   /*@
      requires
         //
         //Folder name does not already exist
         //
         (\forall int i ; i > 0 && (i < folders.size()) ;
            folders.get(i).foldername.equals(new_name)) ;
   @*/
   abstract void renameFolder(String new_name);
   
}
