/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltohex;

/**
 *
 * @author Shahin
 */
import java.util.Scanner;

public class DecimalToHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Decimal Value: ");
        int decimalValue = input.nextInt();
        
        ConvertDecToHex(decimalValue);
    }
    
    public static void ConvertDecToHex(int decimalValue)
    {
        String hex = "";
             
        while(decimalValue!= 0)
        {
            int hexValue = decimalValue % 16;
            
            char hexChar = (hexValue >= 0 && hexValue <= 9 
                            ?(char)('0' + hexValue)
                            : (char)(hexValue - 10 + 'A'));
            
            hex = hexChar + hex;
            
            decimalValue /= 16;
        }
        
        System.out.println("Hex value is: " + hex);
    }
    
}
