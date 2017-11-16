import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int playerScore;
    private boolean isLeft;
    private boolean scoreChanged;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
        {
            displayScore();
        }
    }    
    
    public void countScore()
    {
        playerScore++;
        scoreChanged = true;
    }
    
    public Score( boolean left )
    {
        playerScore = 0;
        isLeft = left;
        displayScore();
    }
    
    public int getScore()
    {
        return playerScore;
    }
    
    private void displayScore()
    {
        GreenfootImage display;
        if(isLeft == true)
        {
            display = new GreenfootImage( Integer.toString( playerScore ), 30, Color.BLUE, Color.BLACK );
            setImage( display );
            scoreChanged = false;
        }
        else
        {
            display = new GreenfootImage( Integer.toString( playerScore ), 30, Color.GREEN, Color.BLACK);
            setImage( display );
            scoreChanged = false;
        }
    }
}
