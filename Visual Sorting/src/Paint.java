import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	boolean finished=false;
	
	public void paint(Graphics g) {
		for(int i=0; i<Main.size.length; i++) {
			if(finished==true) {
				g.setColor(Color.green);
				g.fillRect(5+4*i, 600-Main.size[i], 3, Main.size[i]);
				int time= (int)((System.currentTimeMillis()-Main.timer_start)/1000);
				String print= time+"";
				g.drawString(print, 15, 30);
			}
			else {
				g.setColor(Color.white);
				g.fillRect(5+4*i, 600-Main.size[i], 3, Main.size[i]);
				int time= (int)((System.currentTimeMillis()-Main.timer_start)/1000);
				String print= time+"";
				g.drawString(print, 15, 30);
			}
			
			
		}
	}
	
	
	
}
