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
public class PaymentMethodInterface 
{

    public static void main(String[] args)
    {
        PaymentMethod cc=new CreditCard();
        
        cc.pay(250);
    }
    
}
