import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game's main menu.
 * 
 * @author Gerardo Heredia. 
 * @version 0.2
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 600, 1); 
        Label text = new Label("Climber",50);
        addObject(text,getWidth()/2,40);

        prepare();
    }
    
    private void prepare()
    {

        PlayButton playbutton = new PlayButton();
        addObject(playbutton,181,387);
        HelpButton helpbutton = new HelpButton();
        addObject(helpbutton,522,364);
        helpbutton.setLocation(476,386);
        RecordsButton recordsbutton = new RecordsButton();
        addObject(recordsbutton,700,399);
        recordsbutton.setLocation(750,385);
        recordsbutton.setLocation(644,391);
        helpbutton.setLocation(397,383);
        recordsbutton.setLocation(579,383);
    }
}
