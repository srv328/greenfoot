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
        shmel shmel = new shmel();
        addObject(shmel,286,184);
        bee1 bee1 = new bee1();
        addObject(bee1,510,134);
        bee1.setLocation(504,178);
        shmel shmel2 = new shmel();
        addObject(shmel2,464,111);
        bee1.setLocation(505,187);
        bee1.setLocation(486,241);
        removeObject(bee1);
        shmel.setLocation(370,200);
        bee1 bee12 = new bee1();
        addObject(bee12,300,111);
        shmel.setLocation(341,208);
        removeObject(shmel);
    }
}
