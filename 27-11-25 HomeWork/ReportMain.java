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
public class ReportMain 
{
    public static void main(String[] args) 
    {
        Report sr=new SalesReport();
        Report ir=new InventoryReport();
        
        sr.generate("Generated");
        ir.generate("Generated");
    }
    
}
