import javax.swing.JFrame;
import java.awt.*;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class flushedmain // Main class
{

	// Lobby Music logic
	Long currentFrame;
	Clip clip;

	String status;

	AudioInputStream audioInputStream;
	static String filePath;

	// intializes streams and audio clips
	public void AudioPlayer()
			throws UnsupportedAudioFileException,
			IOException, LineUnavailableException {
		// create AudioInputStream object
		audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

		// create clip reference
		clip = AudioSystem.getClip();

		// open audioInputStream to the clip
		clip.open(audioInputStream);

		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public static void main(String[] args) {

		// Logic for getting users screen size.
		Dimension Size = Toolkit.getDefaultToolkit().getScreenSize();

		// To be added, fullscreen feature + config

		int screenwidth = (int) Size.getWidth();
		int screenheight = (int) Size.getHeight();

		// sets up a JFrame object with title "Template"
		JFrame frame = new JFrame("Poop Defender: Flushed");
		// make sure the jframe closes when you hit the 'x'
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// adds the drawing panel to the frame
		frame.getContentPane().add(new flushedpanel(screenwidth, screenheight));
		// resizes the frame to fit the panel
		frame.pack();
		// makes it visible
		frame.setVisible(true);

		// Lobby Music logic
		Long currentFrame;
		Clip clip;

		String status;
		try{
			filePath = "Please input your filepath for the \"assets\" folder. You will only need to do this one time.";
			AudioPlayer audioPlayer = new AudioPlayer();
		}
		// intializes streams and audio clips

	}

}
