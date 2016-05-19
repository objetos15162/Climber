import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knife extends ScrollActor
{
    private int speed = 4;
    
    private GreenfootImage run1 = new GreenfootImage("supercuchillodelamuerte.png");
    //private GreenfootImage run2 = new GreenfootImage("knife");
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collision();
    }
    
    private void moveRight()
    {
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
    }
    
    private void noMove()
    {
        setGlobalLocation(getGlobalX() , getGlobalY());
    }
    
    private void collision()
    {
        if(!isTouching(Block.class))
        {
          moveRight();
        }
        else
        {
            noMove();
        }
        
        if(isTouching(Human.class));
        {
            removeTouching(Human.class);
        }
    }
        
}
