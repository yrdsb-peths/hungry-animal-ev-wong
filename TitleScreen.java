import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Ev
 * @version May 1 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    Label insOne = new Label("Use <-- and --> to move", 40);
    Label insTwo = new Label("press <space> to begin", 40);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 350, 100);
        addObject(insOne, 300, 200);
        addObject(insTwo, 300, 300);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld =new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,114,97);
        elephant.setLocation(116,87);
    }
}
