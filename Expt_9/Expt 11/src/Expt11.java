import java.awt.*;
import javax.swing.*;

public class Expt11 extends JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame("Experiment 11");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(new Expt11());
		f.setSize(360,500);
		f.setLocation(100,100);
		f.setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawString("FJP Experiment No. 11",30,50);
    	g.drawString("Name: ",30,77);
    	g.drawString("Roll no.: ",30,105);
		g.setColor(Color.RED);
		g.drawLine(60, 150, 280, 150);
		g.setColor(Color.GREEN);
		g.drawRect(60, 180, 180, 100);
		g.setColor(Color.BLUE);
		g.drawOval(60, 300, 180, 60);
		
		// Graphics2D g2 = (Graphics2D) g;
		// g2.setColor(Color.GREEN);
		// g2.drawRect(60, 180, 180, 100);
		// Graphics2D g3 = (Graphics2D) g;
		// g2.setColor(Color.BLUE);
		// g3.drawOval(60, 300, 180, 60);
	}
}