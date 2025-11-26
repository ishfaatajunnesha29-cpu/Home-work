/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleAreaCalculator;

/**
 *
 * @author ISHFAA TAJ
 */
public class CircleCalculator 
{
    int radius;
    CircleCalculator(int radius)
    {
        this.radius=radius;
    }
    public void cal()
    {
        double area=(7*7*22)/7;
        System.out.println("Area of Circle is: "+area);
    }
}
