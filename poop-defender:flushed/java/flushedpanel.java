import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//must 'extend' JPanel 
//You can rename the class to anything you wish - default is 'PanelTemplate'
public class flushedpanel extends JPanel
{
	//variables for the overall width and height
	private int screenwidth, screenheight;
	
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
		
		
		
	}
}
