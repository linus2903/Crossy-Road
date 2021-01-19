import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int direction = 0;
    int LEFT   = 180;
    int RIGHT   = 0;
    int UP = 270;
    int DOWN = 90;
    int counter = 10;
    boolean isGliding = false;
    int glideDirecktion = 0;

   public void act() 
   {
       ifCarTouched(); 
       checkKey();
       glide();
        
        
   }  
   public void ifCarTouched(){
       Car car = (Car) getOneIntersectingObject(Car.class);
       if(car != null){
        System.out.println("auto berührt");
        }
   }
   public void checkKey()
   {
       String key = Greenfoot.getKey();
        
       if (key != null)
       {
           if (Greenfoot.isKeyDown("w"))
           {
               setRotation(UP);
               isGliding = true;
               counter = 5;
           }
           if (Greenfoot.isKeyDown("s"))
           {
               setRotation(DOWN);
               isGliding = true;
               counter = 5;
           }
           if (Greenfoot.isKeyDown("a"))
           {
               setRotation(LEFT);
               isGliding = true;
               counter = 5;
           }
           if (Greenfoot.isKeyDown("d"))
           {
               isGliding = true;
               glideDirecktion = 4;
               setRotation(RIGHT);
               counter = 5;
           }
       }
   }
   public void glide(){
       if(isGliding){
           move(10);
           counter--;
           if(counter <= 0){
            isGliding = false;
            }
       }
   }
}
