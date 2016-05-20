import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1 extends Level
{

    /**
     * Constructor for objects of class Level_1.
     * 
     */
    public Level_1()
    {
        prepare();
    }
    
    public void prepare(){
        
        addObject(new Player(), 80, 1966);
        addObject(new Block(), 32, 1984);
        addObject(new Block(), 96, 1984);
        addObject(new Block(), 160, 1984);
        addObject(new Block(), 224, 1984);
        addObject(new Block(), 288, 1984);
        addObject(new Block(), 352, 1984);
        addObject(new Block(), 416, 1984);
        addObject(new Block(), 480, 1984);
        addObject(new Block(), 544, 1984);
        addObject(new Block(), 608, 1984);
        addObject(new Block(), 672, 1984);
        addObject(new Block(), 736, 1984);
        addObject(new Block(), 800, 1984);
        addObject(new Block(), 864, 1984);
    }
}
