import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends ScrollActor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
    }    
    
    private void checkCollision(){
        if(isTouching(Human.class)){
            Actor pl = getOneIntersectingObject(Player.class);
            Human person = (Human) pl;
            person.death();
            removeTouching(Human.class);
        }
    }
}
