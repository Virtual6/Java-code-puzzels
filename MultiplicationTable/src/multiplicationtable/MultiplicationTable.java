/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author Shahin
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("                Multiplication Table\n");
        
        for(int i = 0; i <= 9; i++)
        {
            System.out.print("    " + i);
        }
        System.out.println("\n------------------------"
                + "---------------------------");
        
        
        for(int j = 0; j <= 9; j++)
        {
            System.out.print(j + " | ");
            
            for(int i = 0; i <= 9; i++)
            {
                System.out.printf("%-5d", (i*j));
            }
            System.out.println();

        }
    }
    
}
