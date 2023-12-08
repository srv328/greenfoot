import greenfoot.*;

/**
 * Worm. A sand worm. Very yummy. Especially crabs really like it.
 */
public class Worm extends Actor
{
    public void act()
    {
        if (Greenfoot.getRandomNumber(90)>50){
            move(1);    
        }
        if ( isAtEdge() ) 
        {
            turn(25);
        }
        turned();
    }
    public void turned()
    {
        if (Greenfoot.getRandomNumber(10)>8){
            turn(1);    
        }
    }
}