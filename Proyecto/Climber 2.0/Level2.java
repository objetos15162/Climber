import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 2's design.
 * 
 * @author Abraham Berrones 
 * @version 1.04.16
 */
public class Level2 extends Level
{

    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level2()
    {
        prepare();
        Door door = new Door();
        addObject(door,48,89);
        door.setLocation(41,83);
        door.setCurrentLevel(2);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ice ice = new Ice();
        addObject(ice,84,478);
        Ice ice2 = new Ice();
        addObject(ice2,142,461);
        Ice ice3 = new Ice();
        addObject(ice3,197,485);
        ice.setLocation(32,464);
        ice2.setLocation(90,463);
        ice2.setLocation(93,464);
        ice3.setLocation(155,464);
        Spikes spikes = new Spikes();
        addObject(spikes,400,518);
        spikes.setLocation(360,457);
        Bomb bomb = new Bomb();
        addObject(bomb,236,458);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,303,465);
        bomb.setLocation(218,463);
        bomb2.setLocation(280,463);
        spikes.setLocation(339,463);
        Block block = new Block();
        addObject(block,490,467);
        Block block2 = new Block();
        addObject(block2,573,442);
        block.setLocation(402,464);
        block2.setLocation(465,465);
        Block block3 = new Block();
        addObject(block3,17,434);
        block3.setLocation(6,431);
        Block block4 = new Block();
        addObject(block4,41,330);
        block4.setLocation(27,321);
        Block block5 = new Block();
        addObject(block5,103,320);
        block5.setLocation(89,321);
        Block block6 = new Block();
        addObject(block6,167,321);
        block6.setLocation(152,321);
        block3.setLocation(9,439);
        block6.setLocation(151,347);
        block5.setLocation(91,346);
        block4.setLocation(30,345);
        block3.setLocation(214,347);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,103,421);
        bomb3.setLocation(103,421);
        bomb3.setLocation(30,433);
        Block block7 = new Block();
        addObject(block7,362,352);
        Block block8 = new Block();
        addObject(block8,451,353);
        Block block9 = new Block();
        addObject(block9,548,353);
        block8.setLocation(421,352);
        block9.setLocation(481,352);
        Ice ice4 = new Ice();
        addObject(ice4,576,357);
        Ice ice5 = new Ice();
        addObject(ice5,645,351);
        ice4.setLocation(539,353);
        ice5.setLocation(600,353);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,669,406);
        Bomb bomb5 = new Bomb();
        addObject(bomb5,708,396);
        bomb4.setLocation(661,352);
        bomb5.setLocation(720,352);
        Block block10 = new Block();
        addObject(block10,777,247);
        Block block11 = new Block();
        addObject(block11,665,253);
        Block block12 = new Block();
        addObject(block12,606,255);
        block11.setLocation(665,248);
        block12.setLocation(605,249);
        ThrowingEnemy throwingenemy = new ThrowingEnemy();
        addObject(throwingenemy,28,303);
        ThrowingEnemy throwingenemy2 = new ThrowingEnemy();
        addObject(throwingenemy2,777,211);
        throwingenemy.setLocation(608,211);
        Knife knife = new Knife();
        addObject(knife,312,359);
        Knife knife2 = new Knife();
        addObject(knife2,563,255);

        Block block13 = new Block();
        addObject(block13,37,236);
        block13.setLocation(26,250);
        Block block14 = new Block();
        addObject(block14,95,255);
        Block block15 = new Block();
        addObject(block15,37,165);
        block15.setLocation(28,148);
        Block block16 = new Block();
        addObject(block16,83,149);
        block16.setLocation(90,148);
        block14.setLocation(89,250);
        Spikes spikes6 = new Spikes();
        addObject(spikes6,726,253);
        spikes6.setLocation(723,248);
        Spikes spikes2 = new Spikes();
        addObject(spikes2,494,252);
        spikes2.setLocation(156,202);
        Block block123 = new Block();
        addObject(block123,297,244);
        block123.setLocation(293,243);
        Block block221 = new Block();
        addObject(block221,325,161);
        block221.setLocation(356,244);
        Block block343 = new Block();
        addObject(block343,331,120);
        block343.setLocation(224,147);
        removeObject(ice);
        removeObject(bomb3);
        Block block20 = new Block();
        addObject(block20,80,420);
        block20.setLocation(31,463);
    Block block21 = new Block();
addObject(block21,668,420);
Block block22 = new Block();
addObject(block22,700,423);
block22.setLocation(774,465);
block21.setLocation(715,465);
}
}
