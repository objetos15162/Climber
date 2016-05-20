import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_3 extends Level
{

    /**
     * Constructor for objects of class Level_3.
     * 
     */
    public Level_3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block23 = new Block();
        addObject(block23,737,554);
        Block block24 = new Block();
        addObject(block24,737,543);
        Block block25 = new Block();
        addObject(block25,736,526);
        block25.setLocation(736,514);
        Block block26 = new Block();
        addObject(block26,722,510);
        block26.setLocation(736,484);
        Knife knife3 = new Knife();
        addObject(knife3,688,552);
        Knife knife4 = new Knife();
        addObject(knife4,683,526);
        Knife knife5 = new Knife();
        addObject(knife5,685,510);
        Knife knife6 = new Knife();
        addObject(knife6,691,494);
        Bomb bomb = new Bomb();
        addObject(bomb,571,455);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,505,458);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,465,458);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,416,455);
        bomb2.setLocation(509,455);
        bomb4.setLocation(394,455);
        bomb3.setLocation(447,455);
        bomb4.setLocation(384,454);
    }
}
