import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes extends Block
{   
    private SimpleTimer timer = new SimpleTimer();
    private boolean goingUp = true;
    private boolean starting = true;
    private int acceleration = 2;
    private int vSpeed = 0;
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
        if(goingUp){
            goUp();
        }
        else{
            goDown();
        }
    }    
    
    private void move(){
        if(timer.millisElapsed()%8000 == 0){
            if(goingUp){
                goingUp = false;
                vSpeed = 0;
            }
            else{
                goingUp = true;
                vSpeed = 0;
            }
        }
    }
    
    private void goUp(){
        if(getGlobalY() == startingY - 80){
            setGlobalLocation(getGlobalX(),getGlobalY()-vSpeed);
            vSpeed = vSpeed + acceleration;
        }
    }
    
    private void goDown(){
        if(getGlobalY() == startingY + 80){
            setGlobalLocation(getGlobalX(),getGlobalY()+vSpeed);
            vSpeed = vSpeed + acceleration;
        }
    }
}
