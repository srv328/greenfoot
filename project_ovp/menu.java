import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    private int timer = 0;
    public static GreenfootSound background;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Button startButton = new Button("start.png", new Play());
        addObject(startButton, 413,460); 
    }  
    public void act()
    {
        timer++;
        if (timer == 1)
        {
            background = new GreenfootSound("background.mp3");
            background.play();   
        }
    }
}
