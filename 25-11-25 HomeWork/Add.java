/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineCartTotal;

/**
 *
 * @author ISHFAA TAJ
 */
public class Add
{
    int product1;
    int product2;
    int product3;
    Add(int product1,int product2,int product3)
    {
        this.product1=product1;
        this.product2=product2;
        this.product3=product3;
    }
    public void addProduct()
    {
        int total=product1+product2+product3;
        System.out.println("First Product Price: "+product1);
        System.out.println("Second Product Price: "+product2);
        System.out.println("Third Product Price: "+product3);
        System.out.println("Total Cart Value: "+total);
    }
}
