import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(1300,700));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setTitle("2D Shooter Game");
		window.setResizable(false);
		keyEvent listen= new keyEvent();
		window.addKeyListener(listen);
		mouseEvent listener= new mouseEvent();
		window.addMouseListener(listener);
		
		Paint paint = new Paint();
		window.setContentPane(paint);
		
		window.setVisible(true);
		
		long time1= System.currentTimeMillis();
		long time2= System.currentTimeMillis();
		
		while(Player.alive) {
			Player.move();
			Turret.shoot();
			window.setContentPane(paint);
			Thread.sleep(9);
			if(System.currentTimeMillis()-time1>=3000) {
				time1=System.currentTimeMillis();
				StrongEnemy.addEnemy();
			}
			if(System.currentTimeMillis()-time2>=9000) {
				time2=System.currentTimeMillis();
				ShootingEnemy.addEnemy();
			}
		}
		
	}

}
