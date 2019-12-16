/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointdistance;

/**
 *
 * @author Shahin
 */
public class PointDistance 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double [][] points = CreatePoints();
  
        OutputTable(points);
        
        int p1 = 0;
        int p2 = 1;
        double minDisatnce = Distance(points[p1][0], points[p1][1], points[p2][0],
                                      points[p2][1]);
        
        for(int i = 0; i < points.length; i++)
        {
            for(int j = i + 1; j < points.length; j++)
            {
                double newDistance = Distance(points[i][0], points[i][1],
                                              points[j][0], points[j][1]);
                if(newDistance < minDisatnce)
                {
                    minDisatnce = newDistance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        
        System.out.print("\nShortest Distance is Between points: (" +
                         points[p1][0] + ',' + points[p1][1] + ") and (" +
                         points[p2][0] + ',' + points[p2][1] + ") \nand the" +
                         " distance between them is: ");
        System.out.printf("%.2f\n\n",  minDisatnce);       
    }

    public static double[][] CreatePoints()
    {
        double[][] points = {{5,11}, {17, 9}, {4, 15}, {13, 22}, {-5, -12}};
            
        return points;
    }
    
    public static double Distance(double x1, double y1, double x2, double y2)
    {
        double difX = (x2 - x1) * (x2 - x1);
        double difY = (y2 - y1) * (y2 - y1);
        
        return Math.sqrt(difX + difY);
    }

    public static void OutputTable(double [][] points)
    {
        
        System.out.println("      The Points are\n");
        System.out.printf("%7s %11s", "X", "Y");
        System.out.println("\n--------------------------");
        
        for(int i = 0; i < points.length; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                if(j == 0)
                {
                    System.out.printf("%9.2f", points[i][j]);
                    System.out.printf("%4s", "|");
                }
                else
                {
                    System.out.printf("%8.2f", points[i][j]);
                }
            }
            System.out.println();
        }   
    }
}


