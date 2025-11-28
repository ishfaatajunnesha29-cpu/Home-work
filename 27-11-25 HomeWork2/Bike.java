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
public class Bike implements Vehicle
{
    @Override
    public void start(String action)
    {
        System.out.println("Bike: "+action);
    }
    @Override
    public void stop(String action)
    {
        System.out.println("Bike "+action);
    }
}
