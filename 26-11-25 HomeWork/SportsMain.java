/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SportsPlayers;

/**
 *
 * @author ISHFAA TAJ
 */
public class SportsMain
{
    public static void main(String[] args) 
    {
        FootballPlayer fb=new FootballPlayer("Messi");
        fb.footBall();
        
        CricketPlayer cp=new CricketPlayer("Dhoni");
        cp.cricket();
    }
    
}
