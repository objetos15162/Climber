import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This makes the enemy able to throw knives.
 * 
 * @author Abraham B.
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
        checkCollision();
        platformAbove();
        animationCounter++;
    }    

    /**
     * Checks if the character meets conditions for movement.
     */
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
    
    /**
     * Makes the character throw a knife.
     * @param facingRight The indicatior of the direction.
     */
    public void throwKnife(boolean facingRight){
        if(!throwing){
            if(knives > 0){
                removeKnife();
                Knife k = new Knife();
                if(facingRight){
                    getWorld().addObject(k,getGlobalX() + 40, getGlobalY());
                }
                else{
                    getWorld().addObject(k,getGlobalX() - 40, getGlobalY());            
                }
                k.setDirection(facingRight);
            }
        }
    }
    
    /**
     * Removes a knife from the inventory.
     */
    public void removeKnife(){
        knives -= 1;
    }
    
    /**
     * Refreshes the character's knives.
     */
    private void refreshKnives(){
        if(animationCounter % 50 == 0){
            knives = 1;
            throwing = false;
        }
    }
    
}
