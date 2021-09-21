import java.awt.Color;
import java.awt.Graphics;

public class DrawElevator {
	public static void draw(Graphics g) {
		g.setColor(new Color(192,192,192)); //top of elevator top
		g.fillRect(5, 320, 50, 5);
		
		g.setColor(new Color(192,192,192));	//top right door
		g.fillRect(50, 320 , 5, 20);
		
		g.setColor(new Color(192,192,192));//top of elevator bottom
		g.fillRect(5, 375, 50, 5);

		g.setColor(new Color(192,192,192)); // bottom right of elevator
		g.fillRect(50, 360, 5, 17);
		
		g.setColor(new Color(192,192,192)); // 
		g.fillRect(54, 360, 1, 17);
		
		g.setColor(Color.BLACK); // elevator door
		g.fillRect(50, 340, 5, 20);
	}
}
