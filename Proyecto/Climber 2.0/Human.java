import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends ScrollActor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private boolean canMove = true;
    private boolean throwing = false;
    private int speed = 4;
    private int frame = 1;
    private int animationCounter = 0;
    private int knives = 0;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    
    /**
     * Returns the canMove variable.
     * @return canMove
     */
    public boolean getCanMove(){
        return canMove;
    }
    
    /**
     * Returns the jumping boolean.
     * @return jumping
     */
    public boolean getJumping(){
        return jumping;
    }
    
    /**
     * Returns the throwing variable to see if a character is currently throwing.
     * @return throwing
     */
    public boolean getThrowing(){
        return throwing;
    }
    
    /**
     * Returns a boolean that tells you whether the character is touching ground or not.
     * @return boolean
     */
    public boolean onGround(){
        int spriteHeight = getImage().getHeight();
        int lookForGround = (int)(spriteHeight/2) + 2;
        
        Actor groundA = getOneObjectAtOffset(0, lookForGround, Block.class);
        ScrollActor ground = (ScrollActor)groundA;
        
        if(ground == null){
            jumping = true;
            return false;
        }
        else{
            moveToGround(ground);
            return true;
        }
    }
    
    /**
     * Returns a boolean that tells you if there´s a roof over your head.
     */
    public boolean platformAbove(){
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        
        Actor ceilingA = getOneObjectAtOffset(0, yDistance, Block.class);
        ScrollActor ceiling = (ScrollActor)ceilingA;
        
        if(ceiling != null){
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Places the character in the correct position after touching the ceiling.
     * @param ceiling The object that the character is coliding with.
     */
    public void bopHead(ScrollActor ceiling){
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getGlobalY() + (ceilingHeight + getImage().getHeight())/2;
        
        setGlobalLocation(getGlobalX(), newY);
    }
    
    /**
     * Places the character in the correct position after touching the ground.
     * @param ground The object that the character is coliding with.
     */
    public void moveToGround(ScrollActor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getGlobalY() - (groundHeight + getImage().getHeight())/2;
        newY -=2;
        
        setGlobalLocation(getGlobalX(), newY);
        jumping = false;
    }
    
    /**
     * Exists only as a placeholder for the real method.
     */
    public void death(){
        
    }   
    
    /**
     * Changes the variable that allows a character to move.
     */
    public void changeCanMove(boolean movement){
        canMove = movement;
    }
    
    /**
     * Changes the variable that allows a character to jump.
     */
    public void changeJumping(boolean onAir){
        jumping = onAir;
    }
    
    /**
     * Changes the variable that allows a character to throw.
     */
    public void changeThrowing(boolean onThrow){
        throwing = onThrow;
    }
    
    /**
     * Creates and "throws" a Knife object.
     * @param facingRight The direction indicator.
     */
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
    
    /**
     * Adds a Knife object to the inventory.
     */
    public void addKnife(){
        knives += 1;
        World w = getWorld();
        Level l = (Level)w;
        l.addKnife();
    }
    
    /**
     * Removes a Knife object from the inventory.
     */
    public void removeKnife(){
        knives -= 1;
        World w = getWorld();
        Level l = (Level)w;
        l.removeKnife();
    }
}
