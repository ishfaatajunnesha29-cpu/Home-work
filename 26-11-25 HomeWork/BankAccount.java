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
public class BankAccount 
{
    String accountNumber;
    int balance;
    
    BankAccount(String accountNumber,int balance)
    {
     this.accountNumber=accountNumber;
     this.balance=balance;
    }
    double calculateInterest()
    {
        return 0;
    }
}
