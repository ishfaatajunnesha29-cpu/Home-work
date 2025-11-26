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
public class ElectricityBill
{
    int unit;
    double costPerUnit;
    ElectricityBill(int unit,double costPerUnit)
    {
        this.unit=unit;
        this.costPerUnit=costPerUnit;
    }
    public void bill()
    {
        double totalBill=unit*costPerUnit;
        System.out.println("Unit : "+unit);
        System.out.println("Cost Per Unit : "+costPerUnit);
        System.out.println("Total Bill : "+totalBill);
    }
}
