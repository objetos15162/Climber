import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sends the player to the Records screen.
 * 
 * @author Gerardo H. 
 * @version 0.1
 */
public class RecordsButton extends Actor
{
    /**
     * Act - Checks for mouse click.
     * Ehen clicked, sends the player to the records screen.
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new ScoreBoard(480, 350), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().addObject(new ExitButton(), 100, 100);
        }
    }    
}
