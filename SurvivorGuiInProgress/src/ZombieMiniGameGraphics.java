import java.awt.Color;
import java.awt.Graphics;

public class ZombieMiniGameGraphics {
	public static void layout(Graphics g) {
		g.setColor(new Color(128,0,0));
		g.fillRect(5, 150, 900, 390);
		
		g.setColor(Color.black);
		g.fillRect(840, 150, 1, 390);
		
		
		
	}
	
	public static void drawBullets(Graphics g, int x, int y, String currentItem) {
		g.setColor(Color.GRAY);
		
		if(currentItem != "Marley and Harley") {
			g.setColor(Color.yellow);
		}
		
		else {
			g.setColor(new Color(255, 87, 51));
		}
		
		g.fillRect(x + 5, y + 150 + 5, 5, 1);

	}  
	
	public static void drawRPG(Graphics g, int x, int y) {
		g.setColor(Color.GRAY);
		g.setColor(Color.black);
		g.fillRect(x + 5, y + 150 + 5, 5, 3);

	}
	
	public static void drawZombies(Graphics g, int xOfObject, int yOfObject) { 
		g.setColor(new Color(34, 139, 34));
		g.fillRect(xOfObject + 6 + 8, yOfObject + 150, 5 ,  2);
		g.fillRect(xOfObject + 6 + 8 , yOfObject + 11 + 150, 5 ,  2);
	
		g.setColor(new Color(34, 139, 34));
		g.fillRect(xOfObject + 5, yOfObject + 150, 6,  14);
		
		g.setColor(Color.green);
		g.fillRect(xOfObject + 5 , yOfObject + 150 + 4, 6,  6);
		
	}
	
	public static void drawExplosion(Graphics g, int x, int y) {
		g.setColor(Color.yellow);
		g.fillRect(x, y + 150, 15, 15);
		g.setColor(Color.orange);
		g.fillRect(x + 2, y + 150 + 2, 11, 11);
		g.setColor(Color.red);
		g.fillRect(x + 4, y + 150 + 4, 9, 9);
	}
	
	public static void drawMortarTeams(Graphics g) {
		int x = 860;
		int y = 160;
		g.setColor(new Color(0,120,0));
		g.fillRect(x + 6, y + 4, 9, 9);
		g.fillRect(x - 1, y + 8, 4, 4);
		
		g.setColor(Color.black);
		g.fillRect(x, y - 1, 2, 11);
		
		g.setColor(new Color(0,100,0));
		g.fillRect(x + 1, y - 1, 6, 2);
		g.fillRect(x + 2, y, 6, 2);
		g.fillRect(x + 3, y + 1, 6, 2);
		g.fillRect(x + 4, y + 2, 6, 2);
		g.fillRect(x + 5, y + 3, 6, 2);
		g.fillRect(x + 6, y + 4, 6, 2);
		g.fillRect(x + 7, y + 5, 6, 2);
		g.fillRect(x + 8, y + 6, 6, 2);
		g.fillRect(x + 9, y + 7, 6, 2);
		
		g.setColor(new Color(0,100,0));
		g.fillOval(x, y - 5, 6, 6);
		
		g.setColor(Color.black);
		g.fillOval(x + 1, y - 4, 4, 4);
		
		y = 330;
		g.setColor(new Color(0,120,0));
		g.fillRect(x + 6, y + 4, 9, 9);
		g.fillRect(x - 1, y + 8, 4, 4);
		
		g.setColor(Color.black);
		g.fillRect(x, y - 1, 2, 11);
		
		g.setColor(new Color(0,100,0));
		g.fillRect(x + 1, y - 1, 6, 2);
		g.fillRect(x + 2, y, 6, 2);
		g.fillRect(x + 3, y + 1, 6, 2);
		g.fillRect(x + 4, y + 2, 6, 2);
		g.fillRect(x + 5, y + 3, 6, 2);
		g.fillRect(x + 6, y + 4, 6, 2);
		g.fillRect(x + 7, y + 5, 6, 2);
		g.fillRect(x + 8, y + 6, 6, 2);
		g.fillRect(x + 9, y + 7, 6, 2);
		
		g.setColor(new Color(0,100,0));
		g.fillOval(x, y - 5, 6, 6);
		
		g.setColor(Color.black);
		g.fillOval(x + 1, y - 4, 4, 4);
		
		y = 490;
		g.setColor(new Color(0,120,0));
		g.fillRect(x + 6, y + 4, 9, 9);
		g.fillRect(x - 1, y + 8, 4, 4);
		
		g.setColor(Color.black);
		g.fillRect(x, y - 1, 2, 11);
		
		g.setColor(new Color(0,100,0));
		g.fillRect(x + 1, y - 1, 6, 2);
		g.fillRect(x + 2, y, 6, 2);
		g.fillRect(x + 3, y + 1, 6, 2);
		g.fillRect(x + 4, y + 2, 6, 2);
		g.fillRect(x + 5, y + 3, 6, 2);
		g.fillRect(x + 6, y + 4, 6, 2);
		g.fillRect(x + 7, y + 5, 6, 2);
		g.fillRect(x + 8, y + 6, 6, 2);
		g.fillRect(x + 9, y + 7, 6, 2);
		
		g.setColor(new Color(0,100,0));
		g.fillOval(x, y - 5, 6, 6);
		
		g.setColor(Color.black);
		g.fillOval(x + 1, y - 4, 4, 4);
		
	}
	
