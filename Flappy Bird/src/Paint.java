import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2= (Graphics2D)g;
		g2.setColor(new Color(127,255,0));
		for(int j=0; j<World.pipes.size(); j++) {
			Pipe i= World.pipes.get(j);
			System.out.println(i.x);
			g.fillRect((int)(i.x), 0, (int)(i.thickness), (int)(i.height));
			g.fillRect((int)(i.x), (int)(i.bottomY), (int)(i.thickness), 600);
			i.move();
			
		}
		
		
		g2.setColor(new Color(255, 245, 0));
		g2.fillOval((int)(World.player.x), (int)(World.player.y), 23, 23);
		System.out.println(World.player.yspeed);
		World.moveBird();
		
	}
	
}
