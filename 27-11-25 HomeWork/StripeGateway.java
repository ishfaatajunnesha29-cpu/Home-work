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
class StripeGateway extends PaymentGateway
{
    @Override
    void processPayment(int amount)
    {
        System.out.println("processed Rs. "+amount+" via Stripe");
    }
    
}
