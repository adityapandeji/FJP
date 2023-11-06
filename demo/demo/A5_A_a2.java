import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
JTextField t1;
JPanel p1;
char op;
float no1,no2,ans; 
Calculator()
{
setLayout(new BorderLayout());
p1=new JPanel();
t1=new JTextField();
add(t1,BorderLayout.NORTH);
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b10=new JButton("0");
b11=new JButton("+");
b12=new JButton("-");
b13=new JButton("*");
b14=new JButton("/");
b15=new JButton(".");
b16=new JButton("=");
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b11);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b12);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b13);
p1.add(b10);
p1.add(b15);
p1.add(b16);
p1.add(b14);
p1.setLayout(new GridLayout(4,4));
add(p1,BorderLayout.CENTER); 
setSize(450,450);
setTitle("Calculator");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
JButton b=(JButton)ae.getSource();
if(b==b1||b==b2||b==b3||b==b4||b==b5||b==b6||b==b7||b==b8||b==
b9||b==b10||b==b15) 
{
t1.setText(t1.getText() + ""+ b.getLabel());
}
if(b==b11||b==b12|| b==b13||b==b14)
{
op=(b.getLabel()).charAt(0);
no1=Float.valueOf(t1.getText());
t1.setText(" ");
t1.requestFocus();
} 
if(b==b16)
{
no2=Float.valueOf(t1.getText());
switch(op)
{
case '+':
ans=no1+no2;
break;
case '-':
ans=no1-no2;
break;
case '*':
ans=no1*no2;
break;
case '/':
ans=no1/no2;
break;
}
t1.setText(Float.toString(ans));
} 
}
}
public class A5_A_a2 {

	public static void main(String args[])
	{
	Calculator C=new Calculator();
	}

}
