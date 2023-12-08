import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wom extends Actor
{
    public boolean ok=true;
    /**
     * Act - do whatever the Wom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld myWorld = (MyWorld) getWorld();
        Fly fly = myWorld.getFly();
        this.turnTowards(fly.getX(),fly.getY());
        edge();
        key();
        touch();
        myWorld.showText("Для управления используйте стрелки",300,50);
    }   
    public void edge()
    {
        if (isAtEdge()){
            turn(60);
            move(15);
        }
    }
    public void key()
    {
        if (Greenfoot.isKeyDown("up")){
            move(1);
        }
        if (Greenfoot.isKeyDown("down")){
            move(-1);
        }
    }
    public void touch()
    {
        if (isTouching(Fly.class)){
            removeTouching(Fly.class);
            Greenfoot.stop();
        }
    }
}
