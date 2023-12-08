import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[4];
    int start=0;
    int q=0;
    /**
     * Act - do whatever the dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (start==0){
            Dog();
            start=1;
            Greenfoot.playSound("sound.wav");
        }
        keys();
        gate();
    }
    public void Dog(){
        int i=0;
        while(i<4){
        images[i]=new GreenfootImage("dog"+(i+1)+".png");
        i+=1;
        }
    }
    public void keys(){
        if(Greenfoot.isKeyDown("up")&&Greenfoot.isKeyDown("right")){
            setImage(images[3]);
            move(5);
            turn(6);
        }
        if(Greenfoot.isKeyDown("up")&&Greenfoot.isKeyDown("left")){
            setImage(images[1]);
            move(5);
            turn(-6);
        }
        if(Greenfoot.isKeyDown("down")&&Greenfoot.isKeyDown("right")){
            setImage(images[1]);
            move(-5);
            turn(6);
        }
        if(Greenfoot.isKeyDown("down")&&Greenfoot.isKeyDown("left")){
            setImage(images[3]);
            move(-5);
            turn(-6);
        }
        else if(Greenfoot.isKeyDown("up")){
            setImage(images[1]);
            move(5);
        }
        else if(Greenfoot.isKeyDown("down")){
            move(-5);
            setImage(images[3]);
        }
    }
    public void gate(){
        if (isAtEdge()){
            turn(180);
            move(10);
            }
    }
}
