import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends ScrollActor
{
    private int currentLevel;
    
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }    
    
    private void check(){
        World w = getWorld();
        Level l = (Level)w;
        if(isTouching(Player.class)){
            if(currentLevel == 1){
                Level_2 l2 = new Level_2();
                Greenfoot.setWorld(l2);
            }
            if(currentLevel == 2){
                Level_3 l3 = new Level_3();
                Greenfoot.setWorld(l3);
            }
            if(currentLevel == 3){
                Scoring s = new Scoring(l.getScore());
            }
        }
    }
    
    public void setCurrentLevel(int c){
        currentLevel = c;
    }
}
