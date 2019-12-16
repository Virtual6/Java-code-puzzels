/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessingnumber;

/**
 *
 * @author Shahin
 */

import java.util.Scanner;

public class GuessingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Guess what number the computer has in mind: ");
        int answer = input.nextInt();
        System.out.println();
        int randomNumber = 27 + (int)(Math.random() * 60);
        
        while(answer != randomNumber && answer != -1)
        {
           
          System.out.print("Try Again: ");
          answer = input.nextInt();  
        }
        
        System.out.println("You got it. the number was " + randomNumber);
    }
    
}
