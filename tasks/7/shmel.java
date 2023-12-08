import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shmel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shmel extends Actor
{
    private int score=0;
    /**
     * Act - do whatever the shmel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        scoref();
        if (Greenfoot.getRandomNumber(11)<5){
            turn(35);
            Greenfoot.delay(10);
            setImage("bee2.png");
        }
        else{
            turn(2);
            Greenfoot.delay(10);
            setImage("bee.png");
        }
    }
    public void scoref(){
        score++;
        getWorld().showText("score: " + score,60,390);
    }
}
