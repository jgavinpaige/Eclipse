import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Pong {
	
		public static Ball ball= new Ball();
		public static Paddle player= new Paddle();
		public static Paddle cpu= new Paddle(1);
		public static Score score= new Score();
		
	public static void main(String[]args) throws InterruptedException {
		JFrame window= new JFrame();
		window.setTitle("Pong Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(new Dimension(800,500));
		window.pack();
		window.setVisible(true);
		window.setResizable(false);
		


		Paint paint= new Paint(ball, cpu, player);
		keyEvent listen= new keyEvent();
		
		window.addKeyListener(listen);
		
		for(;;) {
			window.setContentPane(paint);
			cpu.move();
			player.move();
			ball.move();
			Thread.sleep(15);
		}
		
	}
	
	
	

}

