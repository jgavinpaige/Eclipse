import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Paint extends JPanel{
	
	public void paint(Graphics g) {
		
		Graphics2D g2= (Graphics2D)g;
		
		//draw each line for cube
		g2.drawLine(Main.cube.p1.x, Main.cube.p1.y, Main.cube.p2.x, Main.cube.p2.y);
		g2.drawLine(Main.cube.p1.x, Main.cube.p1.y, Main.cube.p4.x, Main.cube.p4.y);
		g2.drawLine(Main.cube.p1.x, Main.cube.p1.y, Main.cube.p5.x, Main.cube.p5.y);
		g2.drawLine(Main.cube.p2.x, Main.cube.p2.y, Main.cube.p3.x, Main.cube.p3.y);
		g2.drawLine(Main.cube.p2.x, Main.cube.p2.y, Main.cube.p6.x, Main.cube.p6.y);
		g2.drawLine(Main.cube.p3.x, Main.cube.p3.y, Main.cube.p4.x, Main.cube.p4.y);
		g2.drawLine(Main.cube.p3.x, Main.cube.p3.y, Main.cube.p7.x, Main.cube.p7.y);
		g2.drawLine(Main.cube.p4.x, Main.cube.p4.y, Main.cube.p8.x, Main.cube.p8.y);
		g2.drawLine(Main.cube.p5.x, Main.cube.p5.y, Main.cube.p6.x, Main.cube.p6.y);
		g2.drawLine(Main.cube.p5.x, Main.cube.p5.y, Main.cube.p8.x, Main.cube.p8.y);
		g2.drawLine(Main.cube.p6.x, Main.cube.p6.y, Main.cube.p7.x, Main.cube.p7.y);
		g2.drawLine(Main.cube.p7.x, Main.cube.p7.y, Main.cube.p8.x, Main.cube.p8.y);
		
		
	}
	
}
