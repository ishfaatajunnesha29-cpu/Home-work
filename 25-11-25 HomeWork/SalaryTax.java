/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxDeduction;

/**
 *
 * @author ISHFAA TAJ
 */
public class SalaryTax 
{
    String name;
    int salary;
    int tax;
    SalaryTax(String name,int salary,int tax)   
    {
        this.name=name;
        this.salary=salary;
        this.tax=tax;
    }
    public void netSalary()
    {
        int netsalary=salary-(salary*tax)/100;
        System.out.println("Employee Name: "+name);
        System.out.println("Gross Salary: "+salary);
        System.out.println("Tax: "+tax+" %");
        System.out.println("Net Salary: "+netsalary);
    }
}
