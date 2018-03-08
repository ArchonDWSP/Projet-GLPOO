package fr.esiea.algo;

import java.awt.*;
import javax.swing.*;

public class DrawRectangle {

	public static void main(String[] arguments) {

		MyPanel panel = new MyPanel();

		// create a basic JFrame
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Pacman GLPOO");
		frame.setSize(1920, 1080);
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
		
		g.setColor(Color.yellow); // Pacman
		g.fillArc(60, 50, 150, 150, 45, 265);
		
		g.setColor(Color.white); 
		g.fillOval(200, 120, 20, 20); // Balls couloir horizontal haut
		g.fillOval(400, 120, 20, 20);
		g.fillOval(600, 120, 20, 20);
		g.fillOval(800, 120, 20, 20);
		g.fillOval(1000, 120, 20, 20);
		g.fillOval(1200, 120, 20, 20);
		g.fillOval(1400, 120, 20, 20);
		g.fillOval(1600, 120, 20, 20);
		g.fillOval(1740, 105, 50, 50);
		
		g.fillOval(200, 890, 20, 20); // balls couloir horizontal bas
		g.fillOval(400, 890, 20, 20);
		g.fillOval(600, 890, 20, 20);
		g.fillOval(800, 890, 20, 20);
		g.fillOval(1000, 890, 20, 20);
		g.fillOval(1200, 890, 20, 20);
		g.fillOval(1400, 890, 20, 20);
		g.fillOval(1600, 890, 20, 20);
		
		g.fillOval(130, 350, 20, 20); // balls couloir vertical gauche
		g.fillOval(130, 550, 20, 20);
		g.fillOval(130, 750, 20, 20);
		
		g.fillOval(1760, 350, 20, 20); // balls couloir vertical droit
		g.fillOval(1760, 550, 20, 20);
		g.fillOval(1760, 750, 20, 20);
		
		g.setColor(Color.blue); // Walls
		g.fillRect(0, 0, 2000, 30); // mur horizontal du haut
		g.fillRect(0, 250, 30, 800); // premier mur vertical
		g.fillRect(250, 250, 30, 530); // second mur vertical
		g.fillRect(250, 250, 1400, 30); // mur horizontal milieu haut
		g.fillRect(1630, 250, 30, 530); // troisieme mur vertical
		g.fillRect(1880, 0, 30, 780); // quatrième mur vertical
		g.fillRect(250, 750, 1400, 30); // mur horizontal milieu bas
		
		g.fillRect(0, 1020, 2000, 30); // mur horizontal du bas
		
		
		g.setColor(Color.red); // Phantom rouge
		g.fillArc(1700, 500, 150, 150, 0, 180);
		g.fillRect(1700, 575, 150, 40);
		g.fillOval(1700, 595, 44, 40);
		g.fillOval(1735, 595, 44, 40);
		g.fillOval(1770, 595, 44, 40);
		g.fillOval(1805, 595, 44, 40);
		
		g.setColor(Color.white); // Eyes
		g.fillOval(1720, 540, 45, 45);
		g.fillOval(1785, 540, 45, 45);
		
		g.setColor(Color.gray); // Pupils
		g.fillOval(1720, 550, 25, 25);
		g.fillOval(1785, 550, 25, 25);
		
		
		g.setColor(Color.pink); // Phantom rose
		g.fillArc(1400, 830, 150, 150, 0, 180);
		g.fillRect(1400, 905, 150, 40);
		g.fillOval(1400, 925, 44, 40);
		g.fillOval(1435, 925, 44, 40);
		g.fillOval(1470, 925, 44, 40);
		g.fillOval(1505, 925, 44, 40);
		
		g.setColor(Color.white); // Eyes
		g.fillOval(1420, 870, 45, 45);
		g.fillOval(1485, 870, 45, 45);
		
		g.setColor(Color.gray); // Pupils
		g.fillOval(1420, 880, 25, 25);
		g.fillOval(1485, 880, 25, 25);
		
		
		g.setColor(Color.cyan); // Phantom cyan
		g.fillArc(1840, 830, 150, 150, 0, 180);
		g.fillRect(1840, 905, 150, 40);
		g.fillOval(1840, 925, 44, 40);
		g.fillOval(1875, 925, 44, 40);
		g.fillOval(1910, 925, 44, 40);
		g.fillOval(1945, 925, 44, 40);
		
		g.setColor(Color.white); // Eyes
		g.fillOval(1860, 870, 45, 45);
		g.fillOval(1925, 870, 45, 45);
		
		g.setColor(Color.gray); // Pupils
		g.fillOval(1860, 880, 25, 25);
		g.fillOval(1925, 880, 25, 25);
		
f
	}
}
