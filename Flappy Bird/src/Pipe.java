
public class Pipe {
	
	double x, height, xspeed, bottomY, thickness;
	
	public Pipe() {
		
		x= 700;
		height= Math.random()*400+30;
		bottomY= height+120;
		xspeed=1;
		thickness= 80;
		
		
	}
	
	public void move() {
		
		x-=xspeed;
		if(x<-100) {
			World.pipes.remove(this);
		}
		
		
	}
	
	
}
