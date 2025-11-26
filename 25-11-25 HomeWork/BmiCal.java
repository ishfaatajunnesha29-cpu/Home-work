/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

/**
 *
 * @author ISHFAA TAJ
 */
public class BmiCal
{
    int weight;
    double height;
    BmiCal(int weight,double height)
    {
        this.weight=weight;
        this.height=height;
    }
    public void bodyMassIndex()
    {
        double bmi=weight/(height*height);
        System.out.println("Weight : "+weight);
        System.out.println("Height : "+height);
        System.out.println("Body Mass Index : "+bmi);
    }      
}
