import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class sends the character to the next level, it works as a goal.
 * 
 * @author Abraham B.
 * @version 13.05.16
 */
public class Door extends ScrollActor
{
    private int currentLevel;
    
    /**
     * Act - Checks if the player is touching it, if it has, he is send to the next level.
     */
    public void act() 
    {
        check();
    }    
    
    /**
     * Checks if the player has touched thee object and sends him to the next level.
     */
    private void check(){
        World w = getWorld();
        Level l = (Level)w;
        if(isTouching(Player.class)){
            if(currentLevel == 1){
                Level2 l2 = new Level2();
                Greenfoot.setWorld(l2);
            }
            if(currentLevel == 2){
                Level3 l3 = new Level3();
                Greenfoot.setWorld(l3);
            }
            if(currentLevel == 3){
                Scoring s = new Scoring(l.getScore());
            }
        }
    }
    
    /**
     * Sets the level in which the object is.
     */
    public void setCurrentLevel(int c){
        currentLevel = c;
    }
}
