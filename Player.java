import java.util.Scanner;

public class Player 
{
    //attributes - variables needed are created to be private to be safe
    private String name = "";
    private int score = 0;
    
    //constructors
    public Player() //used twice in Nim class to create playerOne and Player Two
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: "); // each player created can enter unique name since each instance has its own info
        name = sc.nextLine();
        score = 0; // score and name unique to each instance of the player class
    }
    public Player(String inputName)
    {
        name = inputName;
        score = 0;
    }

    //getters - gets private variables, made so that variables can not be changed by user but their value can be seen
    public int getScore()
    {
        return score;
    }
    public String getName()
    {
        return name;
    }

    //setters - method to actually change the private variable score
    public void setScore()
    {
        score += 1;
    }
}