/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorConstructor;

/**
 *
 * @author ISHFAA TAJ
 */
public class Calculator
{
    int price;
    int discount;
    Calculator(int price,int discount)
    {
        this.price=price;
        this.discount=discount;
    }
    public void cal()
    {
       int finalPrice=price-(price*discount/100);
        System.out.println("Original Price : "+price);
        System.out.println("Discount : "+discount+" %");
        System.out.println("Final Price : "+finalPrice);
    }
}
