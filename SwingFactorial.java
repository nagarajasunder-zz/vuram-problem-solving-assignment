/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingfactorial;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author the_developer
 */
class Factorial implements ActionListener
{
    JFrame frame;
    JTextField number;
    JButton result;
    JLabel ans; 
    public Factorial() {
        
        setFrame();
        number = new JTextField(10);
        result = new JButton("Find Factorial");
        ans = new JLabel();
        result.addActionListener(this);
        frame.add(number);
        frame.add(result);
        frame.add(ans);
        
    }
    
    public void setFrame()
    {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout(1, 30, 30));
        frame.setTitle("Factorial..!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int fact = 1,num;
        num = Integer.parseInt(number.getText());
        for(int i=1;i<=num;i++)
        {
            fact *= i;
        }
        ans.setText("The Factorial is "+String.valueOf(fact));
        
    }
}
public class SwingFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Factorial factorial = new Factorial();
    }
    
}
