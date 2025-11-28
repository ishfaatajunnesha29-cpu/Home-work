/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentGateways;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainPayment
{
    public static void main(String[] args)
    {
        PaymentGateway pg=new PayPalGateway();
        PaymentGateway sg=new StripeGateway();
        
        pg.processPayment(500);
        sg.processPayment(800);
    }
}
