import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	public void paint(Graphics g) {
		
		Graphics2D g2= (Graphics2D)g;
		g2.setColor(Color.WHITE);
		

		for(int z=0; z<Main.streaks.length; z++) {
			Streak i= Main.streaks[z];
			i.move();
			g2.setStroke(new BasicStroke((float)i.size+1));
			g2.drawLine((int)(i.getPreviousX()), (int)(i.getPreviousY()), (int)(i.getX()), (int)(i.getY()));
			//g2.fillOval((int)(i.getX()), (int)(i.getY()), (int)(i.size)+2, (int)(i.size)+2);
		}
		
		
	}
	
}
