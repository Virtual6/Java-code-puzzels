/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateclass;

/**
 *
 * @author Shahin
 */

import javafx.geometry.Point2D;
import java.util.Scanner;

public class DateClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        String[] tokens = "Java.C?C#,C++".split("[.,:;?]");
        
        for(int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i]);
        
        Scanner input = new Scanner(System.in);
        
        java.util.Date date = new java.util.Date();
        System.out.println("Time is: " + date.toString());
 
        java.util.Random rand = new java.util.Random();
        
        rand.setSeed(3);
        System.out.println(rand.nextInt(10000));
        rand.setSeed(4);
        System.out.println(rand.nextInt(10000));
        
        System.out.print("Enter Points 1 (X1, Y1): ");
        double x1 = input.nextInt();
        double y1 = input.nextInt();
        
        System.out.print("Enter Points 2 (X2, Y2): ");
        double x2 = input.nextInt();
        double y2 = input.nextInt();
        
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        
        System.out.println("Point one is: " + p1.toString());
        System.out.println("Point Two is: " + p2.toString());
        
        System.out.println("Distance between p1 and p2 is: " + p1.distance(p2));
        
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        
        
    }
    
}
