import java.awt.Color;
import java.awt.Graphics;

public class Basement {
	public static void basement(Graphics g) {
		layout(g);
		road(g);
		curbs(g);
		curbsOnEnd(g);
		pillars(g);
		pillarsOnEnd(g);
		parkingSpots(g);
		walkWay(g);
	
	}
		
	public static void layout(Graphics g) {
		g.setColor(new Color(132, 133, 124));
		g.fillRect(0, 0, 1010, 700);
		
		g.setColor(Color.black);
		g.fillRect(5, 50, 1000, 600);
	}
		
	public static void walkWay(Graphics g) {
		g.setColor(new Color(132, 133, 124));
		g.fillRect(55, 320, 780, 60);
	}
	
	public static void road(Graphics g) {
		//1rst and second rows
		int y;
		g.setColor(Color.white);
		
		for(int i = 0; i < 80; i++) {
			g.fillRect(120 + (i * 10), 117, 4, 2);
		}
		
		g.setColor(Color.white);
		
		y = 130;
		for(int i = 0; i < 71; i++) {
			g.fillRect(120 + (i * 10), 117 + y, 4, 2);
		}
		
		y = 330;
		for(int i = 0; i < 71; i++) {
			g.fillRect(120 + (i * 10), 117 + y, 4, 2);
		}
		
		y = 460;
		for(int i = 0; i < 80; i++) {
			g.fillRect(120 + (i * 10), 117+ y, 4, 2);
		}
		
		
		//1rst and second rows
	}
	//done
	public static void curbs(Graphics g) {
		
		//1rst row
		for(int j = 0; j < 4; j++) {
			g.setColor(Color.DARK_GRAY);
			for(int i = 0; i < 9; i++) {
				if(i % 10 != 0) {
					g.fillRect(22 + (20 * i) + (j * 200), 58, 16, 4);
				}
			}
		}
		//1rst row
		
		//2nd row
		for(int j = 0; j < 3; j++) {//continues to next section after pillar
			for(int i = 0; i < 9; i++) {//prints 1 section before a pillar
				if(i % 10 != 0 /*&& i % 9 != 0*/) {
					g.fillRect(222 + (20 * i) + (j * 200), 180, 16, 4);
				}
			}
		}
		//2nd row
		
		//3rd row
		for(int j =0; j < 4; j++) {//continues to next section after pillar
			for(int i = 0; i < 9; i++) {//prints 1 section before a pillar
				if(i % 10 != 0 /*&& i % 9 != 0*/) {
					g.fillRect(22 + (20 * i) + (j * 200), 308, 16, 4);
				}
			}
		}
		//3rd row
		
		//4rth row
		for(int j = 0; j < 3; j++) {//continues to next section after pillar
			for(int i = 0; i < 9; i++) {//prints 1 section before a pillar
				if(i % 10 != 0 /*&& i % 9 != 0*/) {
					g.fillRect(22 + (20 * i) + (j * 200), 388, 16, 4);
				}
			}
		}
		//4rth row
		
		
		//5th row
		for(int j = 0; j < 3; j++) {//continues to next section after pillar
			for(int i = 0; i < 9; i++) {//prints 1 section before a pillar
				if(i % 10 != 0 /*&& i % 9 != 0*/) {
					g.fillRect(222 + (20 * i) + (j * 200), 511, 16, 4);
				}
			}
		}
		//5th row

		//6th row
		int y = 575;
		for(int j = 0; j < 4; j++) {
			g.setColor(Color.DARK_GRAY);
			for(int i = 0; i < 9; i++) {
				if(i % 10 != 0) {
					g.fillRect(22 + (20 * i) + (j * 200), 58 + y, 16, 4);
				}
			}
		}
		//6th row
		
		
	}
	//done
	public static void curbsOnEnd(Graphics g) {
		
		//1rst row right end
		g.setColor(Color.DARK_GRAY);
		for(int i = 0; i < 7; i++) {
			if(i % 10 != 0) {
				g.fillRect(822 + (20 * i), 58, 16, 4);
			}
		}
		//1rst row right end
		
		//2nd row left end
		for(int i = 5; i < 9; i++) {
			if(i % 10 != 0 /*&& i % 9 != 0*/) {
				g.fillRect(22 + (20 * i), 180, 16, 4);
			}
		}
		//2nd row left end
		
		//2nd row right end
		for(int i = 0; i < 7; i++) {
			if(i % 10 != 0 /*&& i % 9 != 0*/) {
				g.fillRect(822 + (20 * i), 180, 16, 4);
			}
		}
		//2nd row right end
		
		
		//5th row left end
		for(int i = 5; i < 9; i++) {
			if(i % 10 != 0 /*&& i % 9 != 0*/) {
				g.fillRect(22 + (20 * i), 511, 16, 4);
			}
		}
		//5th row left end
		
		//5th row right end
		for(int i = 0; i < 7; i++) {
			if(i % 10 != 0 /*&& i % 9 != 0*/) {
				g.fillRect(822 + (20 * i), 511, 16, 4);
			}
		}
		//5th row right end
		
		
		//6th row right end
		g.setColor(Color.DARK_GRAY);
		for(int i = 0; i < 7; i++) {
			if(i % 10 != 0) {
				g.fillRect(822 + (20 * i), 58, 16, 4);
			}
		}
		//6th row right end
		
		//7th row right end
		g.setColor(Color.DARK_GRAY);
		for(int i = 0; i < 7; i++) {
			if(i % 10 != 0) {
				g.fillRect(822 + (20 * i), 58 + 575, 16, 4);
			}
		}
		//7th row right end
				
	}
	//done
	public static void pillars(Graphics g) {//draws the pilars in general
		int y = 115;

		//1rst row
		for(int i = 0; i < 5; i++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + (200 * i), 60 , 25, 21);//main pillar
			
			g.fillOval(10 + (200 * i), 78, 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + (200 * i), 57, 25, 5);//top outline of pillar
			
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + (200 * i), 58 , 23, 5);
			//1rst row
		}
		
		//2nd row
		for(int j = 1; j < 3; j++) {
			for(int i = 0; i < 5; i++) {
				g.setColor(new Color(132, 133, 124));
				
				g.fillRect(10 + (200 * i), 60 + (j * y), 25, 21);//main pillar
				
				g.fillOval(10 + (200 * i), 78 + (j * y), 25, 6);//bottom of pillar
				
				
				g.fillOval(10 + (200 * i), 57 + (j * y), 25, 5);//top outline of pillar
				
				g.setColor(Color.black);//top center of pillar
				g.fillOval(11 + (200 * i), 58 + (j * y), 23, 5);
				//2nd row
			}
		}
		
		//3rd row
		y = 325;
		for(int i = 0; i < 5; i++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + (200 * i), 60 + y, 25, 21);//main pillar
			
			g.fillOval(10 + (200 * i), 78 + y, 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + (200 * i), 57 + y, 25, 5);//top outline of pillar
			
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + (200 * i), 58 + y, 23, 5);
			
		}
		
		//4rth row
		y = 445;
		for(int i = 0; i < 5; i++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + (200 * i), 60 + y, 25, 21);//main pillar
			
			g.fillOval(10 + (200 * i), 78 + y, 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + (200 * i), 57 + y, 25, 5);//top outline of pillar
			
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + (200 * i), 58 + y, 23, 5);
			
		}
		//4rth row
		y = 555;
		for(int i = 0; i < 5; i++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + (200 * i), 60 + y , 25, 21);//main pillar
			
			g.fillOval(10 + (200 * i), 78 + y, 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + (200 * i), 57 + y, 25, 5);//top outline of pillar
			
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + (200 * i), 58 +y, 23, 5);
			//1rst row
		}

		
		
	}
	//done
	public static void pillarsOnEnd(Graphics g) { //draws the pillars on the end
		
		int y = 115;
		int x = 965;
		//1rst row on end
		g.setColor(new Color(132, 133, 124));
		
		g.fillRect(10 + x, 60, 25, 21);//main pillar
		
		g.fillOval(10 + x, 78, 25, 6);//bottom of pillar
		
		
		g.fillOval(10 + x, 57, 25, 5);//top outline of pillar
	
		g.setColor(Color.black);//top center of pillar
		g.fillOval(11 + x, 58, 23, 5);
		//1rst row on end
		
		for(int j = 0; j < 3; j++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + x, 60 +(j * y), 25, 21);//main pillar
			
			g.fillOval(10 + x, 78 +(j * y), 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + x, 57 +(j * y), 25, 5);//top outline of pillar
		
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + x, 58 +(j * y), 23, 5);
		}
		
		//4rth 5th and 6th rows
		for(int j = 3; j < 6; j++) {
			g.setColor(new Color(132, 133, 124));
			
			g.fillRect(10 + x, 40 +(j * y), 25, 21);//main pillar
			
			g.fillOval(10 + x, 58 +(j * y), 25, 6);//bottom of pillar
			
			
			g.fillOval(10 + x, 37 +(j * y), 25, 5);//top outline of pillar
		
			g.setColor(Color.black);//top center of pillar
			g.fillOval(11 + x, 38 +(j * y), 23, 5);
		}
		
		//4rth 5th and 6th rows
			
		
		
	}
	//done
	public static void parkingSpots(Graphics g) {
		int x;
		int y = 100;
		//1rst row
		for(int i = 0; i < 48; i++) {
				g.setColor(Color.yellow);
				if(i % 10 != 0) { //every ten dont paint
					g.fillRect(20 + (20 * i), 55, 1, 30);
				}
		}
		//1rst row
		
		for(int i = 5; i < 48; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 155, 1, 30);
			}
		}
		//2nd row
		
		//3rd row
		for(int i = 5; i < 48; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 185, 1, 30);
			}
		}
		//3rd row
		
		//4rth row
		for(int i = 0; i < 40; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 185 + y, 1, 30);
			}
		}
		//4rth row
		
		//5th row
		y = 200;
		for(int i = 0; i < 40; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 185 + y, 1, 30);
			}
		}
		//5th row
		
		//6th row
		y = 300;
		for(int i = 5; i < 48; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 185 + y, 1, 30);
			}
		}
		//6th row
		
		//7th row
		y = 330;
		for(int i = 5; i < 48; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) {//every ten dont paint
				g.fillRect(20 + (20 * i), 185 + y, 1, 30);
			}
		}
		//7th row
		
		//8th row
		y = 555;
		for(int i = 0; i < 48; i++) {
			g.setColor(Color.yellow);
			if(i % 10 != 0) { //every ten dont paint
				g.fillRect(20 + (20 * i), 55 + y, 1, 30);
			}
		}
		//8th row
		
		
	}
}	
