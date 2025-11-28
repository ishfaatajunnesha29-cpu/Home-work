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
abstract class PaymentGateway
{
    abstract void processPayment(int amount);

}
