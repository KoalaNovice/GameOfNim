import java.util.Random;
import java.util.Scanner;

public class Nim
{
    private Player playerOne;
    private Player playerTwo;

    public Nim()//constructor that creates two seperate player class instances, one for each player in the game.
    {
        System.out.println("First player: ");
        playerOne = new Player();
        System.out.println("Second player: ");
        playerTwo = new Player();
    }

    public void play() //Method that contains actual game logic
    {
        Random rand = new Random(); //Establish variables needed
        int currentPlayer = rand.nextInt(2) + 1; //random player chosen to start, starting player of rematches is winner
        int choice;
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);

        while(playAgain) // Game in progress part of code, this while loop runs until game is over
        {
            Board.populate();  // Chooses random amount of pieces for the board between 10 and 50 inclusive
            while(Board.getNumPieces() > 0)
            {
                System.out.println(currentPlayer);
                System.out.println("There are " + Board.getNumPieces() + " pieces left.");
                if(currentPlayer == 1) //uses if statements to figure out who's turn it is
                {
                    System.out.println("It is " + playerOne.getName() + "'s turn. ");
                }
                else if(currentPlayer == 2)
                {
                    System.out.println("It is " + playerTwo.getName() + "'s turn. ");
                }
                System.out.print("Amount of pieces you want to take: "); //asks for currentPlayer users input for pieces to remove
                choice = sc.nextInt();
                while(choice > Board.getNumPieces()/2 || choice < 1) //While statement repeatedly asks for an eligible answer until ones given
                {
                    System.out.println("You are only allowed to take up to half the pieces on the board!");
                    System.out.print("Amount of pieces you want to take: ");
                    choice = sc.nextInt();
                }
                Board.removePieces(choice); //After current player gives eligible answer, answer amount of pieces are removed from the game
                if(currentPlayer == 1) //changes the player turn to the other player and while loop keeps continuing until only 1 piece left
                {
                    currentPlayer = 2;
                }
                else if(currentPlayer == 2)
                {
                    currentPlayer = 1;
                }
            }
            if(currentPlayer == 1)//Runs once only 1 gamepiece left/gameover and determines winner and gives them a point
            {
                System.out.println(playerOne.getName() + " you lost, better luck next time.");
                playerOne.setScore();
            }
            else if(currentPlayer == 2)
            {
                System.out.println(playerTwo.getName() + " you lost, better luck next time.");
                playerTwo.setScore();
            }

            System.out.print("Do you want to play again? (true/false):");
            playAgain = sc.nextBoolean();   //Detects user input booleans true/false to see if user wants to play again, then starts back again
        }
        //Displays final amount of wins/score after players choose to stop
        System.out.println("\n" + playerOne.getName() + " won " + playerOne.getScore() + " time(s).");
        System.out.println(playerTwo.getName() + " won " + playerTwo.getScore() + " time(s).");
    }
}