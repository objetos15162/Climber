import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starts the game.
 * 
 * @author Gerardo H.
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the Button1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Level_1 newWorld = new Level_1();
            Greenfoot.setWorld(newWorld);
        }
    }    
}
