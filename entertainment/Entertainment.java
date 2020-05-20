/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entertainment;
import EntertainmentSystem.*;
import java.util.Scanner;
/**
 *
 * @author the_developer
 */
public class Entertainment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int options;
        MusicPlayer musicPlayer = new MusicPlayer();
        DVDPlayer dPlayer = new DVDPlayer();
        Scanner s = new Scanner(System.in);
        System.out.println("Entertainment");
        System.out.println("1 to play DVD player \n2 to play Music System");
        options = s.nextInt();
        if(options == 1)
        {
            dPlayer.DVDOn();
            dPlayer.DVDplay();
        }
        else if(options == 2)
        {
            musicPlayer.MsuicOn();
            musicPlayer.Musicplay();
        }
        
    }
    
}
