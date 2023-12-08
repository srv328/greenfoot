import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sand extends World
{

    /**
     * Constructor for objects of class sand.
     * 
     */
    public sand()
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
        elephant elephant = new elephant();
        addObject(elephant,127,164);
    }
}
