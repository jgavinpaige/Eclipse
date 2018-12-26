import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	public void paint(Graphics g) {
		
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setColor(new Color(0, 130, 0));
	    
	    for(Matrix i : Main.matrix) {
	    	g2.setFont(new Font("TimesRoman", Font.PLAIN, i.textSize));
	    	for(int z=0; z<i.numbers.length; z++) {
	    		int j= i.numbers[z];
	    		
	    		g2.drawString(""+j, (int)i.x, (int)i.y+z*i.textSize);
	    		
	    	}
	    	i.move();
	    }
		
	}
	
}
