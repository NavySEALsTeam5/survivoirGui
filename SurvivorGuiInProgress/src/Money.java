import java.awt.Color;
import java.awt.Graphics;

public class Money {
	public static void drawMoney(Graphics g, int xOfObject, int yOfObject) {
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
