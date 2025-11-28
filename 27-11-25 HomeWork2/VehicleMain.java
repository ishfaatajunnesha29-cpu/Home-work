/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiclecontrolSystem;

/**
 *
 * @author ISHFAA TAJ
 */
public class VehicleMain
{
    public static void main(String[] args)
    {
        Vehicle c=new Car();
        Vehicle b=new Bike();
        
        c.start("Started");
        b.stop("Stopped");
    }
}
