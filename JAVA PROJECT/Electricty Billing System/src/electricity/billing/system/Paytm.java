package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{

    String meter;
    JButton back;
    Paytm(String meter) {
        this.meter = meter;
        
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
        try {
//            j.setPage("https://paytm.com/online-payments");
            j.setContentType("text/html");
            j.setText("<h1>Payment Successfull..!!</h1>");  
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load<html>");  
        }
        
        JScrollPane pane = new JScrollPane(j);
        add(pane);
        
        back = new JButton("Back");
        back.setBounds(640, 20, 80, 30);
        back.addActionListener(this);
        j.add(back);
        
        setSize(600, 200);
        setLocation(400, 150);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PayBill(meter);
    }
    
    public static void main(String[] args) {
        new Paytm("");
    }
}
