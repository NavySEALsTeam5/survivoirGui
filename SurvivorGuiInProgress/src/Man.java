import java.awt.Color;
import java.awt.Graphics;

public class Man {
	public static void drawMan(Graphics g, String direction, int x, int y) {
		
		if(direction.equals("u")) {
			g.setColor(Color.black);//body
			g.fillRect(x , y + 3, 10, 4); 
			
			
			g.setColor(new Color(255, 229, 180));
			g.fillRect(x + 3, y + 3, 4, 4);  
		}
		
		else if(direction.equals("d")) {
			g.setColor(Color.black);//body
			g.fillRect(x , y + 3, 10, 4); 
			
			
			g.setColor(new Color(255, 229, 180));
			g.fillRect(x + 3, y + 3, 4, 4);  
			
		}
		
		else if(direction.equals("l")) {
			g.setColor(Color.black);//body
			g.fillRect(x + 3, y, 4, 10); 
			
			
			g.setColor(new Color(255, 229, 180));
			g.fillRect(x + 3, y + 3, 4, 4); 
		}
		
		else if(direction.equals("r")) {
			g.setColor(Color.black);//body
			g.fillRect(x , y, 4, 10); 
			
			
			g.setColor(new Color(255, 229, 180));
			g.fillRect(x, y + 3, 4, 4); 
		}
		
		else {
			g.setColor(Color.black);//body
			g.fillRect(x + 3, y, 4, 10); 
			
			
			g.setColor(new Color(255, 229, 180));
			g.fillRect(x + 3, y + 3, 4, 4); 
		}
	}
}
