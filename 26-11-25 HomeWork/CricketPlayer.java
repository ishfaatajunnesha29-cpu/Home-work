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
public class CricketPlayer extends Player
{
    String name;
    CricketPlayer(String name)
    {
        this.name=name;
    }
    void cricket()
    {
        System.out.println(name+" hits a six!");
    }
}
