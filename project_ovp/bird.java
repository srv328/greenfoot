import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends prep
{
    private GreenfootImage[] bird_image = new GreenfootImage[6];
    int num = 0;
    int animation = 0;
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement(6);
        set_im();
        image();
    }
    public void movement(int speed){
        move(-speed);
        if (getX()==0){
           getWorld().removeObject(this); 
        }
    }
    public void set_im(){
        int i=0;
        while(i<6){
        bird_image[i]=new GreenfootImage("Bird"+(i)+".png"); 
        i++; 
        }
    }
    public void image(){
        if (num!=6){
            animation++;
            if (animation%5==0){
                setImage(bird_image[num]);
                num++;
            }
        }
        else{
            num = 0;
        }
    }
}
