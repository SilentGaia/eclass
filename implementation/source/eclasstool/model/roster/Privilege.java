package eclasstool.model.roster;

/**
 * The Privilege class contains the boolean flags 
 * for whether a student can draw, chat, and assign. 
 * 
 * @author Eric Tran (etran04@calpoly.edu)
 *
 */
public class Privilege 
{ 
    /** 
     * Constant representing chat privilege.
     */
    public static final int kChat = 1;
    /** 
     * Constant representing draw privilege.
     */
    public static final int kDraw = 2;
    /** 
     * Constant representing assign privilege.
     */
    public static final int kAssign = 3;

    /**
     * Whether or not a student can draw.
     */
    private boolean canDraw;
    /**
     * Whether or not a student can chat.
     */
    private boolean canChat;
    /**
     * Whether or not a student can assign.
     */
    private boolean canAssign; 

    /**
     * Default constructor for a privilege.
     */
    public Privilege() 
    {
        canChat = false;
        canDraw = false;
        canAssign = false;
    }

    /**
     * Constructor for instructor's privilege
     */
    public Privilege(boolean flag)
    {
        canChat = flag;
        canDraw = flag;
        canAssign = flag;
    }

    /**
     * Get canChat.
     */
    public boolean getChat()
    {
        return canChat;
    }
    
    /**
     * Get canDraw.
     */
    public boolean getDraw()
    {
        return canDraw;
    }
    
    /**
     * Get canAssign.
     */
    public boolean getAssign()
    {
        return canAssign;
    }
    
    /** 
     * Sets canDraw to a flag.
     * @param flag the new privilege value
     */
    public void setCanDraw(boolean flag)
    {
        canDraw = flag; 
    }

    /** 
     * Sets canChat to a flag.
     * @param flag the new privilege value
     */
    public void setCanChat(boolean flag)
    {
        canChat = flag; 
    }

    /** 
     * Sets canAssign to a flag.
     * @param flag the new privilege value
     */
    public void setCanAssign(boolean flag)
    {
        canAssign = flag; 
    }
    
    /**
     * Gets the string representation of a privilege.
     * @return string representation of the privilege
     */
    public String toString()
    {
        return "{Chat: " + canChat + " || Draw: " + canDraw + " || Assign: " + canAssign + "}";
    }
} 