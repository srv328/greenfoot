import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dino extends Actor
{
    int type,q,set_image = 0;
    int changing = 0;
    String what_land,dinosaver;
    private GreenfootImage[] dino1 = new GreenfootImage[5];
    private GreenfootImage[] dino2 = new GreenfootImage[5];
    int gen = 0;
    int hp = 3;
    private static final int acceleration = 2;      
    private static final int speed = 10;             
    private static int jumpStrength = 35;
    GreenfootSound game_music;
    private int vSpeed = 0; 
    int current_x = 30;
    int current_y = 30;
    int security = 0;
    boolean DEATH;
    int score;
    boolean swapped;
    private void reScore(){
        if (security%5==0){
            score += Greenfoot.getRandomNumber(3);
            getWorld().showText("Score: " + (score), 720, 40);   
        }
    }
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
    public boolean onGround()
    {
        return ((getX()==140 && getY()==450) || (getX()==140 && getY()==475));
    }
    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    /**
     * Act - do whatever the dino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!DEATH){
            if (set_image==0){
                land myWorld = (land) getWorld();
                type = myWorld.gettype();
                what_land = myWorld.getimage();
                imrand();
                set_image++;
                menu.background.pause();
                Greenfoot.playSound("Rrr.wav");  
                heartin hearting = new heartin();
                getWorld().addObject(hearting,current_x,current_y);
                current_x+=30;
                heartin hearting1 = new heartin();
                getWorld().addObject(hearting1,current_x,current_y);
                current_x+=30;
                heartin hearting2 = new heartin();
                getWorld().addObject(hearting2,current_x,current_y);
                current_x+=30;
            }
            if (type==1){
                image1();
            }
            if (type==2){
                image2();
            }
            if (set_image==1){
                set_image++;
                Greenfoot.delay(100);
                game_music = new GreenfootSound("Big_Slinker.mp3");
                game_music.play();  
                getWorld().removeObjects(getWorld().getObjects(rrr.class));
            }
            gen++;
            if (gen%100==0){
                randomgeneration();
            }
            if (gen%150==0 && gen%100!=0){
                randomgeneration();
            }
            if (gen%250==0 && gen%150!=0 && gen%100!=0){
                randomgeneration();
            }
            if (!swapped){
                space();
                shift();
            }
            else{
                space_swap();
                shift_swap();
                if (gen%700==0){
                    swapped = false;
                    getWorld().removeObjects(getWorld().getObjects(sw.class));
                }
            }
            checkShift();
            checkFall();
            touch_heart();
            touch_emerald();
            touch_ruby();
            reScore();
        }
        smert();
    }
    public void touch_heart(){
        if (isTouching(heart.class)){
            hp++;
            heartin hearting = new heartin();
            removeTouching(heart.class);
            Greenfoot.playSound("hp+.wav");
            getWorld().addObject(hearting,current_x,current_y);
            current_x += 30;
            score += 1000;
        }
    }
    public void touch_emerald(){
        if (isTouching(emerald.class)){
            removeTouching(emerald.class);
            Greenfoot.playSound("hp+.wav");
            score += 3000;
        }
    }
    public void touch_ruby(){
        if (isTouching(ruby.class)){
            removeTouching(ruby.class);
            Greenfoot.playSound("hp+.wav");
            score += 10000;
            swapped = true;
            sw qu = new sw();
            getWorld().addObject(qu,400,100);
            }
    }
    public void smert(){
        if (isTouching(prep.class)){
            hp--;
            removeTouching(prep.class);
            getWorld().removeObjects(getWorld().getObjectsAt(current_x-30, current_y, heartin.class));
            current_x -= 30;
            if (hp==0){
                getWorld().removeObjects(getWorld().getObjects(prep.class));
                getWorld().removeObjects(getWorld().getObjects(boost.class));
                DEATH = true;
                game_music.pause();
                if (type==1){
                    dinosaver = "Dino0.png";
                }
                else{
                    dinosaver = "Dino2_0.png";
                }
                Button restart = new Button("replay.png",new land(what_land,dinosaver));
                getWorld().addObject(restart, 400,300);
            }
            Greenfoot.playSound("loss.wav");
        }
    }
    public void imrand(){
        int i=0;
        while(i<5){
        dino1[i]=new GreenfootImage("Dino"+(i)+".png");  
        dino2[i]=new GreenfootImage("Dino2_"+(i)+".png"); 
        i++; 
        }
    }
    public void image1(){
        if(q!=5){
            if (changing%5==0){
               setImage(dino1[q]);
                q++; 
            }
            changing++;
        }
        else{
            q = 0;
        }
    }
    public void image2(){
        if(q!=5){
            if (changing%5==0){
               setImage(dino2[q]);
                q++; 
            }
            changing++;
        }
        else{
            q = 0;
        }
    }
    public void space(){
        if (Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("shift")){
            if (onGround()){
                jump();
                Greenfoot.playSound("Bdish.wav");
            }
        }
    }
    public void shift(){
        if (onGround() && Greenfoot.isKeyDown("shift") && !Greenfoot.isKeyDown("space")){
            setRotation(65);
            if (getY()==450){
                setLocation(getX(),getY()+25);
            }
        }
    }
    public void space_swap(){
        if (Greenfoot.isKeyDown("shift") && !Greenfoot.isKeyDown("space")){
            if (onGround()){
                jump();
                Greenfoot.playSound("Bdish.wav");
            }
        }
    }
    public void shift_swap(){
        if (onGround() && Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("shift")){
            setRotation(65);
            if (getY()==450){
                setLocation(getX(),getY()+25);
            }
        }
    }
    public void checkShift(){
        if (!Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("shift") && getRotation()==65){
            setRotation(0);
            if (getY()==475){
                setLocation(getX(),getY()-25);
            }
        }
    }
    public void randomgeneration(){
        int random = Greenfoot.getRandomNumber(10000);
        if (random<=100){
            //emerald 
            emerald em = new emerald();
            getWorld().addObject(em,900,450);
        }
        if (random>100 && random<=200){
            //ruby 
            ruby rub = new ruby();
            getWorld().addObject(rub,900,450);
        }
        if (random>200 && random<=300){
            //heart
            heart hear = new heart();
            getWorld().addObject(hear,900,450);
        }
        if (random>300 && random<=6700){
            //cact 1 2 3
            int cact = Greenfoot.getRandomNumber(3);
            if (cact==0){
                cactus0 cact0 = new cactus0();
                getWorld().addObject(cact0,900,475);
            }
            if (cact==1){
                cactus1 cact1 = new cactus1();
                getWorld().addObject(cact1,900,455);
            }
            if (cact==2){
                cactus2 cact2 = new cactus2();
                getWorld().addObject(cact2,900,460);
            }
        }
        if (random>6700 && random<=8300){
            //oblako
            int cloud_chose = Greenfoot.getRandomNumber(2);
            if (cloud_chose==0){
                cloud clou = new cloud();
                getWorld().addObject(clou,800,350);
                cloud clou_0 = new cloud();
                getWorld().addObject(clou_0,800,400);
                cloud clou_1 = new cloud();
                getWorld().addObject(clou_1,750,300);
            }
            else{
                cloud1 clou1 = new cloud1();
                getWorld().addObject(clou1,800,350);
                cloud1 clou1_0 = new cloud1();
                getWorld().addObject(clou1_0,800,400);
                cloud clou_1_1 = new cloud();
                getWorld().addObject(clou_1_1,750,300);
            }
        }
        if (random>8300){
            //bird
            bird bir = new bird();
            getWorld().addObject(bir,900,365);
        }
    }
}
