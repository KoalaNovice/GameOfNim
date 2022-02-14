import java.util.Random;

public class Board 
{
    private static int numPieces;

    public static void populate() // finds a random amount of gamepieces between 10 and 50 for the game to be played with
    {
        Random random = new Random();
        numPieces = random.nextInt(41) + 10; //value between 10 and 50 both inclusive (the 51 is exclusive)
    }

    //getters - used to get amount of pieces on board
    public static int getNumPieces()
    {
        return numPieces;
    }

    //setters - used to subtract the user input amount of pieces from the board
    public static void removePieces(int pieces)
    {
        numPieces -= pieces;
    }
}