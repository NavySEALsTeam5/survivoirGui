import java.awt.Color;
import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ElevatorCut {
	
	public static void draw(Graphics g) {
		try {
			File sound = new File("elevatorDing.wav");                               
			AudioInputStream sound_1 = AudioSystem.getAudioInputStream(sound);
			Clip soundPlay = AudioSystem.getClip();  
			soundPlay.open(sound_1); 
			soundPlay.start(); 
		
			SpecialFunctions.sleep(300);
			
			soundPlay.stop();
		                                         
			                                                                  
			
		}
		catch(Exception e) {
			
		}
		
		elevatorCut(g, 0);
		
		SpecialFunctions.sleep(500);
		
		for(int i = 1; i < 12; i++) {
			elevatorCut(g, i);
			SpecialFunctions.sleep(500);
		}
	}
	
	public static void elevatorCut(Graphics g, int opening) {;
		
		//Clip soundPlay;

		
		//elevator();
		
		g.setColor(new Color(192,192,192)); 
		g.fillRect(5, 5, 200, 600);
	
		
		
		System.out.println("You have entered the elevator...");
		SpecialFunctions.sleep(4000);
		
		
			
	}

}