	public static void drawMan(Graphics g, int x, int y, String currentItem) {
		
		g.setColor(Color.black);//body
		g.fillRect(x + 3, y, 6, 15); 
		
		
		g.setColor(new Color(255, 229, 180));
		g.fillRect(x + 3, y + 5, 6, 6); 
		
		switch(currentItem) {
			case "glock":
				glock(g, x, y);
				break;
			case "1911 custom pistol":
				glock(g, x, y);
				break;
			case "Uzi":
				uzi(g, x, y);
				break;
			case "50 Cal Sniper Rifle":
				fiftyCalSniper(g, x, y);
				break;
			case "306 rifle":
				thirty06(g, x, y);
				break;
			case "AR_15":
				ar_15(g, x, y);
				break;
			case "M16":
				M16(g, x, y);
				break;
				
			case "PKM":
				PKM(g, x, y);
				break;
				
			case "50 Cal Machine Gun":
				fiftyMachineGun(g, x, y);
				break;	
				
			case "RPG":
				rpg(g, x, y);
				break;
				
			case "Marley and Harley":
				mas(g, x, y);
				break;
		}
	}
	
	public static void glock(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 2, y + 7, 5, 2); 
	}
	
	public static void uzi(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 2, y + 4, 5, 3); 
		g.fillRect(x - 3, y + 5, 5, 1);//barrel
		
		g.fillRect(x, y + 6, 1, 3); //foreGrip
	}
	
	public static void thirty06(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 6, y, 7, 3); //scope
		
		g.fillRect(x - 27, y + 1, 30, 2);//barrel
		
		g.fillRect(x - 20, y + 1, 23, 3);//stock
		
		g.fillRect(x - 22, y + 1, 2, 4);//rest
	}
	
	public static void fiftyCalSniper(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 11, y, 7, 3); //scope
		
		g.fillRect(x - 24, y + 1, 23, 2);//barrel
		
		g.fillRect(x - 1, y + 1, 4, 3);//stock
		
		g.fillRect(x - 20, y + 1, 2, 4);//rest
		
		g.fillRect(x - 11, y + 1, 4, 3);//mag
		
	//	g.fillRect()
	}
	
	public static void ar_15(Graphics g, int x, int y) {//make mk42
		g.setColor(Color.black);//gun
		g.fillRect(x - 4, y, 2, 2); //scope
		
		g.fillRect(x - 18, y + 1, 6, 2);//barrel
		
		g.fillRect(x - 13, y + 1, 16, 3);//body
		
		g.fillRect(x - 3, y + 1, 5, 4);//stock
		
		g.fillRect(x - 13, y + 1, 1, 5);//forGrip
		
		g.fillRect(x - 9, y + 1, 3, 4);//mag
	}

	public static void M16(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 4, y, 2, 2); //scope
		
		g.fillRect(x - 18, y + 2, 8, 1);//barrel
		
		g.fillRect(x - 8, y + 1, 8, 3);//body
		
		g.fillRect(x - 10, y + 1, 2, 2);//forward body
		
		g.fillRect(x - 2, y + 1, 5, 2);//stock
		
		g.fillRect(x - 9, y + 1, 1, 5);//forGrip
		
		g.fillRect(x - 1, y + 1, 1, 5);//forGrip
		
		g.fillRect(x - 5, y + 2, 2, 4);//mag
	}
	
	public static void PKM(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 11, y + 3, 7, 3); //scope
		
		g.fillRect(x - 27, y + 4, 30, 2);//barrel
		
		g.fillRect(x - 20, y + 4, 23, 4);//stock
		
		g.fillRect(x - 23, y + 4, 2, 7);//rest
		
		g.fillRect(x - 11, y + 8, 6, 4);//mag
	}
	
	public static void fiftyMachineGun(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 11, y + 3, 7, 3); //scope
		
		g.fillRect(x - 27, y + 4, 30, 2);//barrel
		
		g.fillRect(x - 20, y + 4, 23, 4);//stock
		
		g.fillRect(x - 23, y + 4, 2, 7);//rest
		
		g.fillRect(x - 11, y + 8, 6, 4);//mag
	}

	public static void rpg(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 4, y - 3, 2, 5); //scope
		
		g.fillRect(x - 19, y, 3, 5);//missle
		g.fillRect(x - 20, y + 1, 3, 3);//missle
		g.fillRect(x - 21, y + 2, 3, 1);//missle
		
		g.fillRect(x - 15, y + 1, 30, 3);//barrel
		
		g.fillRect(x + 15, y, 2, 6);//barrel
		
		g.fillRect(x - 1, y + 1, 4, 3);//stock

	}
	
	public static void mas(Graphics g, int x, int y) {
		g.setColor(Color.black);//gun
		g.fillRect(x - 2, y + 12, 5, 2); 
		
		g.setColor(Color.black);//gun
		g.fillRect(x - 2, y + 1, 5, 2); 
	}
} 
   