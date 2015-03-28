package taskbar;
import java.util.Collection;

/**
 * The TaskBar object is derived from the overall view of the task bar
 * mentioned in Section 2.1 of the requirements. 
 *									     <p>
 * The windows component of a TaskBar is a collection of 
 * task windows. The save, undo, and redo attributes of a TaskBar
 * are all necessary checks for file operations used by a majority
 * of TaskWindows in the overall program.
 */

public abstract class TaskBar
{
    Collection<TaskWindow> windows;
    TaskWindow data;
    TaskWindow undoData;
    TaskWindow redoData;	

    /*@
      ensures
        undoData.equals(\old(data)) &&
        redoData == null;
     @*/
    abstract void redo();
	
    /**
     * If some tool operation has been performed that sets undo data in the
     * workspace, then the effect of undo is to set workspace data to that
     * undo data, otherwise undo has no effect.  In either case, the undo data
     * of the output workspace is nil, thereby allowing only one level of
     * undo/redo.  If undo data are used, then redo data are set to the
     * original data in the input workspace, thereby enabling the redo
     * operation.
     */
    /*@
      ensures
        undoData == null
          ? data.equals(\old(data)) &&
            undoData == null &&
            redoData == null
          : data.equals(\old(undoData)) &&
            undoData == null &&
            redoData.equals(\old(data));
     @*/
    abstract void undo();
}
