import java.awt.Color;
import java.awt.Graphics;

public class WalkWays {
	
	public static void drawTopWalkWay(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(415, 110, 480, 53);
	}
	
	public static void drawMiddleWalkWay(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(415, 320, 480, 63);
	}
	
	public static void drawBottomWalkWay(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(415, 540, 480, 53);
	}
}
