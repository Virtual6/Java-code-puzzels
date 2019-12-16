/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveselectionsort;

/**
 *
 * @author Shahin
 */
public class RecursiveSelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int []list = {5, 16, 73, 55, 32, 9, 1, 12, 6, 17, 25, 10, 33, 66, 100};
        
        System.out.print("Unsorted array is: ");
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        
        SortList(list);
        
        System.out.print("\n\nSorted array is: ");

        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }

    }
    
    public static void SortList(int [] list)
    {
        SortList(list, 0, list.length - 1);
    }
    
    private static void SortList(int [] list, int low, int high)
    {
        if(low <= high)   // base case
        {
            int minVal = list[low];
            int indexOfMin = low;

            for(int index = low + 1; index <= high; index++)
            {
                if(list[index] < minVal)
                {
                    minVal = list[index];
                    indexOfMin = index;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = minVal;

            SortList(list, low + 1, high);
        
        } // END if(low <= high)   
    
    } // END public static void SortList(int [] list, int low, int high)   
}
