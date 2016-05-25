import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The base of every level.
 * 
 * @author Abraham B.
 * @version 10.04.16
 */
public class Block extends ScrollActor
{
    
    private Level currentLevel;
    private Counter timer;
    private boolean descend;
    private int vSpeed;
    
    public Block(){
        super();
        descend = false;
        timer = null;
        vSpeed = 0;
    }
    
    /**
     * Act - Makes blocks descend when the timer reaches the 15 second mark.
     */
    public void act() 
    {
        checkTime();
        if(descend){
            goDown();
        }
    }    
    
    /**
     * Checks if its time to descend.
     */
    public void checkTime(){
        World w = getWorld();
        Level currentLevel = (Level)w;
        timer = currentLevel.getTimer();
        if(timer.getValue() == 15){
            descend = true;
        }
    }
    
    /**
     * Starts the descend.
     */
    public void goDown(){
        if(vSpeed % 5  == 0){
            setLocation(getGlobalX(),getGlobalY()+1);
        }
        vSpeed++;
    }
}
