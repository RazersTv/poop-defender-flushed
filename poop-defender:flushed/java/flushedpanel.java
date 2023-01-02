import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.lang.*;
import java.util.*;

//must 'extend' JPanel 
//You can rename the class to anything you wish - default is 'PanelTemplate'
public class flushedpanel extends JPanel
{
	//variables for the overall width and height
	private int screenwidth, screenheight;
	private int crawlerscale, crawlerspeed;
	private Random rng;
	
	//sets up the initial panel for drawing with proper size
	public flushedpanel(int screenwidth, int screenheight)
	{
		this.screenwidth = screenwidth;
		this.screenheight = screenheight;
		this.setPreferredSize(new Dimension(screenwidth,screenheight));
		
	}

		
	//all graphical components go here
	//this.setBackground(Color c) for example will change background color
	public void paintComponent(Graphics g)
	{
		//this line sets up the graphics - always needed
		super.paintComponent(g);
		//all drawings below here:

		//g.drawRect(400, 400, screenwidth, screenheight);
		g.setColor(Color.green);
		
		g.fillRect(0, 0, screenwidth, screenheight);
		g.setColor(Color.green);

		g.setColor(Color.red);

		g.fillRect(screenwidth/3, screenheight/4, 400, 400);
		
	}
}
