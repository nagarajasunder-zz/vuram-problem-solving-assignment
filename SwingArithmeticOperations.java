/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingarithmeticoperations;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author the_developer
 */
class Start implements ActionListener
{
    double a,b,c;
    JFrame frame;
    JTextField number1,number2;
    JButton add,subtract,multiply,divide,modulo;
    JLabel title,result;
    public Start() {
        setupFrame();
        setUI();
        add_UI();
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulo.addActionListener(this);
    }

   

    private void setupFrame() {
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setTitle("Simple Calci");
        frame.setLayout(new FlowLayout(1,30,30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setUI() {
        number1 = new JTextField(10);
        number2 = new JTextField(10);
        add = new JButton("ADD");
        subtract = new JButton("SUBTRACT");
        multiply = new JButton("MULTIPLY");
        divide = new JButton("DIVIDE");
        modulo = new JButton("MODULOUS");
        title = new JLabel("CALCULATOR");
        title.setForeground(Color.BLUE);
        result = new JLabel();
    }

    private void add_UI() {
       frame.add(title);
       frame.add(number1);
       frame.add(number2);
       frame.add(add);
       frame.add(subtract);
       frame.add(multiply);
       frame.add(divide);
       frame.add(modulo);
       frame.add(result);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource() == add)
      {
          a = Double.parseDouble(number1.getText());
          b = Double.parseDouble(number2.getText());
          c = a+b;
          result.setText("The Answer is "+String.valueOf(c));
      }
      else if(ae.getSource() == subtract)
      {
           a = Double.parseDouble(number1.getText());
          b = Double.parseDouble(number2.getText());
          c = a-b;
          result.setText("The Answer is "+String.valueOf(c));
      }
      else if(ae.getSource() == multiply)
      {
           a = Double.parseDouble(number1.getText());
          b = Double.parseDouble(number2.getText());
          c = a*b;
          result.setText("The Answer is "+String.valueOf(c));
      }
      else if(ae.getSource() == divide)
      {
           a = Double.parseDouble(number1.getText());
          b = Double.parseDouble(number2.getText());
          c = a/b;
          result.setText("The Answer is "+String.valueOf(c));
      }
      else
      {
          a = Double.parseDouble(number1.getText());
          b = Double.parseDouble(number2.getText());
          c = a%b;
          result.setText("The Answer is "+String.valueOf(c));
      }
    }

   
}
public class SwingArithmeticOperations {

  
    public static void main(String[] args) {
        // TODO code application logic here
       Start start = new Start();
    }
    
}
