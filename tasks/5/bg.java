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
        ball ball = new ball();
        addObject(ball,331,211);
        berry berry = new berry();
        addObject(berry,503,332);
        berry berry2 = new berry();
        addObject(berry2,331,333);
        berry berry3 = new berry();
        addObject(berry3,244,264);
        berry berry4 = new berry();
        addObject(berry4,62,347);
        berry berry5 = new berry();
        addObject(berry5,83,54);
        berry berry6 = new berry();
        addObject(berry6,531,168);
        berry berry7 = new berry();
        addObject(berry7,426,65);
        berry berry8 = new berry();
        addObject(berry8,239,43);
        berry berry9 = new berry();
        addObject(berry9,132,167);
    }
}
