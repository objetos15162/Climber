import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class prints the controls for the game.
 * 
 * @author Gerardo Heredia.
 * @version 0.1
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        super(800, 600, 1); 
        Label text1 = new Label("(->) Move right",50);
        addObject(text1,getWidth()/2,100);
        
        Label text2 = new Label("(<-) Move left",50);
        addObject(text2,getWidth()/2,200);
        
        Label text3 = new Label("(Z) Jump",50);
        addObject(text3,getWidth()/2,300);
        
        Label text4 = new Label("(X) Throw a knife",50);
        addObject(text4,getWidth()/2,401);
        addObject(new ExitButton(), 100, 100);
    }
}
