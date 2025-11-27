/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelBooking;

/**
 *
 * @author ISHFAA TAJ
 */
public class TravelMain
{
    public static void main(String[] args) 
    {
        FlightBooking fb=new FlightBooking("Indigo","6E123");
        fb.flight();
        
        TrainBooking tb=new TrainBooking("Express","12675");
        tb.train();
    }
}
