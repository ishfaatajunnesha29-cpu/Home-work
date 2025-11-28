/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeAreaCalculation;

/**
 *
 * @author ISHFAA TAJ
 */
class Rectangle implements Shape
{
    public double length;
    public double width;
    
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    public double area()
    {
     return length*width;
    }
}
