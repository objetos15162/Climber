import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a weapon class, it it thrown by characters to attack.
 * 
 * @author Gerardo H. 
 * @version 0.6
 */
public class Knife extends ScrollActor
{
    private int speed;
    private boolean recoverable;
    
    public Knife(){
        super();
        speed = 10;
    }
    
    /**
     * Act - checks for player or block collision.
     * 
     */
    public void act() 
    {
        collision();
    }
    
    /**
     * Makes the object automaticaly move forward.
     */
    private void move()
    {
        move(speed);
    }
    
    /**
     * Sets the movement direction.
     */
    public void setDirection(boolean right){
        if(right){
            setRotation(0);
        }
        else{
            setRotation(180);
        }
    }
    
    /**
     * Makes the object available for recover.
     */
    private void noMove()
    {
        recoverable = true;
    }
    
    
    /**
     * Checks for collisions with an object and decides what to do.
     */
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
