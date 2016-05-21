import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * The main enemy of the game.
 * 
 * @author Gerardo H.
 */
public class Enemy extends Human
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 1;
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
