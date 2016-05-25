import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class that controls everything about the main character.
 * 
 * @author Abraham Berrones B.
 * @version 5.19
 */
public class Player extends Human
{
    
    private int vSpeed;
    private int acceleration;
    private int jumpStrength;
    private int speed;
    private int frame;
    private int lifePoints;
    private int score;
    private int knives;
    private boolean facingRight;
    
    
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    private GreenfootImage run4;
    private GreenfootImage run5;
    private GreenfootImage run6;
    private GreenfootImage run7;
    private GreenfootImage run8;
    
    private GreenfootImage run1_l;
    private GreenfootImage run2_l;
    private GreenfootImage run3_l;
    private GreenfootImage run4_l;
    private GreenfootImage run5_l;
    private GreenfootImage run6_l;
    private GreenfootImage run7_l;
    private GreenfootImage run8_l;
    
    
    private int animationCounter;
    
    
    public Player(){
        super();
        vSpeed = 0;
        acceleration = 1;
        jumpStrength = 15;
        speed = 4;
        frame = 1;
        lifePoints = 3;
        score = 0;
        knives = 1;
        facingRight = true;
        run1 = new GreenfootImage("Human_side_1.png");
        run2 = new GreenfootImage("Human_side_2.png");
        run3 = new GreenfootImage("Human_side_3.png");
        run4 = new GreenfootImage("Human_side_4.png");
        run5 = new GreenfootImage("Human_side_5.png");
        run6 = new GreenfootImage("Human_side_6.png");
        run7 = new GreenfootImage("Human_side_7.png");
        run8 = new GreenfootImage("Human_side_8.png");
    
        run1_l = new GreenfootImage("Human_side_1_l.png");
        run2_l = new GreenfootImage("Human_side_2_l.png");
        run3_l = new GreenfootImage("Human_side_3_l.png");
        run4_l = new GreenfootImage("Human_side_4_l.png");
        run5_l = new GreenfootImage("Human_side_5_l.png");
        run6_l = new GreenfootImage("Human_side_6_l.png");
        run7_l = new GreenfootImage("Human_side_7_l.png");
        run8_l = new GreenfootImage("Human_side_8_l.png");
    
    
        animationCounter = 0;
    }
    
    /**
     * Act - Checks for player input to move.
     * Checks for enviromento to interact with it.
     */
    public void act() 
    {
        
        checkKey();
        platformAbove();
        
        animationCounter++;
        checkFall();
    }    
    
    /**
     * Checks for keys for actions and movement.
     */
    private void checkKey(){
        if(Greenfoot.isKeyDown("z") && getJumping() == false){
            jump();
        }
        if(getCanMove()){
            if(Greenfoot.isKeyDown("right")){
                moveRight();
                facingRight = true;
            }
            if(Greenfoot.isKeyDown("left")){
                moveLeft();
                facingRight = false;
            }
        }
        if(Greenfoot.isKeyDown("x") && getThrowing() == false){
            throwKnife(facingRight);
            changeThrowing(true);
        }
    }
    
    /**
     * Moves the character to the right.
     */
    private void moveRight(){
        if(getXFromCamera() > -10 && getXFromCamera() < 10){
            getWorld().moveCamera(speed);
        }
        setGlobalLocation(getGlobalX() + speed, getGlobalY());
        animationSpeedRight();
    }
    
    
    /**
     * Animates the character when moving right.
     */
    private void animateRight(){
        if(frame == 1){
            setImage(run1);
        }
        else if(frame == 2){
            setImage(run2);
        }
        else if(frame == 3){
            setImage(run3);
        }
        else if(frame == 4){
            setImage(run4);
        }
        else if(frame == 5){
            setImage(run5);
        }
        else if(frame == 6){
            setImage(run6);
        }
        else if(frame == 7){
            setImage(run7);
        }
        else if(frame == 8){
            setImage(run8);
            frame =1;
            return;
        }
        frame ++;
    }
    
    /**
     * Animates the character when moving left.
     */
    private void animateLeft(){
        if(frame == 1){
            setImage(run1_l);
        }
        else if(frame == 2){
            setImage(run2_l);
        }
        else if(frame == 3){
            setImage(run3_l);
        }
        else if(frame == 4){
            setImage(run4_l);
        }
        else if(frame == 5){
            setImage(run5_l);
        }
        else if(frame == 6){
            setImage(run6_l);
        }
        else if(frame == 7){
            setImage(run7_l);
        }
        else if(frame == 8){
            setImage(run8_l);
            frame =1;
            return;
        }
        frame ++;
    }
    
    /**
     * Moves the character left.
     */
    private void moveLeft(){
       
        setGlobalLocation(getGlobalX() - speed, getGlobalY());
        animationSpeedLeft();
    }
    
    /**
     * Makes the character fall when on the air.
     */
    private void fall(){
        
        if(getYFromCamera() > -20 && getYFromCamera() < 20){
            getWorld().setCameraLocation(getGlobalX(),getGlobalY() + vSpeed);
        }
        World w = getWorld();
        Level currentLevel = (Level)(w);
        currentLevel.checkHeight(getGlobalY());
        setGlobalLocation(getGlobalX(), getGlobalY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        changeJumping(true);
    }
  
    /**
     * Checks if the character is mid-air.
     */
    private void checkFall(){
        if(onGround()){
            vSpeed = 0;
        }
        else{
            if(getGlobalY() > 590)
            {
                death();
                changeCanMove(false);
            }
            else{
                fall();
            }
        }
    }
    
    /**
     * Makes the character jump, adding a negative value to the Y coordinate.
     */
    private void jump(){
        if(getYFromCamera() > -20 && getYFromCamera() < 20){
            getWorld().setCameraLocation(getGlobalX(),getGlobalY() + vSpeed);
        }
        vSpeed = vSpeed - jumpStrength;
        changeJumping(true);
        fall();
    }
    
    /**
     * Sets the right animation speed for right movement.
     */
    private void animationSpeedRight()
    {
        if(animationCounter % 4 == 0){
            animateRight();
            changeThrowing(false);
        }
    }
    
    /**
     * Sets the right animation speed for left movement.
     */
    private void animationSpeedLeft() 
    {
        if(animationCounter % 4 == 0){
            animateLeft();
        }
    }
    
    /**
     * Takes away a life point and respawns the character.
     */
    public void death(){
        World w = getWorld();
        Level l = (Level)w;
        if(l.getPlayersLives().getValue() > 0){
            l.removeLife();
            l.respawn();
        }
        else{
            if(l.getPlayersLives().getValue() == 0){
                Label text = new Label("You lose",50);
                getWorld().addObject(text,(getWorld().getWidth()/2),(getWorld().getHeight()/2));
                l.addScore();
                Scoring st = new Scoring(l.getScore());
                Greenfoot.delay(50);
                Greenfoot.setWorld(st);
            }
        }
        getWorld().removeObject(this);
    }
    
    /**
     * Recovers the variable that indicates faced direction.
     */
    public boolean getFacingRight(){
        return facingRight;
    }
}
