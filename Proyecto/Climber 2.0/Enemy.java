import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Human
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;
    private int frame = 1;
    
    private GreenfootImage run1 = new GreenfootImage("Enemy_right_side1.png");
    private GreenfootImage run2 = new GreenfootImage("Enemy_right_side1.png");
    private GreenfootImage run3 = new GreenfootImage("Enemy_right_side1.png");
    
    private GreenfootImage run1_l = new GreenfootImage("Enemy_left_side1.png");
    private GreenfootImage run2_l = new GreenfootImage("Enemy_left_side2.png");
    private GreenfootImage run3_l = new GreenfootImage("Enemy_left_side3.png");
        
    private int animationCounter = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkFall();
        checkMove();
        platformAbove();
        
        animationCounter++;
    }
    
    private void checkMove()
    {
        
    }
    
    private void moveRight(){
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateRight();
        }
    }
    
    private void animateRight(){
        if(frame == 1){
            setImage(run1);
        }
        else if(frame == 2){
            setImage(run2);
        }
        else if(frame == 3){
            setImage(run3);
            frame = 1;
            return ;
        }
        frame ++;
    }
    
    private void animateLeft(){
        if(frame == 1){
            setImage(run1_l);
        }
        else if(frame == 2){
            setImage(run2_l);
        }
        else if(frame == 3){
            setImage(run3_l);
            frame = 1;
            return ;
        }
        frame ++;
    }
    
    private void moveLeft(){
        setGlobalLocation(getGlobalX() - speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateLeft();
        }
    }
    
    private void fall(){
        setGlobalLocation(getGlobalX(), getGlobalY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    /*private boolean onGround(){
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
    */
    
    /*private boolean platformAbove(){
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
    */
    
    /*private void bopHead(ScrollActor ceiling){
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getGlobalY() + (ceilingHeight + getImage().getHeight())/2;
        
        setGlobalLocation(getGlobalX(), newY);
    }
    */
    /*
    /**
     * 
     */
    
    /*private void moveToGround(ScrollActor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getGlobalY() - (groundHeight + getImage().getHeight())/2;
        
        setGlobalLocation(getGlobalX(), newY);
        jumping = false;
    }
    */
    
    private void checkFall(){
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    
    public void death(){
        
    }
}
