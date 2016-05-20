import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends ScrollActor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
        checkTimer();
    }    
    
    private void checkCollision(){
        if(isTouching(Human.class)){
            Actor pl = getOneIntersectingObject(Player.class);
            Human person = (Human) pl;
            if(person != null){
                person.death();
            }
        }
    }
    
    private void checkTimer(){
        if(timer.millisElapsed() > 600){
            getWorld().removeObject(this);
        }
    }
}
