/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntertainmentSystem;

/**
 *
 * @author the_developer
 */
public class MusicPlayer {
    
    boolean isON,isPlay;
    public void MsuicOn()
    {
        System.out.println("Music player in ON Enjoy..:)");
        isON = true;
    }
    
    public void Musicoff()
    {
        System.out.println("Music player Stopped...:(");
        isON = false;
    }
    
    public void Musicplay()
    {
        System.out.println("Music player Started to play..");
        isPlay = true;
    }
    
    public void Musicpause()
    {
        System.out.println("Music Player Paused");
        isPlay = false;
    }
    
}
