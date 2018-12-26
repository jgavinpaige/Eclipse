import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	Ball ball; Paddle cpu; Paddle player;
	
	public Paint(Ball a, Paddle cp, Paddle p) {
		ball=a;
		cpu=cp;
		player=p;
	}
	

	public void paintComponent(Graphics g) {
		//ball
		g.setColor(Color.black);
		g.fillOval((int)ball.x, (int)ball.y, 20, 20);
		
		//paddles
		g.setColor(Color.blue);
		g.fillRect((int)cpu.x, (int)cpu.y, 18, 120);
		g.fillRect((int)player.x, (int)player.y, 18, 120);
		
		//scoring
		g.setColor(Color.RED);
		g.setFont(new Font("TimesRoman", Font.ITALIC, 20)); 
		g.drawString("Computer: "+Pong.score.cpuScore(), 600, 20);
		g.drawString("Player: "+Pong.score.playerScore(), 90, 20);
	}
	
	
}
