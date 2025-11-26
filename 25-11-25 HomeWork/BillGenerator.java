/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

/**
 *
 * @author ISHFAA TAJ
 */
public class BillGenerator 
{
    public static void main(String[] args)
    {
        ElectricityBill eb=new ElectricityBill(250,5.5);
        eb.bill();
    }
}
