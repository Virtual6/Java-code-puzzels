/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextochar;

/**
 *
 * @author Shahin
 */
import java.util.Scanner;

public class HexToChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Hex value: ");
        String hex = input.nextLine().toUpperCase();
        
        ConvertHexToDecimal(hex);
    }
    
    public static void ConvertHexToDecimal(String hex)
    {
        int decimalValue = 0;
        int count = hex.length();
        
        for(int index = 0; index < hex.length(); index++)
        {
            char hexChar = hex.charAt(index);
            
            int val = CalculateValue(hexChar);
            
            decimalValue += (val * Math.pow(16, --count));
        }
        
        System.out.println("Decimal Vaule of " + hex + " is: " + decimalValue 
                                                               + "\n");
    }
    
    public static int CalculateValue(char hexChar)
    {
        int value;
        
        if(hexChar >= 'A' && hexChar <= 'F')
        {
            value = 10 + hexChar - 'A';
        }
        else
        {
            value = hexChar - '0';
        }
        
        return value;
    }
}
