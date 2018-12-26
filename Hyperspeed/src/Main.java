import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
	
	static Streak[] streaks= new Streak[1500];
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(500,500));
		window.pack();
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setTitle("Warp Speed");
		
		for(int i=0; i<streaks.length; i++) {
			streaks[i]= new Streak();
		}
		
		Paint paint= new Paint();
		window.setBackground(Color.BLACK);
		window.setContentPane(paint);
		window.setVisible(true);
		
		for(;;) {
			window.setContentPane(paint);
			Thread.sleep(15);
		}
		
		
		
	}
	
}
