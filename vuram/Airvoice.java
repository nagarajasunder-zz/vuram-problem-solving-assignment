/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuram;
import myPack.*;
/**
 *
 * @author the_developer
 */
public class Airvoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //object creation for PRepaid plan class
        Prepaidplan prepaidplan = new Prepaidplan();
        prepaidplan.voicecall();
        prepaidplan.videocall();
        prepaidplan.mobiledata();
        
        System.out.println("");
        //object cretion for Postpaidplan class 
        Postpaidplan postpaidplan = new Postpaidplan();
        postpaidplan.voicecall();
        postpaidplan.videocall();;
        postpaidplan.mobiledata();
    }
    
}
