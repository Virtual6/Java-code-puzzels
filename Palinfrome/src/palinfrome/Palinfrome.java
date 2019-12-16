/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palinfrome;

/**
 *
 * @author Shahin
 */

import java.util.Scanner;

public class Palinfrome
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string to check for palindrome: ");
        String word = input.nextLine();
   
        if(IsPalindrome(word))
        {
            System.out.println("The word " + word + " is Palindrome.");
        }
        else
        {
            System.out.println("The word " + word + " is NOT Palindrome.");   
        }  
    }
    
    public static boolean IsPalindrome(String word)
    {
        if(word.length() == 1)
        {
            return true;
        }
        else if(word.length() == 2)
        {
            return word.charAt(0) == word.charAt(word.length() - 1);
        }
        else if(word.charAt(0) != word.charAt(word.length() - 1))
        {
            return false;
        }
        else
        {
            return IsPalindrome(word.substring(1, word.length() - 1));
        }
    }
    
    
}
