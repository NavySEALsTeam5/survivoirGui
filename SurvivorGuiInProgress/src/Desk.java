import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Desk {

	
	public static void draw1(Graphics g, int xOfObject, int yOfObject) {
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject , yOfObject , 8, 1);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject, yOfObject, 5, 20);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject, yOfObject + 19, 8, 1);
	}
	
	public static void draw2(Graphics g, int xOfObject, int yOfObject) {
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject , yOfObject , 8, 1);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject + 5, yOfObject, 5, 20);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject, yOfObject + 19, 8, 1);
	}
	
	public static void draw3(Graphics g, int xOfObject, int yOfObject) {
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject , yOfObject , 1, 8);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject, yOfObject, 20, 5);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject + 19, yOfObject, 1, 8);
	}
	
	public static void draw4(Graphics g, int xOfObject, int yOfObject) {
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject , yOfObject , 1, 8);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject, yOfObject + 5, 20, 5);
		
		g.setColor(new Color(255,165,0));
		g.fillRect(xOfObject + 19, yOfObject, 1, 8);
	}



}
