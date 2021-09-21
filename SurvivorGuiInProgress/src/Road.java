import java.awt.Color;
import java.awt.Graphics;

public class Road {
	public static void road(Graphics g) {
		g.setColor(new Color(19,10,6));
		g.fillRect(905, 50, 115, 600);
		
	}
	
	public static void yellowLines(Graphics g) {
		for(int i = 1; i < 60; i++) {
			g.setColor(new Color(239, 183, 0));
			g.fillRect(963, 51 + (10 * i), 2, 3);
		}
	}
	
	public static void sideWalk(Graphics g) {
		g.setColor(new Color(132, 133, 124));
		g.fillRect(895, 50, 20, 600 );
	}
	
	public static void whiteLine(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(915, 50, 4 , 600);
		g.fillRect(1005, 50, 3 , 600);
	}
}
