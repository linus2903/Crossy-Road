import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    int width = 500;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        addObject(new Player(), 275, 425);
        addObject(new Car(1), 0, 20);
        addObject(new Car(2), 0, 110);
        addObject(new Car(3), 0, 200);
    }
    public void act(){
    }
}
