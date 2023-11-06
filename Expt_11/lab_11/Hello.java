import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class Hello extends Applet {
	Font f1;

	@SuppressWarnings("deprecation")
	public void init() {
		resize(400, 400);
		setBackground(Color.white);
		f1 = new Font("Aerial", Font.ITALIC, 20);
	}

	public void start() {
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.setFont(f1);
		g.drawString("Hello", 20, 20);
		g.drawLine(30, 30, 100, 100);
		g.fillRect(30, 150, 30, 50);
		g.fillOval(30, 250, 30, 30);
	}

	public void stop() {
	}

	public void destroy() {
	}
}

/*
 * <html> <head> <title>Applet</title> </head> <body> <applet code="Hello.class"
 * width=300 height=300> </applet> </body> </html>
 */
