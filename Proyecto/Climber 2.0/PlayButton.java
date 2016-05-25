import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starts the game.
 * 
 * @author Gerardo H.
 * @version 0.1
 */
public class PlayButton extends Actor
{
    /**
     * Act - Sends player to the fist level when clicked.
     * 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Level1 newWorld = new Level1();
            Greenfoot.setWorld(newWorld);
        }
    }    
}
