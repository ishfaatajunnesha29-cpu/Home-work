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
public class BankAccountMain 
{
    public static void main(String[] args) 
    {
        BankAccount ca=new CurrentAccount("C200",15000);
        BankAccount sa=new SavingsAccount("A100",10000);
        
        double res1=ca.calculateInterest();
        double res2=sa.calculateInterest();
        
        System.out.println("Current Interest: "+res1);
        System.out.println("Savings Interest: "+res2);
    }
    
}
