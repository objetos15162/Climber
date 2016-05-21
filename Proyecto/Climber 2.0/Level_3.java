import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_3 extends Level
{

    /**
     * Constructor for objects of class Level_3.
     * 
     */
    public Level_3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block23 = new Block();
        addObject(block23,737,554);
        Block block24 = new Block();
        addObject(block24,737,543);
        Block block25 = new Block();
        addObject(block25,736,526);
        block25.setLocation(736,514);
        Block block26 = new Block();
        addObject(block26,722,510);
        block26.setLocation(736,484);
        Knife knife3 = new Knife();
        addObject(knife3,688,552);
        Knife knife4 = new Knife();
        addObject(knife4,683,526);
        Knife knife5 = new Knife();
        addObject(knife5,685,510);
        Knife knife6 = new Knife();
        addObject(knife6,691,494);
        Bomb bomb = new Bomb();
        addObject(bomb,571,455);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,505,458);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,465,458);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,416,455);
        bomb2.setLocation(509,455);
        bomb4.setLocation(394,455);
        bomb3.setLocation(447,455);
        bomb4.setLocation(384,454);
        Enemy enemy = new Enemy();
        addObject(enemy,422,421);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,487,423);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,550,423);
        Block block5 = new Block();
        addObject(block5,325,334);
        Block block6 = new Block();
        addObject(block6,393,333);
        Block block7 = new Block();
        addObject(block7,601,320);
        Block block8 = new Block();
        addObject(block8,640,327);
        Block block9 = new Block();
        addObject(block9,698,331);
        block9.setLocation(734,327);
        block8.setLocation(672,326);
        block7.setLocation(610,326);
        block6.setLocation(397,349);
        block5.setLocation(337,348);
        enemy.setLocation(381,311);
        enemy2.setLocation(605,283);
        enemy3.setLocation(660,283);
        ThrowingEnemy throwingenemy = new ThrowingEnemy();
        addObject(throwingenemy,734,287);
        Ice ice = new Ice();
        addObject(ice,279,279);
        Ice ice2 = new Ice();
        addObject(ice2,229,280);
        Ice ice3 = new Ice();
        addObject(ice3,164,277);
        ice2.setLocation(216,279);
        ice3.setLocation(161,279);
        ice2.setLocation(221,279);
        ice3.setLocation(162,279);
        Block block10 = new Block();
        addObject(block10,73,254);
        block10.setLocation(102,279);
        Block block11 = new Block();
        addObject(block11,47,279);
        block11.setLocation(42,279);
        Block block12 = new Block();
        addObject(block12,56,186);
        block12.setLocation(160,158);
        Block block13 = new Block();
        addObject(block13,225,154);
        Block block14 = new Block();
        addObject(block14,295,160);
        block13.setLocation(219,158);
        block14.setLocation(284,156);
        block14.setLocation(279,159);
        Spikes spikes = new Spikes();
        addObject(spikes,327,146);
        spikes.setLocation(338,158);
        Block block15 = new Block();
        addObject(block15,399,159);
        Block block16 = new Block();
        addObject(block16,468,156);
        Block block17 = new Block();
        addObject(block17,555,154);
        block16.setLocation(461,159);
        block17.setLocation(600,160);
        Block block18 = new Block();
        addObject(block18,666,164);
        Block block19 = new Block();
        addObject(block19,718,164);
        block18.setLocation(663,159);
        block19.setLocation(719,160);
        block19.setLocation(720,160);
        Block block20 = new Block();
        addObject(block20,689,208);
        block20.setLocation(774,160);
        Door door = new Door();
        addObject(door,713,89);
        door.setLocation(760,99);
        Bomb bomb5 = new Bomb();
        addObject(bomb5,519,174);
        bomb5.setLocation(520,160);
        Bomb bomb6 = new Bomb();
        addObject(bomb6,554,223);
        bomb6.setLocation(555,158);
        ThrowingEnemy throwingenemy2 = new ThrowingEnemy();
        addObject(throwingenemy2,93,240);
        throwingenemy2.setLocation(91,244);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,457,123);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,548,125);
        enemy5.setLocation(549,122);
        Block block21 = new Block();
        addObject(block21,322,460);
        block21.setLocation(326,452);
        Block block22 = new Block();
        addObject(block22,635,461);
        block22.setLocation(625,456);
        enemy5.setLocation(210,120);
        enemy4.setLocation(277,116);
    }
}
