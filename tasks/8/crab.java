import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int score = 0;
    private boolean ok = true;
    
    /**
     * Create a crab and initialize its two images.
     */
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        checkKeypress();
        getWorld().showText("Количество столкновений с забором: "+ score + " раз",350,30);
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        switchimage();
        edge();
    }
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-15);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(15);
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            move(15);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            move(-15);
        }
    }
    public void edge()
    {
        if (isAtEdge()){
            score++;
            turn(120);
            move(20);
            getWorld().showText("Количество столкновений с забором: "+ score + " раз",350,30);
            if (score==5){
                getWorld().showText("Конец игры",325,210);
                Greenfoot.stop();
            }
        }
    }
    public void switchimage()
    {
        if (ok){
            setImage(image1);
            Greenfoot.delay(7);
            ok = false;
        }
        else{
            setImage(image2);
            Greenfoot.delay(7);
            ok = true;
        }
    }
}
