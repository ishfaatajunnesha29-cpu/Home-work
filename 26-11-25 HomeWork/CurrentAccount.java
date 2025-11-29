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
public class CurrentAccount extends BankAccount
{
    CurrentAccount(String accountNumber,int balance)
    {
        super(accountNumber,balance);
    }
    @Override
    double calculateInterest()
    {
        //1% interest
        return balance*1/100;
    }
}
