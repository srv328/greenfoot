import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lob extends Actor
{
    /**
     * Act - do whatever the lob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (isAtEdge()){
            turn(30);
        }
        move(2);
        randomturn();
        fish();
    }
    public void randomturn()
    {
        if (Greenfoot.getRandomNumber(60)>50){
            turn(Greenfoot.getRandomNumber(60)-30);
        }
    }
    public void fish()
    {
        if (isTouching(fish.class)){
            removeTouching(fish.class);
            Greenfoot.playSound("end.wav");
            Greenfoot.stop();
        }
    }
}
