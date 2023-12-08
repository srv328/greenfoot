import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg extends World
{

    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        fish fish = new fish();
        addObject(fish,163,313);
        lob lob = new lob();
        addObject(lob,453,215);
        lob.turn(40);
        lob lob2 = new lob();
        addObject(lob2,358,33);
        lob2.turn(70);
        lob lob3 = new lob();
        addObject(lob3,60,162);
        lob3.turn(-50);
        pizza pizza = new pizza();
        addObject(pizza,416,328);
        pizza pizza2 = new pizza();
        addObject(pizza2,550,103);
        pizza pizza3 = new pizza();
        addObject(pizza3,361,156);
        pizza pizza4 = new pizza();
        addObject(pizza4,153,33);
        pizza pizza5 = new pizza();
        addObject(pizza5,196,184);
    }
}
