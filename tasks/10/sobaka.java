import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sobaka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sobaka extends Actor
{
    private GreenfootImage[] dogerand = new GreenfootImage[7];
    int q=0;
    /**
     * Act - do whatever the sobaka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        imrand();
        im();
    }
    public void imrand(){
        int i=0;
        while(i<7){
        dogerand[i]=new GreenfootImage("dogim"+(i+1)+".png");  
        i++;
        }
    }
    public void im(){
        if(q%50==0){
            setImage(dogerand[Greenfoot.getRandomNumber(7)]);
            Greenfoot.delay(5);
        }
        q++;
    }
}
