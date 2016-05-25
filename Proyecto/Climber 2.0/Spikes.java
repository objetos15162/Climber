import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The objects of this class move in a vertical infinite loop and kill on touch.
 * 
 * @author Abraham B
 * @version 12.04.16
 */
public class Spikes extends Block
{   
    private boolean goingUp;
    private boolean starting;
    private int vSpeed;
    private int dSpeed;
    private boolean descend;
    private int startingY;
    private Counter timer;
    
    public Spikes(){
        super();
        goingUp = true;
        starting = true;
        vSpeed = 5;
        descend = false;
        timer = null;
    }
    
    /**
     * Act - do whatever the Spikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkTime();
        if(descend){
            goDown();
        }
        if(starting){
            startingY = getGlobalY();
            starting = false;
        }
        move();
        checkCollision();
    }    
    
    /**
     * Checks if its time to descend.
     */
    public void checkTime(){
        World w = getWorld();
        Level currentLevel = (Level)w;
        timer = currentLevel.getTimer();
        if(timer.getValue() == 15){
            descend = true;
        }
    }
    
    /**
     * Makes the block move verticaly.
     */
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
    
    /**
     * Changes movement direction.
     */
    private void changeDirection(){
        if(goingUp){
            goingUp = false;
        }
        else{
            goingUp = true;
        }
    }
    
    /**
     * Starts the descend.
     */
    public void goDown(){
        if(dSpeed % 5  == 0){
            setLocation(getGlobalX(),getGlobalY()+1);
            startingY ++;
        }
        dSpeed++;
    }
    
    /**
     * Checks for collision with Player.
     */
    private void checkCollision(){
        if(isTouching(Player.class)){
            Actor pl = getOneIntersectingObject(Player.class);
            Player person = (Player) pl;
            person.death();
        }
    }
}
