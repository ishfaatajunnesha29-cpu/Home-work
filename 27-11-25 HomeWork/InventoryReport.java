/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportGenerators;

/**
 *
 * @author ISHFAA TAJ
 */
public class InventoryReport extends Report
{
    @Override
    void generate(String message)
    {
        System.out.println("Inventory Report "+message);
    }
}
