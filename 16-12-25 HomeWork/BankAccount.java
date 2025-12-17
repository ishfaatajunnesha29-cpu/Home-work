/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccountNumber;

/**
 *
 * @author ISHFAA TAJ
 */
public class BankAccount 
{
    final String accountNo;
    String bankName;
    
    BankAccount(String accountNo, String bankName)
    {
        this.accountNo = accountNo;
        this.bankName = bankName;
    }
    
    void display()
    {
        System.out.println("Bank Name : "+bankName);
        System.out.println("Account Number : "+accountNo);
    }
    
}
