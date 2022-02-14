/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
 * Short Description - Replica of two player real life 
 * math game called Game of Nim. Game takes two to play,
 * players get rid of anywhere from 1 - 1/2 of the max amount
 * of pieces, person to take the last piece loses.
 * 
 * Colin Finney
 * APCSA - Mrs. Woldseth
 * 2/14/2022
 * 
*/
public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!"); // Intro

    Nim nim = new Nim(); // calls Nim() to create two different player class instances
    nim.play(); // calls method play() which has all game logic
  }
}