import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class Streak {
	
	private double x, y, dist, xspeed, yspeed, previousX, previousY; 
	public double size= 0;	
	
	public Streak() {
		
		x= (Math.random()*480+2);
		y= (Math.random()*460+2);
		dist= Math.sqrt((x-240)*(x-240)+(getY()-250)*(getY()-250));
		size= 0;
		previousX= 240;
		previousY= 250;
		
	}

	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}
	
	public double getPreviousY() {
		return previousY;
	}

	public double getPreviousX() {
		return previousX;
	}
	
	
	public void move() {
		dist= Math.sqrt((x-240)*(x-240)+(getY()-250)*(getY()-250));
		size= dist/100;
		
		PointerInfo a= MouseInfo.getPointerInfo();
		Point b= a.getLocation();
		double mouseX= b.getX();
		
		xspeed= (x-240)/(20+mouseX/5);
		yspeed= (y-250)/(20+mouseX/5);
		if(x>500||x<0||y>500|y<0) {
			resetStreak();
		}
		else {
		previousX= x-xspeed;
		previousY= y-yspeed;
		x+=xspeed;
		y+=yspeed;
		}
		
		
	}
	
	public void resetStreak() {
		
		this.x= (Math.random()*50+215);
		this.y= (Math.random()*50+225);
		size= 1;
		previousX= x;
		previousY= y;
		
	}
	
}
