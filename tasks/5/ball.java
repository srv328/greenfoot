import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int StopGame=0;
    
    public void act()
    {
        checkKeypress();
        Edge();
        berry();
    }
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            move(-5);
        }
    }
    public void Edge()
    {
        if (isAtEdge()){
            turn(Greenfoot.getRandomNumber(100));
            move(10);
        }
    }
    public void berry(){
        if (isTouching(berry.class)){
            removeTouching(berry.class);
            StopGame+=1;
            if (StopGame==9){
                Greenfoot.stop();
            }
        }
    }
}
