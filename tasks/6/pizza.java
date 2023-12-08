import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza extends Actor
{
    /**
     * Act - do whatever the pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(2);
        if (isAtEdge()){
            turn(45);
        }
        randomturn();
    }
    public void randomturn()
    {
        if (Greenfoot.getRandomNumber(1000)>850){
            turn(Greenfoot.getRandomNumber(90)-60);
        }
    }
}
