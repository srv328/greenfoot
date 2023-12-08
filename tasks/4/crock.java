import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crock extends Actor
{
    /**
     * Act - do whatever the crock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    turn(1);
    move(1);
    if (isAtEdge())
    turn(180);
    if (true){
        keys();
    }
    }
    public void keys()
    {
    if (Greenfoot.isKeyDown("down")){
         move(-10);  
        }  
    if (Greenfoot.isKeyDown("up")){
         move(10);  
        }  
    if (Greenfoot.isKeyDown("right")){
         turn(10);  
        }
    if (Greenfoot.isKeyDown("left")){
         turn(-10);  
        }  
    if (Greenfoot.isKeyDown("s")){
         move(-10);  
        }  
    if (Greenfoot.isKeyDown("w")){
         move(10);  
        }  
    if (Greenfoot.isKeyDown("d")){
         turn(10);  
        }
    if (Greenfoot.isKeyDown("a")){
         turn(-10);  
        }  
    }
}
