import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        super(960, 640, 1); 
        Label text1 = new Label("(->) Move to right",50);
        addObject(text1,getWidth()/2,100);
        
        Label text2 = new Label("(<-) Move to left",50);
        addObject(text2,getWidth()/2,200);
        
        Label text3 = new Label("(Z) Jump",50);
        addObject(text3,getWidth()/2,300);
        
        Label text4 = new Label("(X) Throw a knife",50);
        addObject(text4,getWidth()/2,400);
    }
}
