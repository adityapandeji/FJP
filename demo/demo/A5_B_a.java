import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class details extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l_name, l_class, l_hobbies, l_font, l_size, l_style;
	JTextField t1;
	JButton b1;
	JRadioButton fy, sy, ty;
	JCheckBox music, sports, travel, bold, italic, underline;
	String name, clas, hobbies;
	ButtonGroup bg;
	JComboBox font_box, size_box;

	details() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		bg = new ButtonGroup();
		String fonts[] = { "Serif", "SansSerif", "Dialog", "DialogInput", "Monospace" };
		String size[] = { "10", "12", "14", "16", "18", "20", "22", "24", "26" };
		l1 = new JLabel("Your name: ");
		l1.setBounds(30, 15, 200, 30);
		add(l1);
		t1 = new JTextField("");
		t1.setBounds(110, 15, 200, 30);
		add(t1);
		l2 = new JLabel("Your Class");
		l2.setBounds(30, 50, 70, 30);
		add(l2);
		fy = new JRadioButton("FY");
		fy.setBounds(30, 70, 70, 30);
		bg.add(fy);
		add(fy);
		sy = new JRadioButton("SY");
		sy.setBounds(30, 100, 70, 30);
		bg.add(sy);
		add(sy);
		ty = new JRadioButton("TY");
		ty.setBounds(30, 130, 70, 30);
		bg.add(ty);
		add(ty);
		l3 = new JLabel("Your Hobbies");
		l3.setBounds(140, 50, 150, 30);
		add(l3);
		music = new JCheckBox("Music");
		music.setBounds(140, 70, 70, 30);
		add(music);
		sports = new JCheckBox("Sports");
		sports.setBounds(140, 100, 70, 30);
		add(sports);
		travel = new JCheckBox("Travel");
		travel.setBounds(140, 130, 70, 30);
		add(travel);
		b1 = new JButton("Submit");
		b1.setBounds(30, 200, 100, 30);
		add(b1);
		l_name = new JLabel("");
		l_name.setBounds(30, 250, 550, 20);
		add(l_name);
		l_class = new JLabel("");
		l_class.setBounds(30, 280, 550, 20);
		add(l_class);
		l_hobbies = new JLabel("");
		l_hobbies.setBounds(30, 310, 550, 20);
		add(l_hobbies);
		l_font = new JLabel("Fonts");
		l_font.setBounds(260, 50, 150, 30);
		add(l_font);
		font_box = new JComboBox(fonts);
		font_box.setBounds(260, 80, 100, 30);
		add(font_box);
		l_size = new JLabel("Size");
		l_size.setBounds(260, 120, 100, 30);
		add(l_size);
		size_box = new JComboBox(size);
		size_box.setBounds(260, 150, 100, 30);
		add(size_box);
		l_style = new JLabel("Style");
		l_style.setBounds(420, 50, 100, 30);
		add(l_style);
		bold = new JCheckBox("Bold");
		bold.setBounds(420, 80, 70, 30);
		add(bold);
		italic = new JCheckBox("Italic");
		italic.setBounds(420, 110, 70, 30);
		add(italic);
		underline = new JCheckBox("Underline");
		underline.setBounds(420, 140, 100, 30);
		add(underline);
		t1.addActionListener(this);
		b1.addActionListener(this);
		music.addActionListener(this);
		sports.addActionListener(this);
		travel.addActionListener(this);
		fy.addActionListener(this);
		sy.addActionListener(this);
		ty.addActionListener(this);
		music.addActionListener(this);
		italic.addActionListener(this);
		underline.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int s = 0;
			String font_data = "" + font_box.getItemAt(font_box.getSelectedIndex());
			String size_data = "" + size_box.getItemAt(size_box.getSelectedIndex());
			name = t1.getText();
			clas = "Class: ";
			if (fy.isSelected())
				clas = clas + "FY";
			if (sy.isSelected())
				clas = clas + "SY";
			if (ty.isSelected())
				clas = clas + "TY";
			hobbies = "Hobbies: ";
			if (music.isSelected())
				hobbies = hobbies + "Music, ";
			if (sports.isSelected())
				hobbies = hobbies + "Sports, ";
			if (travel.isSelected())
				hobbies = hobbies + "Travelling";
			if (bold.isSelected())
				s = 1;
			if (italic.isSelected())
				s = 2;
			if (bold.isSelected() && italic.isSelected())
				s = 3;
			if (underline.isSelected()) {
				l_name.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
				l_class.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
				l_hobbies.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
			} else if (!underline.isSelected()) {
				l_name.setBorder(new MatteBorder(0, 0, 0, 0, Color.black));
				l_class.setBorder(new MatteBorder(0, 0, 0, 0, Color.black));
				l_hobbies.setBorder(new MatteBorder(0, 0, 0, 0, Color.black));
			}
			l_name.setFont(new Font(font_data, s, Integer.parseInt(size_data)));
			l_class.setFont(new Font(font_data, s, Integer.parseInt(size_data)));
			l_hobbies.setFont(new Font(font_data, s, Integer.parseInt(size_data)));
			l_name.setText("Name: " + name);
			l_class.setText(clas);
			l_hobbies.setText(hobbies);
		}
	}
}

public class A5_B_a {

	public static void main(String[] args) {
		details d = new details();
		d.setTitle("Details");
		d.setBounds(300, 180, 600, 400);
		d.setVisible(true);
	}
}
