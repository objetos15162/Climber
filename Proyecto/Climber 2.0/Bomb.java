import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This objects explodes and disapears when touched.
 * 
 * @author Abraham B.
 */
public class Bomb extends Block
{
    private GreenfootImage bomb1 = new GreenfootImage("Bomb_0.png");
    private GreenfootImage bomb2 = new GreenfootImage("Bomb_1.png");
    private int frame = 1;
    private int explosion = 0;
    private boolean ready = false;
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkPlayer();
        if(ready){
            blowUp();
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
