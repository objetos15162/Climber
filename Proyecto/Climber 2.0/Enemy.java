import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
    private int speed = 2;
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
    
    public void moveRight(){
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateRight();
        }
    }
    
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
    
    public void moveLeft(){
        setGlobalLocation(getGlobalX() - speed, getGlobalY());
        
        if(animationCounter % 4 == 0){
            animateLeft();
        }
    }
    
    private void fall(){
        setGlobalLocation(getGlobalX(), getGlobalY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    public void checkFall(){
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    
}
