import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SpecialFunctions {
	public static void sleep(int sleepNumber) { // controls the amount of time between printing the story line lines


		try{
			Thread.sleep(sleepNumber); //tells the thread how long to sleep for
		}
		catch(InterruptedException e){
		}

	}
	
	

	
}
