import java.awt.Color;
import java.awt.Graphics;

public class Chest {
	public static void draw(Graphics g, int xOfObject, int yOfObject) { 
		
		g.setColor(Color.black);
		g.fillRect(xOfObject +1, yOfObject + 1, 8 , 8);
		
		g.setColor(new Color(193, 154, 107));
		g.fillRect(xOfObject + 2 , yOfObject + 2, 7 , 7);
		
		
		g.setColor(Color.black);
		g.fillRect(xOfObject +1, yOfObject + 3, 8 , 2);
	}
}
