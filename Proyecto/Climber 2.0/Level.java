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
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, 2000, 1000); 
        timerDisplay = new Counter("Time: ");
        playersKnives = new Counter("Knives: ");
        timer = new SimpleTimer();
        addObject(timerDisplay, 300, 20);
        addObject(playersKnives, 100, 20);
        prepare();
    }

    public void act(){
        tick();
    }
    
    public Counter getTimer(){
        return timerDisplay;
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
        Spikes spikes = new Spikes();
        addObject(spikes,362,355);
        Player player = new Player();
        addObject(player,443,211);
        Block block = new Block();
        addObject(block,457,268);
        Bomb bomb = new Bomb();
        addObject(bomb,537,352);
        Ice ice = new Ice();
        addObject(ice,608,240);
    }
}
