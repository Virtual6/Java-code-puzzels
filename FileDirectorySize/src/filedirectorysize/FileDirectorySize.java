/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedirectorysize;

/**
 *
 * @author Shahin
 */
import java.util.Scanner;
import java.io.File;

public class FileDirectorySize 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Directory name: ");
        String directory = input.nextLine();
        
        System.out.println(GetSize(new File(directory)) + " bytes.");
    }
    
    public static long GetSize(File file)
    {
        long size = 0;    // stores the total size of all files
        
        if(!file.isDirectory())
        {
            File[] files = file.listFiles(); // all files and sub-directories
            
            for(int i = 0; files != null && i < files.length; i++)
            {
                size += GetSize(files[i]);
            }
        }
        else
        {
            size += file.length();
        }
        
        return size;
    }
    
}
