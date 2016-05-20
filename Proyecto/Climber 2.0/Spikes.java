import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes extends Block
{   
    private boolean goingUp = true;
    private boolean starting = true;
    private int vSpeed = 5;
    private int startingY;
    
    /**
     * Act - do whatever the Spikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(starting){
            startingY = getGlobalY();
            starting = false;
        }
        move();
        checkCollision();
    }    
    
    private void move(){
        if(goingUp && getGlobalY() > startingY -100){
            setGlobalLocation(getGlobalX(),getGlobalY() - vSpeed);
        }
        else
        if(!goingUp &&  getGlobalY() < startingY +100){
            setGlobalLocation(getGlobalX(),getGlobalY() + vSpeed);
        }
        else
        if(getGlobalY() == startingY - 100 || getGlobalY() == startingY + 100){
            changeDirection();
        }
    }
    
    private void changeDirection(){
        if(goingUp){
            goingUp = false;
        }
        else{
            goingUp = true;
        }
    }
    
    private void checkCollision(){
        if(isTouching(Player.class)){
            Actor pl = getOneIntersectingObject(Player.class);
            Player person = (Player) pl;
            person.death();
        }
    }
}
