import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	
	static Cube cube= new Cube();
	
	public static void main(String[] args) {
		
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(600,600));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setTitle("Rubiks Cube");
		
		Paint paint= new Paint();
		window.setContentPane(paint);
		
		window.setVisible(true);
		
	}

}
