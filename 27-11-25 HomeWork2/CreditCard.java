/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacehomework;

/**
 *
 * @author ISHFAA TAJ
 */
class CreditCard implements PaymentMethod
{
    @Override
    public void pay(double amount)
    {
        System.out.println("paid $ "+amount+" using Credit Card");
    }
}
