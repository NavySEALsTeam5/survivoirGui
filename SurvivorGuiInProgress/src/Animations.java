import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Animations {
	public static void elevatorCut() { // elevator cut seen
		//Clip soundPlay;

		
		//elevator();
		
		try {
			File sound = new File("elevatorDing.wav");                               
			AudioInputStream sound_1 = AudioSystem.getAudioInputStream(sound);
			Clip soundPlay = AudioSystem.getClip();  
			soundPlay.open(sound_1); 
			soundPlay.start(); 
		
			SpecialFunctions.sleep(5001);
		
			soundPlay.stop();
		                                         
			                                                                  
			
		}
		catch(Exception e) {
			
		}
		
		
		System.out.println("You have entered the elevator...");
		SpecialFunctions.sleep(4000);
		//GameContent.changeFloors();
		
	}
}