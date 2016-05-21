import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a weapon class, it it thrown by characters to attack.
 * 
 * @author Gerardo H. 
 */
public class Knife extends ScrollActor
{
    private int speed = 10;
    private boolean recoverable;
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collision();
    }
    
    private void move()
    {
        move(speed);
    }
    
    public void setDirection(boolean right){
        if(right){
            setRotation(0);
        }
        else{
            setRotation(180);
        }
    }
    
    private void noMove()
    {
        recoverable = true;
    }
    
    private void collision()
    {
        if(!isTouching(Block.class))
        {
          move();
          recoverable = false;
        }
        else
        {
            noMove();
        }
        if(isTouching(Player.class)){
            Actor a = getOneIntersectingObject(Player.class);
            Player p = (Player)a;
            if(!recoverable){
                p.death();
                removeTouching(Player.class);
            }
            else{
                p.addKnife();
                getWorld().removeObject(this);
            }
        }
        else{
            if(isTouching(Enemy.class)){
                if(!recoverable){
                    removeTouching(Enemy.class);
                }
                else{
    
                }
            }
        }
    }
}
