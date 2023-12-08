import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fish extends Actor
{
    private int Eat = 0;
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
                setLocation(mouse.getX(), mouse.getY());
        }
        eaten();
    }
    public void eaten(){
        if (isTouching(pizza.class)){
            removeTouching(pizza.class);
            Eat += 1;
            Greenfoot.playSound("eda.wav");
            if (Eat==5){
                Greenfoot.playSound("pobeda.wav");
                Greenfoot.stop();
            }
        }
    }
}
