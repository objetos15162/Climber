import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This objects explodes and disapears when touched.
 * 
 * @author Abraham B.
 * @version 12.04.16
 */
public class Bomb extends Block
{
    private GreenfootImage bomb1;
    private GreenfootImage bomb2;
    private int frame;
    private int explosion;
    private boolean descend;
    private boolean ready;
    private Counter timer;
    
    public Bomb(){
        super();
        timer = null;
        bomb1 = new GreenfootImage("Bomb_0.png");
        bomb2 = new GreenfootImage("Bomb_1.png");
        frame = 1;
        descend = false;
        explosion = 0;
        ready = false;
    }
    
    /**
     * Act - Checks for player touch. In case that the block is activated the animation starts.
     */
    public void act() 
    {
        checkTime();
        if(descend){
            goDown();
        }
        checkPlayer();
        if(ready){
            blowUp();
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
     * Checks for player tocuh.
     */
    private void checkPlayer(){
        if(isTouching(Human.class)){
            ready = true;
        }
    }
    
    /**
     * Prepares the object to explode and disappea
     */
    private void blowUp(){
        if(explosion % 5 == 0){
            blowUpAnimation();
        }
        if(explosion == 35){
            Explosion e = new Explosion();
            this.getWorld().addObject(e, this.getGlobalX(), this.getGlobalY());
            this.getWorld().removeObject(this);
        }
        explosion++;
    }
    
    /**
     * Animates the explosion.
     */
    private void blowUpAnimation(){
        if(frame == 1){
            setImage(bomb1);
        }
        if(frame == 2){
            setImage(bomb2);
            frame = 0;
        }        
        frame++;
     }
}
