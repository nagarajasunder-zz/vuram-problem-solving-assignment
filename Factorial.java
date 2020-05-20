/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletexample;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Factorial  extends Applet implements ActionListener{
    
    TextField number;
    Button calculate;
    Label label,ans;
    int fact=1;
    boolean clicked = false;
    @Override
    public void init()
    {
        ans = new Label();
        label = new Label("Enter a number");
        number = new TextField(25);
        calculate = new Button("Calculate");
        add(label);
        add(number);
        add(calculate);
        add(ans);
        calculate.addActionListener(this);
    }
    @Override
    public void paint(Graphics g)
    {
        if(clicked)
        {
            g.drawString("The factorial is "+String.valueOf(fact), 300, 200);
            clicked = !clicked;
        }
    }
    
  
    //<applet code="Factorial.class" height="400" width="600"></applet>

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        clicked = true;
        String value = number.getText().toString();
        fact = 1;
        for(int i=1;i<=Integer.parseInt(value);i++)
        {
            fact*=i;
        }
        repaint();
    }
}
