import java.awt.Color;
import java.awt.Graphics;

public class DrawStairs {
	
	
	public static void concrete(Graphics g) {
		g.setColor(new Color(132, 133, 124));// makes concrete area
		g.fillRect(305, 70, 100, 560);
		
		g.setColor(new Color(132, 133, 124));//makes top concrete stair area
		g.fillRect(402, 108, 22, 60);
		
		g.setColor(new Color(132, 133, 124));//make middle concrete stair area
		g.fillRect(402, 318, 22, 70);
		
		g.setColor(new Color(132, 133, 124));//make bottom concrete stair area
		g.fillRect(402, 538, 22, 60);
		
		g.setColor(Color.WHITE); // top guard rail
		g.fillRect(305, 70, 100, 3);
		
		g.setColor(Color.WHITE); // bottom guard rail
		g.fillRect(305, 625, 100, 3);
	}
	
	public static void drawTop(Graphics g) {
		
		g.setColor(new Color(190,192,192));
		g.drawLine(412, 105, 412, 160);
		g.drawLine(412, 318, 412, 383);
		g.drawLine(412, 538, 412, 593);
		
		for(int i = 0; i < 20; i++) { //top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(305 + (i * 5), 73, 2, 2);
		}
		
		for(int i = 0; i < 20; i++) { //top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(305 + (i * 5), 628, 2, 2);
		}
	}
	
	public static void drawTopStairs(Graphics g) {	
		//top stair
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 105, 10, 3);// top of top rail for stair
		g.fillRect(412, 105, 2, 3);
		g.fillRect(412, 108, 12, 2);

		
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 160, 12, 3);// top of top rail for stair
		g.fillRect(402, 160, 2, 3);
		g.fillRect(412, 163, 12, 2);
	}
	
	public static void drawTopUnderside(Graphics g) {
		for(int i = 0; i < 2; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(402 + (i * 5), 108, 2, 2);
		}
		
		for(int i = 0; i < 3; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 110, 2, 2);
		}
		
		for(int i = 0; i < 2; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(405 + (i * 3), 163, 2, 2);
		}
		
		for(int i = 0; i < 3; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 165, 2, 2);
		}
	}
	
	
	public static void drawMiddle(Graphics g) {
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 315, 10, 3);// top of top rail for stair
		g.fillRect(412, 315, 2, 3);
		g.fillRect(412, 318, 12, 2);

		
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 380, 12, 3);// top of top rail for stair
		g.fillRect(402, 380, 2, 3);
		g.fillRect(412, 383, 12, 2);
	}
	
	
	public static void drawMiddleStairs(Graphics g) {		
		for(int i = 0; i < 2; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(402 + (i * 5), 318, 2, 2);
		}
		
		for(int i = 0; i < 3; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 320, 2, 2);
		}
		
		for(int i = 0; i < 2; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(405 + (i * 3), 383, 2, 3);
		}
		
		for(int i = 0; i < 3; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 385, 2, 2);
		}
	}
	
	public static void drawBottom(Graphics g) {
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 535, 10, 3);// top of top rail for stair
		g.fillRect(412, 535, 2, 3);
		g.fillRect(412, 538, 12, 2);

		
		g.setColor(Color.WHITE);// top stair top rail
		g.fillRect(402, 590, 12, 3);// top of top rail for stair
		g.fillRect(402, 590, 2, 3);
		g.fillRect(412, 593, 12, 2);
	}

	public static void drawBottomUnderside(Graphics g) {		
		for(int i = 0; i < 2; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(402 + (i * 5), 538, 2, 2);
		}
		
		for(int i = 0; i < 3; i++) { //top top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 540, 2, 2);
		}
		
		for(int i = 0; i < 2; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(405 + (i * 3), 593, 2, 3);
		}
		
		for(int i = 0; i < 3; i++) { //bottom top rail under side
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(412 + (i * 5), 595, 2, 2);
		}
	}
	

	
	
	
	public static void drawRails(Graphics g) {
		g.setColor(Color.WHITE);// right top rail
		g.fillRect(402, 70, 3, 35);
		
		g.setColor(Color.WHITE); //right middle top rail
		g.fillRect(402, 160, 3, 155);
		
		g.setColor(Color.WHITE); //right middle bottom rail
		g.fillRect(402, 380, 3, 155);
		
		g.setColor(Color.WHITE); //right bottom bottom rail
		g.fillRect(402, 590, 3, 35);
	}
	
	
	
	
	
}
