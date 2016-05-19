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
    private int speed = 4;
    private int frame = 1;
    private int animationCounter = 0;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    
    public boolean getCanMove(){
        return canMove;
    }
    
    public boolean getJumping(){
        return jumping;
    }
    
    /**
     * 
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
    
    public void bopHead(ScrollActor ceiling){
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getGlobalY() + (ceilingHeight + getImage().getHeight())/2;
        
        setGlobalLocation(getGlobalX(), newY);
    }
    
    /**
     * 
     */
    public void moveToGround(ScrollActor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getGlobalY() - (groundHeight + getImage().getHeight())/2;
        
        setGlobalLocation(getGlobalX(), newY);
        jumping = false;
    }
    
    public void death(){
        
    }   
    
    public void changeCanMove(boolean movement){
        canMove = movement;
    }
    
    public void changeJumping(boolean onAir){
        jumping = onAir;
    }
}
