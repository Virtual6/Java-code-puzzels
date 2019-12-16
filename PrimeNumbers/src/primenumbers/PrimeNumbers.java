/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author Shahin
 */

import java.util.Scanner;

public class PrimeNumbers
{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        
        System.out.print("Enter the range for the prime numbers to be printed: ");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        PrintPrimenumbers(number);
    }
    
    public static void PrintPrimenumbers(int number)
    {
        final int NUMBERS_PER_LINE = 10;
        int count = 1;
        
    for(int index = 2; index <= number; index++)
    {
            if(count % NUMBERS_PER_LINE == 0)
            {
                System.out.print("\n");
                count = 1;
            }
            
            if(IsPrime(index))
            {
                System.out.printf("%-6d", index);
                count++;
            }            
        }
        System.out.println("");
    }
   
    
    public static boolean IsPrime(int number)
    {
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
