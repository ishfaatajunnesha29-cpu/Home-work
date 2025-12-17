/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleAreaCaluculator;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class CircleAreaMain 
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        final double pi = Math.PI;
        System.out.print("Enter a radius to find area of circle : ");
        int radius = Sc.nextInt();
        
        double res = CircleArea.circleArea(pi, radius);
        System.out.println("Area of a Circle is : "+res);
        
    }
    
}
