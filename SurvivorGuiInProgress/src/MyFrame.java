import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame /*implements ActionListener*/{

	MyFrame(){
		
		this.add(new GameContent());
		this.setTitle("Survivor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		this.getContentPane().setBackground(new Color(200,200,200));
	}
}