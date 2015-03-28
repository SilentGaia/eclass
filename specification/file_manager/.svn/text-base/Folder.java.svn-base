package file_manager;

import java.util.*;
/**
 * Folder class for keeping a collection of files together.
 **/
public abstract class Folder {
   List<File> files;
   String foldername;
   /**
    * Imports a file from the user's local machine onto the eclass tool.
    * This requires the file to be an html file, which will be interpreted by
    * the eclass tool and presented as slides.
    * Importing a file requires it to have a .html tag.
   */
   /*@
      requires
         //
         //File being imported does not already exist
         //
         (! (\exists File f_other ;
               files.contains(f_other) ;
                  f_other.filename.equals(file.filename))) ;
      ensures
         //
         //Files are in alphabetical order
         //
         (\forall int i; i > 0 && (i <files.size() - 1) ;
            files.get(i).filename.compareTo(files.get(i + 1).filename) < 0) ;
   @*/
   abstract void importFile(File file);
   /**
    * Creates a new file directly insie of the eclass tool.
    * After the file is created, it is put into the folder
    * specified in its proper alphabetical spot.
   */
   /*@
      requires
         //
         //File being created does not already exist
         //
         (\forall int i ; i > 0 && (i < files.size()) ;
            files.get(i).filename.equals(filename)) ;
      ensures
         //
         //Files are in alphabetical order
         //
         (\forall int i ; i > 0 && (i < files.size() - 1) ;
            files.get(i).filename.compareTo( files.get(i + 1).filename) < 0); 
   @*/
   abstract void createFile(String filename);
   /**
    * Opens a selected file to the presentation area.
    *
   */
   abstract void openFile(File file);
   /**
    * Allows user to rename files.
    * The selected file's name is changed to what the user inputs
   */
   /*@
      requires
         //
         //File rname does not already exist
         //
         (\forall int i ; i > 0 && (i < files.size()) ;
            files.get(i).filename.equals(filename)) ;
   @*/
   abstract void renameFile(String filename);
}
