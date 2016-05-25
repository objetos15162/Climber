import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains the base layout for every level.
 * 
 * @author Abraham Berrones. 
 * @version 1.04.16
 */
public class Level extends ScrollWorld
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    private Counter playersKnives;
    private Counter playersLives;
    private Counter maxHeight;
    private Counter totalHeight;
    private int startingX;
    private int startingY;
    
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, 800, 600); 
        startingX = 80;
        startingY = 544;
        timerDisplay = new Counter("Time: ");
        playersKnives = new Counter("Knives: ");
        timer = new SimpleTimer();
        playersLives = new Counter("Lives: ");
        maxHeight = new Counter("Height: ");
        playersLives.setValue(3);
        totalHeight = new Counter("Total Score: ");
        totalHeight.setValue(0);
        addObject(maxHeight, 700, 20);
        addObject(playersLives, 200, 20);
        addObject(timerDisplay, 400, 20);
        addObject(playersKnives, 100, 20);
        prepare();
    }
    
    /**
     * Allows to set the playe's score in the inner variables.
     */
    public void addScore(){
        totalHeight.setValue(totalHeight.getValue() + maxHeight.getValue());
        maxHeight.setValue(0);
    }
    
    /**
     * 
     * @return The total height value.
     */
    public int getScore(){
        return totalHeight.getValue();
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
    
    public Counter getPlayersLives(){
        return playersLives;
    }
    
    public void removeLife(){
        playersLives.add(-1);
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
        addObject(new Player(), 80, 544);
        addObject(new Block(), 32, 584);
        addObject(new Block(), 96, 584);
        addObject(new Block(), 160, 584);
        addObject(new Block(), 224, 584);
        addObject(new Block(), 288, 584);
        addObject(new Block(), 352, 584);
        addObject(new Block(), 416, 584);
        addObject(new Block(), 480, 584);
        addObject(new Block(), 544, 584);
        addObject(new Block(), 608, 584);
        addObject(new Block(), 672, 584);
        addObject(new Block(), 736, 584);
        addObject(new Block(), 800, 584);
    }
}
