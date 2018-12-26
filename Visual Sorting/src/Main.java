import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static int[] size= new int[300];
	public static long timer_start;

	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<size.length; i++) {
			size[i]= (int)(Math.random()*600);
		}
		
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(1215,632));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Sorting Machine");
		window.setResizable(false);
		window.setBackground(Color.black);
		Paint paint= new Paint();
		window.setVisible(true);
		//window.setContentPane(paint);
		
		timer_start= System.currentTimeMillis();
		int count=1;
		while(count>0) {
			count=0;
			for(int i=0; i<size.length-1; i++) {
				if(size[i]>size[i+1]) {
					int temp= size[i];
					size[i]=size[i+1];
					size[i+1]=temp;
					window.setContentPane(paint);
					//Thread.sleep(4);
					count++;
				}
			}
		}
		paint.finished=true;
		window.setContentPane(paint);
	}

}
