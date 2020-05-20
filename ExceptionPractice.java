/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionpractice;

import java.util.Scanner;

/**
 *
 * @author the_developer
 */
public class ExceptionPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InitialdepositException{
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an initial deposit amount");
        int deposit = s.nextInt();
        try {
            if(deposit<3000)
            {
                throw new InitialdepositException("Initial deposit should be greater than 3000/-");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class InitialdepositException extends Exception
{

    public InitialdepositException(String Message) {
         super(Message);
    }
    
}
