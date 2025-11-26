/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedCalculator;

/**
 *
 * @author ISHFAA TAJ
 */
public class Calculator 
{
    int distance;
    int time;
    Calculator(int distance,int time)
    {
        this.distance=distance;
        this.time=time;
    }
    public void cal()
    {
        int speed=distance/time;
        System.out.println("Distance: "+distance+" km");
        System.out.println("Time: "+time+" hr");
        System.out.println("Speed: "+speed+" km/hr");
    }
}
