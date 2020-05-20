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
public class DVDPlayer {
    boolean isON,isPlay;
    public void DVDOn()
    {
        System.out.println("DVD player in ON Enjoy..:)");
        isON = true;
    }
    
    public void DVDoff()
    {
        System.out.println("DVD player Stopped...:(");
        isON = false;
    }
    
    public void DVDplay()
    {
        System.out.println("DVD Started to play..");
        isPlay = true;
    }
    
    public void DVDpause()
    {
        System.out.println("DVD Player Paused");
        isPlay = false;
    }
    
    
    
}
