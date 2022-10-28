import javax.swing.JFrame;
import java.awt.*;


public class flushedmain //Main class
{

	public static void main(String[] args)
	{
		
        //Logic for getting users screen size.
        Dimension Size = Toolkit.getDefaultToolkit().getScreenSize();

        //To be added, fullscreen feature + config

        int screenwidth = (int)Size.getWidth();
        int screenheight = (int)Size.getHeight();

		//sets up a JFrame object with title "Template"
		JFrame frame = new JFrame("Poop Defender: Flushed");
		//make sure the jframe closes when you hit the 'x'
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//adds the drawing panel to the frame
		frame.getContentPane().add(new flushedpanel(screenwidth,screenheight));
		//resizes the frame to fit the panel
		frame.pack();
		//makes it visible
		frame.setVisible(true);

	}

}
