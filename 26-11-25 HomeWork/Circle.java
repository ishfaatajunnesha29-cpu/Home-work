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
public class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void areaCircle()
    {
        double res=Math.PI*radius*radius;
        System.out.println("Area of a Circle is: "+res);
    }
}
