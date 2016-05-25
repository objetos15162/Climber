import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * The main enemy of the game.
 * 
 * @author Gerardo H.
 * @version 0.7
 */
public class Enemy extends Human
{
    private int vSpeed;
    private int acceleration;
    private int speed;
    private int frame;
    
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    
    private GreenfootImage run1_l;
    private GreenfootImage run2_l;
    private GreenfootImage run3_l;
        
    private int animationCounter;
    
    public Enemy(){
        super();
        vSpeed = 0;
        acceleration = 1;
        speed = 1;
        frame = 1;
        
        run1 = new GreenfootImage("Enemy_right_side1.png");
        run2 = new GreenfootImage("Enemy_right_side2.png");
        run3 = new GreenfootImage("Enemy_right_side3.png");
    
        run1_l = new GreenfootImage("Enemy_left_side1.png");
        run2_l = new GreenfootImage("Enemy_left_side2.png");
        run3_l = new GreenfootImage("Enemy_left_side3.png");
        
        animationCounter = 0;
        
    }
    
    /**
     * Act - Checks for every aspect in the enviroment that might affect the character, and controls the autonomous movement.
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
     * Checks collision with Player.
     */
    public void checkCollision(){
        if(isTouching(Player.class)){
            Actor a = getOneIntersectingObject(Player.class);
            Player p = (Player)a;
            if(p != null){
                p.death();
            }
        }
    }
    
    /**
     * Checks for movement conditions.
     */
    public void checkMove()
    {
        Player play1 = searchPlayer();
        if(play1 != null){
            if(play1.getGlobalX() < getGlobalX()){
                moveLeft();
            }
            else{
                moveRight();
            }
        }
    }
    
    /**
     * Searches for the player on a given range.
     */
    public Player searchPlayer(){
        List<Player> a;
        a = getObjectsInRange(260, Player.class);
        if(!a.isEmpty()){
            Player person = a.get(a.size()-1);
            if(person != null){
                return person;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    /**
     * Moves the character roght.
     */
    public void moveRight(){
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateRight();
        }
    }
    
    /**
     * Playes the animation for right movement.
     */
    public void animateRight(){
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
    
    /**
     * Plays the animation for left movement.
     */
    public void animateLeft(){
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
    
    /**
     * Moves the character left.
     */
    public void moveLeft(){
        setGlobalLocation(getGlobalX() - speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateLeft();
        }
    }
    
    
    /**
     * Makes character fall to ground.
     */
    private void fall(){
        setGlobalLocation(getGlobalX(), getGlobalY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    /**
     * Checks if the character is mid-air.
     */
    public void checkFall(){
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    
}
