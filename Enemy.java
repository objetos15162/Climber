import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends ScrollActor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 15;
    private int speed = 4;
    private int frame = 1;
    
    private GreenfootImage run1 = new GreenfootImage("Enemy_right_side1.png");
    private GreenfootImage run2 = new GreenfootImage("Enemy_right_side2.png");
    private GreenfootImage run3 = new GreenfootImage("Enemy_right_side3.png");
    
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
    
    /**
     * 
     */
    private void checkMove(){
        if(getObjectsInRange(1,Player.class).isEmpty()){ 
            moveRight();
        }
        // moveRight();
    }
    
    /**
     * 
     */
    private void moveRight(){
        setLocation(getX() + speed, getY());
        if(animationCounter % 4 == 0){
            animateRight();
        }
    }
    
    /**
     * 
     */
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
            return;
        }
        frame ++;
    }
    
    /**
     * 
     */
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
            return;
        }
        frame ++;
    }
    
    /**
     * 
     */
    private void moveLeft(){
        setLocation(getX() - speed, getY());
        if(animationCounter % 4 == 0){
            animateLeft();
        }
    }
    
    /**
     * 
     */
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        jumping = true;
    }
    
    /**
     * 
     */
    private boolean onGround(){
        int spriteHeight = getImage().getHeight();
        int lookForGround = (int)(spriteHeight/2) + 2;
        
        Actor groundA = getOneObjectAtOffset(0, lookForGround, Block.class);
        if(groundA == null){
            jumping = true;
            return false;
        }
        else{
            moveToGround(groundA);
            return true;
        }
    }
    
    /**
     * 
     */
    private boolean platformAbove(){
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        
        Actor ceilingA = getOneObjectAtOffset(0, yDistance, Block.class);
        if(ceilingA != null){
            vSpeed = 1;
            bopHead(ceilingA);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * 
     */
    private void bopHead(Actor ceiling){
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
    }
    
    /**
     * 
     */
    private void moveToGround(Actor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false; 
    }
    
    /**
     *  
     */
    private void checkFall(){ 
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
}
