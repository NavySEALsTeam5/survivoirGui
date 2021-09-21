import java.awt.Color;
import java.awt.Graphics;

public class Fountain {
	
	public static void fountain(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillOval(610, 305, 90, 90);
		
		g.setColor(new Color(192, 192, 192));
		g.fillOval(630, 325, 50, 50);
		
		g.setColor(new Color(3, 169, 244));
		g.fillOval(633, 328, 45, 45);
		
		g.setColor(new Color(192, 192, 192));
		g.fillOval(650, 345, 10, 10);
		//g.fillRect(415, 320, 480, 63);
		
		
	}
}
