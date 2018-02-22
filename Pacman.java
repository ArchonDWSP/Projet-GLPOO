package fr.esiea.algo;

import java.awt.*;
import javax.swing.*;

public class DrawRectangle {

	public static void main(String[] arguments) {

		MyPanel panel = new MyPanel();

		// create a basic JFrame
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Test de kalitay");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add panel to main frame
		frame.add(panel);
		frame.setBackground(Color.black);
		frame.setVisible(true);

	}
}

// create a panel that you can draw on.
class MyPanel extends JPanel {
	public void paint(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillArc(0, 0, 150, 150, 45, 265);
		g.setColor(Color.white);
		g.fillOval(200, 70, 20, 20);
		g.fillOval(400, 70, 20, 20);
		g.fillOval(600, 70, 20, 20);
		g.fillOval(800, 55, 50, 50);
		g.setColor(Color.blue);
		g.fillRect(0, 200, 700, 30);
		g.fillRect(700, 200, 30, 700);
		g.fillRect(950, 0, 30, 900);

	}
}
