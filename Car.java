import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int speed;
    public Car(int speed_){
        speed= speed_;
    }
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        ifOnEdgeDestroy();
        
    }    
    public void ifOnEdgeDestroy(){
        if(getX() > 480){
            //getWorld().removeObject(this);
            setLocation(20, getY());
            
        }
    }
}
