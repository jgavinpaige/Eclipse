import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
	
	static Matrix[] matrix= new Matrix[300];
	static Matrix[] organized= new Matrix[matrix.length];
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame window= new JFrame();
		window.setTitle("Matrix");
		window.setPreferredSize(new Dimension(500,500));
		window.pack();
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		Paint paint= new Paint();
		paint.setBackground(Color.black);
		window.setContentPane(paint);
		
		window.setVisible(true);
		
		for(int i=0; i<matrix.length; i++) {
			matrix[i]= new Matrix();
		}
		
		for(;;) {
			window.setContentPane(paint);
			Thread.sleep(15);
		}
	}
	
	

}
