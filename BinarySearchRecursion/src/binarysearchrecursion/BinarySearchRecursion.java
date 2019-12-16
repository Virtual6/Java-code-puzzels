/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchrecursion;

/**
 *
 * @author Shahin
 */
public class BinarySearchRecursion 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
                       17, 18, 19, 20, 2000, 2010, 2015, 3066, 7402, 9992};
        
        final int KEY = 2010;
        
        int indexFound = BinarySearch(list, KEY);
        
        if(indexFound != -1)
        {
            System.out.println("Index found was: " + indexFound);
            System.out.println("The Key was: " + list[indexFound]);
        }
        else
        {
            System.out.println("Key entered was not found.");
        }
        
    }
    
    /**
     * 
     * @param list
     * @param KEY
     * @return 
     */
    public static int BinarySearch(int [] list, final int KEY)
    {
        return BinarySearch(list, KEY, 0, list.length - 1);
    }
    
    /**
     * 
     * @param list
     * @param KEY
     * @param low
     * @param high
     * @return 
     */
    private static int BinarySearch(int [] list, final int KEY, int low, int high)
    {
        if(high < low)
        {
            return -1;
        }
        
        int mid = (low + high) / 2;
        
        if(list[mid] == KEY)
        {
            return mid;
        }
        else if(list[mid] < KEY)
        {
            return BinarySearch(list, KEY, mid + 1, high);
        }
        else
        {
            return BinarySearch(list, KEY, low, mid - 1);
        }
    }
}
