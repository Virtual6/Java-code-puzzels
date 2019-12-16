/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Shahin
 */
public class Sorting 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] list = {5, 15, 1, 18, 22, 2, 4, 3, 16, 7, 6, 25};
        
        for(int index = 0; index < list.length - 1; index++)
        {
            int smallest = list[index];
            
            for(int pos = index + 1; pos < list.length; pos++)
            {
                if(list[pos] < smallest)
                {
                    smallest = list[pos];
                    list[pos] = list[index];
                    list[index] = smallest;
                }
            }
        }
        
        
        for(int index = 0; index < list.length; index++)
        {
            System.out.print(list[index] + " ");
        }
       

    }
    
}
