/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletarithmetic;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appletarithmetic extends Applet implements ActionListener {


    TextField number1,number2;
    Label n1,n2,ans;
    Button add,subtract,multiply,divide,modulous;
    @Override
    public void init()
    {
        number1 = new TextField(25);
        number2 = new TextField(25);
        number1.setBounds(10,100,25,25);
        number2.setBounds(10,120,25,25);
        n1 = new Label("Enter a number1");
        n2 = new Label("Enter a number2");
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        modulous = new Button("%");
        ans = new Label("the answer is ");
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulous.addActionListener(this);
        add(n1);
        add(number1);
        add(n2);
        add(number2);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(modulous);
        add(ans);
    }
    @Override
    public void paint(Graphics g)
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String a,b;
        Double c;
        String st = ae.getActionCommand();
        if(st.equals("+"))
       {
           a = number1.getText().toString();
           b = number2.getText().toString();
           c = Double.parseDouble(a) + Double.parseDouble(b);
           System.out.println(c);
           ans.setText("The sum is "+String.valueOf(c));
       }
        else if(st.equals("-"))
        {
            a = number1.getText().toString();
           b = number2.getText().toString();
           c = Double.parseDouble(a) - Double.parseDouble(b);
           System.out.println(c);
           ans.setText("The difference is "+String.valueOf(c));
        }
        else if(st.equals("*"))
        {
             a = number1.getText().toString();
           b = number2.getText().toString();
           c = Double.parseDouble(a) * Double.parseDouble(b);
           System.out.println(c);
           ans.setText("The product is "+String.valueOf(c));
        }
        else if(st.equals("/"))
        {
             a = number1.getText().toString();
           b = number2.getText().toString();
           c = Double.parseDouble(a) / Double.parseDouble(b);
           System.out.println(c);
           ans.setText("The division is "+String.valueOf(c));
        }
        else
        {
           a = number1.getText().toString();
           b = number2.getText().toString();
           c = Double.parseDouble(a) % Double.parseDouble(b);
           System.out.println(c);
           ans.setText("The modulo is "+String.valueOf(c));
        }
    }
    
    //<applet code="Appletarithmetic.class" width="500" height="500"></applet>
}
