import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Block extends Actor
{
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkLeaf();
        checkMouseClick();
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+Greenfoot.getRandomNumber(5), getY()+Greenfoot.getRandomNumber(5));
        turn(Greenfoot.getRandomNumber(50));
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            turn(180);
            setLocation(getX()+Greenfoot.getRandomNumber(5), getY()+Greenfoot.getRandomNumber(5));
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            World world = getWorld();
            List<Leaf> leaves = world.getObjects(Leaf.class);

            for (Leaf leaf : leaves)
            {
                leaf.changeImage();
            }
        }
    }
    
    /**
     * Check whether we're touching a leaf. If we are, turn it a bit.
     */
    private void checkLeaf()
    {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        
        if (leaf != null) {
            leaf.turn(9);
        }
    }
}
