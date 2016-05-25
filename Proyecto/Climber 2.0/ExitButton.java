import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Button returns the player to the menu screen.
 * 
 * @author Abraham B.
 * @version 5.17
 */
public class ExitButton extends Actor
{
    /**
     * Act - The buttin checks for mouse clicked, and when clicked goes back to the main menu.
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Menu newWorld = new Menu();
            Greenfoot.setWorld(newWorld);
        }
    }    
}
