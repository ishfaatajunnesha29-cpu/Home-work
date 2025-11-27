/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeAreaCalculator;

/**
 *
 * @author ISHFAA TAJ
 */
public class Rectangle extends Shape
{
    double length;
    double breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void rectangleArea()
    {
        double res=length*breadth;
        System.out.println("Area of a Rectangle is: "+res);
    }
}
