/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthTracker;

/**
 *
 * @author ISHFAA TAJ
 */
public class SleepTracker extends Record
{
    @Override
    void tracker(int value)
    {
        System.out.println("Sleep Duration Recorded: "+value+" hours");
    }
}
