import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static int[]size= new int[60];
	
	public static void main(String[] args) {
		
		
		for(int j=0; j<size.length; j++) {
			
		}
		
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(600,600));
		window.pack();
		window.setVisible(true);
		window.setTitle("Sorting Machine");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
