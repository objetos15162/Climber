import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Prints the controls.
 * 
 * @author Gerardo H.
 */
public class HelpButton extends Actor
{
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Help newHelp = new Help();
            Greenfoot.setWorld(newHelp);
        }
        
    }    
}
