import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This object is created when a Bomb block disappears.
 * 
 * @author Abraham B.
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
    
    /**
     * Checks if is thouching a character to cause damage.
     */
    private void checkCollision(){
        if(isTouching(Human.class)){
            Actor pl = getOneIntersectingObject(Player.class);
            Human person = (Human) pl;
            if(person != null){
                person.death();
            }
        }
    }
    
    /**
     * Cheks the time to disappear.
     */
    private void checkTimer(){
        if(timer.millisElapsed() > 600){
            getWorld().removeObject(this);
        }
    }
}
