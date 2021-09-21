import java.awt.Color;
import java.awt.Graphics;

public class Armory {
//	roomArrangeMentBottomFloor[4][0][randomFloorArmory] = "_"; building[4][0][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[4][1][randomFloorArmory] = "_"; building[4][1][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[4][2][randomFloorArmory] = "_"; building[4][2][randomFloorArmory] = "a";			
//	roomArrangeMentBottomFloor[4][3][randomFloorArmory] = "_"; building[4][3][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[4][4][randomFloorArmory] = " ";
//	roomArrangeMentBottomFloor[4][5][randomFloorArmory] = "_"; building[4][5][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[5][3][randomFloorArmory] = "|"; building[5][3][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[5][5][randomFloorArmory] = "|"; building[5][5][randomFloorArmory] = "a";
//	roomArrangeMentBottomFloor[5][4][randomFloorArmory] = "_"; building[5][4][randomFloorArmory] = "A";
	public static void drawArmory(Graphics g,boolean armoryOpen) {
		int i;
		g.setColor(Color.black);
		g.fillRect(70, 50, 5, 50);//armory right wall
	
		g.fillRect(35, 105, 10, 5);// armory door
		
		if(armoryOpen == false) {
			g.setColor(Color.red);
			g.fillRect(45, 105, 10, 5);// armory door
		}
		
		g.setColor(Color.black);
		g.fillRect(55, 105, 10, 5);// armory door
		
		g.fillRect(60, 95, 5, 10); // wall behind door
		g.fillRect(60, 95, 10, 5);//wall behind door
		
		g.fillRect(5, 95, 30, 5);//armory left wall
		
		g.fillRect(35, 95, 5, 10); // wall behind door
		
		for(i = 1; i < 4; i++) {
			g.setColor(Color.black);
			g.fillRect(6 ,53 + (10 * i), 8 , 8 );
			
			g.setColor(new Color(193, 154, 107));
			g.fillRect(7, 54 + (10 * i), 6 , 6 );
		}
		
		
	}
	
	public static void armoryMoney(Graphics g, int xOfObject, int yOfObject) {
		
		g.setColor(new Color(17, 140, 79));
		g.fillRect(xOfObject , yOfObject, 10, 10);
		
		g.setColor(Color.black);
		g.fillRect(xOfObject + 3, yOfObject + 2, 5, 1);
		g.fillRect(xOfObject + 3, yOfObject + 3, 1, 2);
		g.fillRect(xOfObject + 3, yOfObject + 5, 5, 1);
		g.fillRect(xOfObject + 7, yOfObject + 5, 1, 3);
		g.fillRect(xOfObject + 3, yOfObject + 8, 5, 1);
		g.fillRect(xOfObject + 5, yOfObject + 1, 1, 9);
	}
	
}
