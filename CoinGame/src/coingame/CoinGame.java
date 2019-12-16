/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coingame;

/**
 *
 * @author Shahin
 */
public class CoinGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Play(5, "Jack", "Jill");
    }
    
    public static void Play(int n, String playerOne, String playerTwo)
    {
        if(n == 3 || n == 1 || n == 2 || n == 4)
        {
            System.out.println(playerOne + " Won the game!");
        }
        else
        {
            Play(n - 1, playerOne, playerTwo);
            System.out.println(playerOne + " took " + n + " coins out.");
            
            Play(n - 2, playerTwo, playerOne);
            System.out.println(playerOne + " took " + n + " coins out.");
            
            Play(n - 4, playerOne, playerTwo);
        }
    }
    
}
