/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomshuffle;

/**
 *
 * @author Shahin
 */
public class RandomShuffle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                      17, 18, 19, 20};
        
        
        
        for(int index = nums.length - 1; index > -1; index--)
        {
            int random = (int) (Math.random() * (index + 1));
            int temp = nums[index];
            nums[index] = nums[random];
            nums[random] = temp;
        }
        
        System.out.println("Numbers are: ");
        
        for(int e: nums)
        {
            System.out.print(e + " ");
        }
        System.out.println("\n");

    }
    
}
