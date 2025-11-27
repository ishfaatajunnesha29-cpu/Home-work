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
public class FootballPlayer extends Player
{
    String name;
    FootballPlayer(String name)
    {
        this.name=name;
    }
    void footBall()
    {
        System.out.println(name+" Scores a goal!");
    }
}
