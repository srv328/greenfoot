import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        image();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void image(){
    addObject(new chooseworld(),400,190);
    Button land1 = new Button("Land1_set.jpg", new dinosar("Land1.jpg"));
    addObject(land1, 200,310); 
    Button land2 = new Button("Land2_set.jpg", new dinosar("Land2.jpg"));
    addObject(land2, 400,500); 
    Button land3 = new Button("Land3_set.jpg", new dinosar("Land3.jpg"));
    addObject(land3, 600,310); 
    }
}
