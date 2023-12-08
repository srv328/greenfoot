import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class berry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class berry extends Actor
{
    /**
     * Act - do whatever the berry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        edge();
        randomturn();
    }
    public void edge(){
        if (isAtEdge()){
            turn(Greenfoot.getRandomNumber(50));
        }
    }
    public void randomturn(){
        if (Greenfoot.getRandomNumber(100)>91){
            turn(Greenfoot.getRandomNumber(50));
        }
    }
}
