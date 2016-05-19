import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knife extends ScrollActor
{
    private int speed = 5;
    private boolean recoverable;
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collision();
    }
    
    private void moveRight()
    {
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
    }
    
    private void noMove()
    {
        recoverable = true;
    }
    
    private void collision()
    {
        if(!isTouching(Block.class))
        {
          moveRight();
          recoverable = false;
        }
        else
        {
            noMove();
        }
        if(isTouching(Player.class)){
            if(!recoverable){
                removeTouching(Player.class);
            }
            else{
                Actor a = getOneIntersectingObject(Player.class);
                Player p = (Player)a;
                p.addKnife();
                getWorld().removeObject(this);
            }
        }
    }
}
