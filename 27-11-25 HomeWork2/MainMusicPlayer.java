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
public class MainMusicPlayer 
{
    public static void main(String[] args) 
    {
        Playable mp3=new MP3Player();
        Playable ra=new Radio();
        
        mp3.play();
    }
}
