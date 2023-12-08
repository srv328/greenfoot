import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dinosar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dinosar extends World
{
    /**
     * Constructor for objects of class dinosar.
     * 
     */
    public dinosar(String land_pic)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new dinoworld(),400,190);
        Button dino1 = new Button("Dino0_set.png",new land(land_pic,"Dino0.png"));
        addObject(dino1, 200,400); 
        Button dino2 = new Button("Dino2_0_set.png",new land(land_pic,"Dino2_0.png"));
        addObject(dino2, 600,400); 
    }
}
