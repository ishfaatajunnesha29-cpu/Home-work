/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleMaintenance;

/**
 *
 * @author ISHFAA TAJ
 */
public class Bus extends Vehicle
{
    @Override
    void service(String work1,String work2)
    {
        System.out.println("Bus Serviced: "+work1+" and "+work2+" check");
    }
}
