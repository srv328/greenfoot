import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if (canMove()) {
            move();
        }
        else {
            turnLeft();
        }
    }
    
    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
        
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 50);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 50);
                break;
            case 180:
                facingEdge = (x == 25);
                break;
            case 270:
                facingEdge = (y == 25);
                break;
        }
        
        return !facingEdge;
    }
    
    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }
    
    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft()
    {
        turn(-90);
    }
    
    /**
     * Move one step forward.
     */
    public void move()
    {
        move(1);
    }
}
