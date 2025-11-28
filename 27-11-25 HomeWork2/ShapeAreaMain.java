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
public class ShapeAreaMain
{
    public static void main(String[] args)
    {
        Shape r=new Rectangle(10,5);
        Shape c=new Circle(6);
        
        double res1=r.area();
        double res2=c.area();
        
        System.out.println("Area of Rectangle: "+res1);
        System.out.println("Area of Circle: "+res2);
    }
}
