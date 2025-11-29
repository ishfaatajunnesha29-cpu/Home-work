/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccountTypes;

/**
 *
 * @author ISHFAA TAJ
 */
public class SavingsAccount extends BankAccount
{
    SavingsAccount(String accountNumber,int balance)
    {
        super(accountNumber,balance);
    }
    @Override
    double calculateInterest()
    {
        //4% interest
        return balance*4/100;
    }
}
