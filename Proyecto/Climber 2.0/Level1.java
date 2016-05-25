import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 1's design.
 * 
 * @author Abraham Berrones. 
 * @version 01.04.16
 */
public class Level1 extends Level
{

    /**
     * Constructor for objects of class Level_1.
     * 
     */
    public Level1()
    {
        prepare();
        Door door = new Door();
        addObject(door,108,79);
        door.setLocation(40,143);
        door.setCurrentLevel(1);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block();
        addObject(block,303,408);
        Block block2 = new Block();
        addObject(block2,421,451);
        Block block3 = new Block();
        addObject(block3,452,449);
        Block block4 = new Block();
        addObject(block4,504,437);
        Block block5 = new Block();
        addObject(block5,534,428);
        block.setLocation(30,464);
        block2.setLocation(92,465);
        block3.setLocation(154,465);
        block4.setLocation(216,466);
        block5.setLocation(277,467);
        Block block6 = new Block();
        addObject(block6,345,473);
        Block block7 = new Block();
        addObject(block7,395,461);
        Block block8 = new Block();
        addObject(block8,506,460);
        block6.setLocation(338,468);
        block7.setLocation(399,468);
        block8.setLocation(460,468);
        Block block9 = new Block();
        addObject(block9,624,440);
        block9.setLocation(770,359);
        Block block10 = new Block();
        addObject(block10,710,459);
        block10.setLocation(519,468);
        Block block11 = new Block();
        addObject(block11,574,487);
        block11.setLocation(582,468);
        Block block12 = new Block();
        addObject(block12,646,488);
        block12.setLocation(643,468);
        Spikes spikes = new Spikes();
        addObject(spikes,710,369);
        spikes.setLocation(708,358);
        Bomb bomb = new Bomb();
        addObject(bomb,517,389);
        bomb.setLocation(646,356);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,506,345);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,558,344);
        bomb3.setLocation(586,355);
        bomb2.setLocation(525,356);
        Block block13 = new Block();
        addObject(block13,428,355);
        Block block14 = new Block();
        addObject(block14,326,354);
        block13.setLocation(464,355);
        Block block15 = new Block();
        addObject(block15,386,390);
        block15.setLocation(267,353);
        Block block16 = new Block();
        addObject(block16,161,349);
        Block block17 = new Block();
        addObject(block17,196,350);
        block16.setLocation(131,349);
        block17.setLocation(204,351);
        block16.setLocation(143,352);
        Enemy enemy = new Enemy();
        addObject(enemy,43,420);
        enemy.setLocation(40,421);
        Block block18 = new Block();
        addObject(block18,47,242);
        block18.setLocation(33,236);
        Block block19 = new Block();
        addObject(block19,300,250);
        Block block20 = new Block();
        addObject(block20,357,257);
        Block block21 = new Block();
        addObject(block21,410,250);
        block19.setLocation(94,236);
        block20.setLocation(155,236);
        block21.setLocation(213,236);
        Block block22 = new Block();
        addObject(block22,367,285);
        block22.setLocation(274,236);
        Block block23 = new Block();
        addObject(block23,360,271);
        block23.setLocation(334,236);
        Spikes spikes2 = new Spikes();
        addObject(spikes2,459,253);
        spikes2.setLocation(397,236);
        Block block24 = new Block();
        addObject(block24,468,242);
        Block block25 = new Block();
        addObject(block25,538,239);
        Block block26 = new Block();
        addObject(block26,599,236);
        block24.setLocation(462,237);
        block25.setLocation(524,237);
        block26.setLocation(586,237);

        Block block28 = new Block();
        addObject(block28,41,174);
        Block block29 = new Block();
        addObject(block29,77,185);
        block28.setLocation(33,205);
        block29.setLocation(94,205);
        addObject(block29,700,245);
        block29.setLocation(710,233);
        Block block30 = new Block();
        addObject(block30,614,185);
        block30.setLocation(772,232);

        Block block31 = new Block();
        addObject(block31,602,330);
        block.setLocation(646,356);
        Block block32 = new Block();
        addObject(block32,38,468);
        block32.setLocation(30,466);
        block31.setLocation(31,464);
        Block block37 = new Block();
        addObject(block37,395,353);
        block37.setLocation(395,355);
    }
}