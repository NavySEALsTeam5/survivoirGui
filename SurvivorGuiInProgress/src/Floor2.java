import java.awt.Color;
import java.awt.Graphics;

public class Floor2 {
	public static void draw(Graphics g) {
		int i = 5;
		g.setColor(new Color(132, 133, 124));// makes concrete area
		g.fillRect(305, 70 - i, 100 -i, 560 -i);
		
//		g.setColor(new Color(132, 133, 124));//makes top concrete stair area
//		g.fillRect(402, 108 -i, 22 -, 60);
//		
//		g.setColor(new Color(132, 133, 124));//make middle concrete stair area
//		g.fillRect(402, 318, 22, 70);
//		
//		g.setColor(new Color(132, 133, 124));//make bottom concrete stair area
//		g.fillRect(402, 538, 22, 60);
		
		g.setColor(Color.WHITE); // top guard rail
		g.fillRect(305, 70 -i, 100 -i, 3);
		
		g.setColor(Color.WHITE); // bottom guard rail
		g.fillRect(305, 625 - i, 100, 3);

		
//		g.setColor(new Color(190,192,192));
//		g.drawLine(412, 105, 412, 160);
//		g.drawLine(412, 318, 412, 383);
//		g.drawLine(412, 538, 412, 593);
//
//		//top stair
//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 105, 10, 3);// top of top rail for stair
//		g.fillRect(412, 105, 2, 3);
//		g.fillRect(412, 108, 12, 2);
//
//		
//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 160, 12, 3);// top of top rail for stair
//		g.fillRect(402, 160, 2, 3);
//		g.fillRect(412, 163, 12, 2);

//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 315, 10, 3);// top of top rail for stair
//		g.fillRect(412, 315, 2, 3);
//		g.fillRect(412, 318, 12, 2);
//
//		
//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 380, 12, 3);// top of top rail for stair
//		g.fillRect(402, 380, 2, 3);
//		g.fillRect(412, 383, 12, 2);
//
//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 535, 10, 3);// top of top rail for stair
//		g.fillRect(412, 535, 2, 3);
//		g.fillRect(412, 538, 12, 2);
//
//		//fix
//		g.setColor(Color.WHITE);// top stair top rail
//		g.fillRect(402, 590, 12, 3);// top of top rail for stair
//		g.fillRect(402, 590, 2, 3);
//		g.fillRect(412, 593, 12, 2);
//		//fix
		
		g.setColor(Color.WHITE);// right top rail
		g.fillRect(402, 70 - i, 3, 35 -i);
		
		g.setColor(Color.WHITE); //right middle top rail
		g.fillRect(402, 160 - i, 3, 155 -i);
		
		g.setColor(Color.WHITE); //right middle bottom rail
		g.fillRect(402, 380 - i, 3, 155 - i);
		
		g.setColor(Color.WHITE); //right bottom bottom rail
		g.fillRect(402, 590 - i, 3, 35 - i);
	}
}
