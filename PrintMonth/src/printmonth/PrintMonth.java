/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printmonth;

/**
 *
 * @author Shahin
 */

import java.util.Scanner;

public class PrintMonth 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year (format. 2017): ");
        int year = input.nextInt();
        
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        
        PrintCalender(year, month);
    }
    
    /**
     * 
     * @param year
     * @param month 
     */
    public static void PrintCalender(int year, int month)
    {
        PrintMonthTitle(year, month);
        
        PrintMonthBody(year, month);
    }
    
    /**
     * 
     * @param year
     * @param month 
     */
    public static void PrintMonthTitle(int year, int month)
    {
        String [] months = {"January", "Feburary", "March", "April", "June",
                            "July", "August", "September", "October", "November",
                            "December"};
        
        System.out.println("\n        " + months[month - 1] + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");                         
    }
    
    /**
     * 
     * @param year
     * @param month 
     */
    public static void PrintMonthBody(int year, int month)
    {
        int startDay = GetStartDay(year, month);
        
        int numberOfDaysInMonth = GetNumberOfDaysInMonth(year, month);
        
        int i = 0;
        
        for(i = 0; i < startDay; i++)
        {
            System.out.print("    ");
        }
        
        for(i = 1; i <= numberOfDaysInMonth; i++)
        {
            System.out.printf("%4d", i);
            
            if((i +  startDay) % 7 == 0)
            {
                System.out.println();
            }
        }
        
        System.out.println();
        
    }
    
    /**
     * 
     * @param year
     * @param month
     * @return 
     */
    public static int GetStartDay(int year, int month)
    {
        int totalNumberOfDays = GetTotalDays(year, month);
        
        return (totalNumberOfDays + 3) % 7;
    }
    
    /**
     * 
     * @param year
     * @param month
     * @return 
     */
    public static int GetTotalDays(int year, int month)
    {
        int total = 0;
        
        for(int i = 1800; i < year; i++)
        {
            if(IsLeapYear(year))
            {
                total += 366;
            }
            else
            {
                total += 365;
            }
        }
        
        for(int i = 1; i < month; i++)
        {
            total += GetNumberOfDaysInMonth(year, i);
        }
        
        return total;
    }
    
    /**
     * 
     * @param year
     * @param month
     * @return 
     */
    public static int GetNumberOfDaysInMonth(int year, int month)
    {
        if(month == 1 || month == 3  || month == 5|| month == 7 || 
           month == 8 || month == 10 || month == 12)
        {
            return 31;
        }
       
        if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;        
        }
        
        if(month == 2)
        {
            return IsLeapYear(year) ? 29 : 28;
        }
        return 0;
    }
    
    /**
     * 
     * @param year
     * @return 
     */
    public static boolean IsLeapYear(int year)
    {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }
    
}
