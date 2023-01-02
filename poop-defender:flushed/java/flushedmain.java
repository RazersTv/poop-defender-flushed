import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.io.*;
import javax.sound.sampled.*;
import java.util.*;
import java.awt.event.*;
/* 
import org.json.simple.*;
import org.json.simple.parser.*;
 */

public class flushedmain
{	
	public static void main(String[] args) {

		// Logic for getting users screen size.
		Dimension Size = Toolkit.getDefaultToolkit().getScreenSize();

		KeyListener Movement = new KeyListener();


		// To be added, fullscreen feature + config

		int screenwidth = (int) Size.getWidth();
		int screenheight = (int) Size.getHeight();

		// sets up a JFrame object with title "Template"
		JFrame frame = new JFrame("Poop Defender: Flushed");
		//JButton testclose = new JButton("Close - Dev Environment");
		//testclose.setBounds(400, 400, 200, 200);


		ImageIcon icon = new ImageIcon("C:\\Connolly AP Comp Sci\\Poop-Defender\\Development Repo\\poop-defender-flushed-main\\poop-defender-flushed-main\\poop-defender_flushed\\assets\\lobby-background.png");
/* 
		JButton.addActionListener(new ActionListener(){
			public void actionPerformed('ActionEvent'){
				System.exit(0);
			}
		})
*/
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.setVisible(true);
		// make sure the jframe closes when you hit the 'x'
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// adds the drawing panel to the frame
		frame.getContentPane().add(new flushedpanel(screenwidth, screenheight));
		// resizes the frame to fit the panel
		frame.pack();
		// makes it visible
		//frame.setVisible(true);

		//frame.add(testclose);
		frame.setVisible(true);		
		//frame.setFocusable(true);
		// Lobby Music logic
		Long currentFrame;
		Clip clip;

		


		/*testclose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}	
		});
		*/
		/* 
		String status;
		try{
			filePath = "Please input your filepath for the \"assets\" folder. You will only need to do this one time.";
			AudioPlayer audioPlayer = new AudioPlayer();
		}
		// intializes streams and audio clips
		*/
	}

}
