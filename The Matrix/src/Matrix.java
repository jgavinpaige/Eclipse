
public class Matrix {
	
	double x, y, yspeed;
	private double originaly; 
	int textSize;
	int[] numbers;
	
	//lines of numbers 0-9
	//length
	//size with speed (closer = faster)
	
	public Matrix() {
		
		numbers = new int[(int)(Math.random()*9+2)];
		textSize = (int)(Math.random()*20+5);
		x= Math.random()*475+1;
		y= Math.random()*400;
		originaly= y;
		yspeed= 5.1/textSize;
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= (int)(Math.random()*9+1);
		}
		
	}
	
	public void move() {
		y+= yspeed;
		if(y>500) {
			numbers = new int[(int)(Math.random()*9+2)];
			for(int i=0; i<numbers.length; i++) {
				numbers[i]= (int)(Math.random()*9+1);
			}
			textSize = (int)(Math.random()*20+5);
			x= Math.random()*475+1;
			y= -(numbers.length*textSize);
			originaly= y;
			yspeed= 5.1/textSize;
		}
	}
	
	
	
}
