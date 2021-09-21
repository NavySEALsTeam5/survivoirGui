import java.awt.Color;
import java.awt.Graphics;

public class Roof {
	
	public static void heliPad(Graphics g) {
		g.setColor(new Color(128,0,0));// outline of helipad
		g.fillRect(55, 80, 200, 200);
		
		g.setColor(Color.white);	// the pad of heli pad
		g.fillRect(56, 81, 197, 197);
		
		g.setColor(new Color(0, 0, 128));// circle
		g.fillOval(85, 115, 140, 125);
		
		g.setColor(Color.white);//circle
		g.fillOval(87, 117, 136, 121);
		
		g.setColor(new Color(0, 0, 128));// h
		g.fillRect(120, 135, 70, 80 );
		
		
		g.setColor(Color.white); //h
		g.fillRect(125, 135, 60, 40);
		g.fillRect(125, 180, 60, 45);
		
		g.setColor(new Color(128,0,0));
		g.fillRect(125, 270, 60, 30 );
		
		g.setColor(Color.white);
		g.fillRect(126, 266, 58, 34);
		
		g.setColor(new Color(190,192,192));
		g.drawLine(125, 285, 185, 285);
		
		
	}
	
	public static void heliPadNet(Graphics g) {
		for(int i = 0; i < 20; i++) {
			g.setColor(Color.black);
			g.fillRect(30, 80 + (10 * i), 25, 2);
			g.fillRect(255, 80 + (10 * i), 25, 2);
		}
		
		for(int i = 0; i < 20; i++) {
			g.setColor(Color.black);
			g.fillRect(55 + (10 * i), 60, 2, 20);
			//g.fillRect(255, 80 + (10 * i), 25, 2);
		}
		
		for(int i = 0; i < 7; i++) {
			g.setColor(Color.black);
			g.fillRect(55 + (10 * i), 280, 2, 20);
			g.fillRect(190 + (10 * i), 280, 2, 20);
			//g.fillRect(255, 80 + (10 * i), 25, 2);
		}
		g.fillRect(253, 60, 2, 20);
	}
	
	public static void draw(Graphics g, int xOfObject, int yOfObject) { 
		g.setColor(Color.green);
		g.fillRect(xOfObject + 1 , yOfObject + 1, 7 , 7 );
	}
	
}
