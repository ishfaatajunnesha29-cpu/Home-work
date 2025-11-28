/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaPlayers;

/**
 *
 * @author ISHFAA TAJ
 */
public class MainMediaPlayer 
{
    public static void main(String[] args)
    {
        Mediaplayer ap=new AudioPlayer();
        Mediaplayer vp=new VideoPlayer();
        
        ap.play("Audio");
        vp.play("Video");
    }
}
