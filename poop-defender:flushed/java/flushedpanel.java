import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.lang.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

//must 'extend' JPanel 
//You can rename the class to anything you wish - default is 'PanelTemplate'
public class flushedpanel extends JPanel {
	// variables for the overall width and height
	private int screenwidth, screenheight;
	private int crawlerscale, crawlerspeed;
	private Random rng;
	public Rectangle devbox1;
	public Rectangle devbox2;
	public Rectangle devbox3;
	int xchange1;
	public int xchange2;
	public int scalechange1;
	public int scalechange2;

	// sets up the initial panel for drawing with proper size
	public flushedpanel(int screenwidth, int screenheight) {
		this.screenwidth = screenwidth;
		this.screenheight = screenheight;
		this.setPreferredSize(new Dimension(screenwidth, screenheight));

		devbox1 = new Rectangle(screenwidth - 400, 0, 400, 700);
		devbox2 = new Rectangle(0, screenheight / -4, screenwidth + screenwidth, 600);
		devbox3 = new Rectangle(0, 0, 400, 700);

	}

	// all graphical components go here
	// this.setBackground(Color c) for example will change background color
	public void paintComponent(Graphics g) {
		// this line sets up the graphics - always needed
		super.paintComponent(g);
		// all drawings below here:

		// g.drawRect(400, 400, screenwidth, screenheight);
		this.setBackground(Color.green);
		// g.setColor(Color.green);

		int count = 0;
		int xchange1_1 = 0;
		while (count <= 100) {
			xchange1_1 = +10;
			System.out.println("broken");
			repaint();
		}

		g.setColor(Color.red);
		g.fillRect(screenwidth - 400, 0, 400, 700);

		g.setColor(Color.orange);
		g.fillRect(0 + xchange1_1, 0, 400, 700);

		g.setColor(Color.black);
		g.fillRect(0, screenheight / -4, screenwidth + screenwidth, 600);
		repaint();

	}

	/*
	 * KeyListener listener = new KeyListener(){
	 * public void keyPressed(KeyEvent event){
	 * printEventInfo("Key Pressed", event);
	 * }
	 * }
	 */

}
