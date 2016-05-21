import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * When touched, makes the character slide.
 * 
 * @author Abraham B.
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
    
    /**
     * Checks if the player has touched the surface.
     */
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
    
   /**
    * Makes an object available for sliding.
    * @param person The character to make slide.
    */
    private void changeSlide(Player person){
        if(makeSlide){
            makeSlide = false;
        }
        else{
            makeSlide = true;
        }
        slider = person;
    }
    
    /**
     * Makes character slide.
     * @param person The character to slide.
     */
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
                makeSlide = false;
                slider = null;
                person.changeCanMove(true);
            }
        }
        else{
            if(person.getGlobalX() > startOfSprite){
                person.setGlobalLocation(person.getGlobalX()-5, person.getGlobalY());
            }
            else{
                makeSlide = false;
                slider = null;
                person.changeCanMove(true);
            }
        }
    }
}
