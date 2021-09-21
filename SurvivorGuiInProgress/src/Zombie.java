import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Zombie {
	
	public static void draw(Graphics g, int xOfObject, int yOfObject) { 
		Random rando = new Random();
		
		switch(rando.nextInt(4)) {
			case 0: //right
				g.setColor(new Color(	34, 139, 34));
				g.fillRect(xOfObject + 5, yOfObject, 4 ,  2);
				g.fillRect(xOfObject + 5 , yOfObject + 8, 4 ,  2);
			
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject, yOfObject, 4,  10);
				
				g.setColor(Color.green);
				g.fillRect(xOfObject , yOfObject + 3, 4,  4);
				break;
			
			case 1://down
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject , yOfObject + 5, 2 ,  4);
				g.fillRect(xOfObject  + 8, yOfObject + 5, 2 ,  4);
			
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject, yOfObject, 10,  4);
				
				g.setColor(Color.green);
				g.fillRect(xOfObject + 3, yOfObject, 4,  4);
				break;
				
			case 2://left
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject , yOfObject , 4 ,  2);
				g.fillRect(xOfObject, yOfObject + 8, 4 ,  2);
			
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject + 6, yOfObject, 4,  10);
				
				g.setColor(Color.green);
				g.fillRect(xOfObject + 6, yOfObject + 3, 4,  4);
				break;
				
			case 3:

				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject , yOfObject, 2 ,  4);
				g.fillRect(xOfObject  + 8, yOfObject, 2 ,  4);
			
				g.setColor(new Color(34, 139, 34));
				g.fillRect(xOfObject, yOfObject + 6, 10,  4);
				
				g.setColor(Color.green);
				g.fillRect(xOfObject + 3, yOfObject + 6, 4,  4);
				break;
		}
	}
}
