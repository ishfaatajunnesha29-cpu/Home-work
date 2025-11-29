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
public class TrackerMain 
{
    public static void main(String[] args) 
    {
        Record sl=new SleepTracker();
        Record st=new StepTracker();
        
        sl.tracker(7);
        st.tracker(5000);
    }
    
}
