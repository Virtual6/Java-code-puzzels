/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromerecursion;

/**
 *
 * @author Shahin
 */

import java.util.Scanner;

public class PalindromeRecursion 
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
        return IsPalindrome(word, 0, word.length() - 1);
    }
    
    private static boolean IsPalindrome(String word, int low, int high)
    {
        if(low >= high)
        {
            return true;
        }
        else if(word.charAt(low) != word.charAt(high))
        {
            return false;
        }
        else
        {
            return IsPalindrome(word, low + 1, high - 1);
        }
    }
    
}
