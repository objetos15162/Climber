import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends Block
{
    
    boolean makeSlide = false;
    Player slider = null;
    
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
        List<Player> a;
        a = getObjectsInRange(47, Player.class);
        if(!a.isEmpty()){
            Player person = a.get(a.size()-1);
            if(person != null){
                changeSlide(person);
            }
        }
   }
    
    private void changeSlide(Player person){
        if(makeSlide){
            makeSlide = false;
        }
        else{
            makeSlide = true;
        }
        slider = person;
    }
    
    private void slide(Player person){
        int spriteWidth = getImage().getWidth();    
        int endOfSprite = getGlobalX() + (int)(spriteWidth/2);
        int startOfSprite = getGlobalX() - (int)(spriteWidth/2);
        person.changeCanMove(false);
        if(person.getFacingRight()){
            if(person.getGlobalX() < endOfSprite){
                person.setGlobalLocation(person.getGlobalX()+5, person.getGlobalY());
            }
            else{
                person.changeCanMove(true);
            }
        }
        else{
            if(person.getGlobalX() > startOfSprite){
                person.setGlobalLocation(person.getGlobalX()-5, person.getGlobalY());
            }
            else{
                person.changeCanMove(true);
            }
        }
    }
}
