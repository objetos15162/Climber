import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecordsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordsButton extends Actor
{
    /**
     * Act - do whatever the RecordsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new ScoreBoard(480, 350), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().addObject(new ExitButton(), 100, 100);
        }
    }    
}
