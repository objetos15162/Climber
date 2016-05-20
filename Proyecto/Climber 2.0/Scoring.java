import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoring extends World
{
    private Counter score;
    /**
     * Constructor for objects of class Scoring.
     * 
     */
    public Scoring(int newScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        score = new Counter("Total height: ");
        setScore(newScore);
        addObject(score, getWidth()/2, getHeight()/2);
        addObject(new ExitButton(), 100,100);
    }
    
    private void setScore(int num){
        score.setValue(num);
        if (UserInfo.isStorageAvailable()) {
             UserInfo myInfo = UserInfo.getMyInfo();
             if (num > myInfo.getScore()) {
                 myInfo.setScore(num);
                 myInfo.store();
             }
         }
    }
}
