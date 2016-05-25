import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sets the world to Help, which contain the playe's controls.
 * 
 * @author Gerardo H.
 * @version 0.2
 */
public class HelpButton extends Actor
{
    /**
     * Act - Checks for mouse click.
     * When clicked, sends player to the controls screen.
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Help newHelp = new Help();
            Greenfoot.setWorld(newHelp);
        }
        
    }    
}
