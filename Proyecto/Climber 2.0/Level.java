import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends ScrollWorld
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    private Counter playersKnives;
    private Counter playersLives;
    private Counter maxHeight;
    private int startingX = 80;
    private int startingY = 1966;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, 900, 2000); 
        timerDisplay = new Counter("Time: ");
        playersKnives = new Counter("Knives: ");
        timer = new SimpleTimer();
        playersLives = new Counter("Lives: ");
        maxHeight = new Counter("Height: ");
        playersLives.setValue(3);
        addObject(maxHeight, 700, 20);
        addObject(playersLives, 200, 20);
        addObject(timerDisplay, 400, 20);
        addObject(playersKnives, 100, 20);
        prepare();
    }
    
    public void respawn(){
        addObject(new Player(), startingX, startingY);
    }

    public void act(){
        tick();
    }
    
    public Counter getTimer(){
        return timerDisplay;
    }
    
    public Counter getLives(){
        return playersLives;
    }
    
    public void checkHeight(int height){
        if(maxHeight.getValue() < (height - getFullHeight())/-1){
            maxHeight.setValue((height - getFullHeight())/-1);
        }
    }
    
    private void tick(){
        if(timer.millisElapsed() > 1000){
            timerDisplay.add(1);
            timer.mark();
        }
    }
    
    public void addKnife(){
        playersKnives.add(1);
    }
    
    public void removeKnife(){
        playersKnives.add(-1);
    }    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {        
        
    }
}
