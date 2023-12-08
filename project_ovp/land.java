import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class land here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class land extends World
{
    int type;
    String photo_land;
    /**
     * Constructor for objects of class land.
     * 
     */
    public land(String image,String dino_photo)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground(image);
        photo_land = image;
        
        dino dino = new dino();
        addObject(dino,140,450);
        rrr rrr = new rrr();
        addObject(rrr,400,100);
        if (dino_photo=="Dino2_0.png"){
            type = 2;
        }
        else{
            type = 1;
        }
    }
    public int gettype(){
        return type;
    }
    public String getimage(){
        return photo_land;
    }
}