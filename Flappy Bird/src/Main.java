import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame window= new JFrame();
		keyEvent keyListener= new keyEvent();
		window.addKeyListener(keyListener);
		window.setPreferredSize(new Dimension(600,600));
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Flappy Bird");
		window.setResizable(false);
		window.setBackground(new Color(240, 255, 255));
		window.setVisible(true);
		
		
		Paint paint= new Paint();
		
		for(;;) {
			window.setContentPane(paint);
			
			Thread.sleep(15);
			
		}
		
	}

}
