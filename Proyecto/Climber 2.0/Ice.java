import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends Block
{
    
    boolean makeSlide = false;
    Human slider = null;
    
    /**
     * Act - do whatever the Ice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
        if(makeSlide){
            slide(slider);
        }
    }   
    
    private void checkCollision(){
        int spriteWidth = getImage().getWidth();
        int spriteHeight = getImage().getHeight();
        int halfWidth = (int)(spriteWidth/2);
        int lookForPerson = (int)(spriteHeight/-2) - 3;
        Actor personA = getOneObjectAtOffset(-halfWidth,lookForPerson,Human.class);
        Human person = (Human)personA;
        if(person != null){
            allowSlide(person);
        }
    }
    
    private void allowSlide(Human person){
        makeSlide = true;
        slider = person;
    }
    
    private void slide(Human person){
        int spriteWidth = getImage().getWidth();    
        int endOfSprite = getGlobalX() + (int)(spriteWidth/2);
        person.changeCanMove(false);
        if(person.getGlobalX() < endOfSprite){
                person.setGlobalLocation(person.getGlobalX()+3, person.getGlobalY());
        }
        person.changeCanMove(true);
    }
}
