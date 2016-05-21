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
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Menu newWorld = new Menu();
            Greenfoot.setWorld(newWorld);
        }
    }    
}
