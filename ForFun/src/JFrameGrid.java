import java.awt.*;
import javax.swing.*;

public class JFrameGrid extends JPanel{

	public void paint(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
		g.drawString("Welcome to Chess!", 105, 70);
		g.fillRect(100, 100, 400, 400);
		for(int i=100; i<=450; i+=100) {
			for(int j=100; j<=450; j+=100) {
				g.clearRect(i,j,50,50);
			}
		}
		for(int i=150; i<=450; i+=100) {
			for(int j=150; j<=450; j+=100) {
				g.clearRect(i,j,50,50);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		JFrame window= new JFrame();
		window.setSize(600,600);
		window.getContentPane().add(new JFrameGrid());
		window.setLocationRelativeTo(null);
		window.setBackground(Color.lightGray);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
