import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud1 extends prep
{
    /**
     * Act - do whatever the cloud1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement(6);
    }
    public void movement(int speed){
        move(-speed);
        if (getX()==0){
           getWorld().removeObject(this); 
        }
    }
}
