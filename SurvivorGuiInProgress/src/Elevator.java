import java.awt.Color;
import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Elevator {
	
	public static void elevator(int num1, int num5) {
		int num2 = 0;
	
		if(num1 < num5) {
			num2 = ((num5 * 1000) - (num1 * 1000) * 1/2);
		}
		else if(num1 > num5) {
			num2 = ((num1 * 1000) - (num5 * 1000) * 1/2);
		}
			num1 = num1 + num2 + 4000;
			
			
		
		try {
			File sound = new File("ElevatorMusic.wav");                               
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(sound);
			Clip soundPlay = AudioSystem.getClip();  
			soundPlay.open(inputStream);                                          
			                                                                  
			soundPlay.start(); 
			
			SpecialFunctions.sleep(num1);
			
			soundPlay.stop();
			
			File sound1 = new File("ElevatorDing.wav");                               
			AudioInputStream inputStream1 = AudioSystem.getAudioInputStream(sound1);
			Clip soundPlay1 = AudioSystem.getClip();  
			soundPlay1.open(inputStream1);                                          
			                                                                  
			soundPlay1.start(); 
			
			SpecialFunctions.sleep(5000);
			
			soundPlay1.stop();
		}
		catch(Exception e) {
		}
	}
	
	public static void drawElevator(Graphics g) {
		
		g.setColor(Color.gray); 
		g.fillRect(329,30, 440, 520);
		
		g.setColor(Color.black); 	
		g.fillRect(675, 225, 80, 110);
		
		g.setColor(Color.gray); 
		g.fillRect(678, 228, 74, 104);
		
		g.setColor(Color.black); 
		g.fillRect(678, 228, 74, 104);
		
		
		g.setColor(Color.white); 
		
		for(int i = 0; i < 4; i++) {
			g.fillOval(685, 238 + (25 * i), 10, 10);
			g.fillOval(710, 238 + (25 * i), 10, 10);
			g.fillOval(735, 238 + (25 * i), 10, 10);
		}

		
		
		g.setColor(new Color(192,192,192)); 
		
		
	
		g.fillRect(349 ,50, 150, 500);
		g.fillRect(501, 50, 150, 500);
		
		g.setColor(Color.black); 	
		g.fillRect(499, 50, 2, 500);
		
		
		
		
	
	}
}