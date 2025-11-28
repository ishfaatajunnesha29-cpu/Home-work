/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicPlayer;

/**
 *
 * @author ISHFAA TAJ
 */
public class Radio implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Radio...");
    }
    @Override
    public void pause()
    {
        System.out.println("Pause Radio...");
    }
}
