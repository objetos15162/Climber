import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThrowingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThrowingEnemy extends Enemy
{
    private int speed = 2;
    private int animationCounter = 0;
    private int knives = 1;
    private boolean facingRight = true;
    private boolean throwing = false;
    
    /**
     * Act - do whatever the ThrowingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkFall();
        checkMove();
        platformAbove();
        checkThrow();
        animationCounter++;
    }    
    
    public void checkThrow(){
        
    }
    
    public void checkMove()
    {
        Player play1 = searchPlayer();
        if(play1 != null){
            if(play1.getGlobalX() < getGlobalX()){
                moveLeft();
                facingRight = false;
                throwKnife(facingRight);
                throwing = true;
            }
            else{
                moveRight();
                facingRight = true;
                throwKnife(facingRight);
                throwing = true;
            }
        }
    }
    
    public void throwKnife(boolean facingRight){
        if(!throwing){
            if(knives > 0){
                removeKnife();
                Knife k = new Knife();
                if(facingRight){
                    getWorld().addObject(k,getGlobalX() + 20, getGlobalY());
                }
                else{
                    getWorld().addObject(k,getGlobalX() - 20, getGlobalY());            
                }
                k.setDirection(facingRight);
            }
        }
    }
    
    public void removeKnife(){
        knives -= 1;
    }
    
    private void refreshKnives(){
        if(animationCounter % 50 == 0){
            knives = 1;
            throwing = false;
        }
    }
    
}
