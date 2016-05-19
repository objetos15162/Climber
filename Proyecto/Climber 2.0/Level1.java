import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends ScrollWorld
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, 2000, 1000); 
        timerDisplay = new Counter("Time: ");
        timer = new SimpleTimer();
        addObject(timerDisplay, 300, 20);
        prepare();
    }

    public void act(){
        tick();
    }
    
    public SimpleTimer getTimer(){
        return timer;
    }
    
    private void tick(){
        if(timer.millisElapsed() > 1000){
            timerDisplay.add(1);
            timer.mark();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
