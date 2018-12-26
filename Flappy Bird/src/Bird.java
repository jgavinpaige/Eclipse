
public class Bird {
	
	double yspeed, y, x;
	long timeJumped;
	long start;
	
	public Bird() {
		start= System.currentTimeMillis();
		y= 250;
		x= 50;
		timeJumped= System.currentTimeMillis();		
		yspeed+= .3*(((double)System.currentTimeMillis()-(double)timeJumped)/(double)1000);
	}
	
	public void flap() {
		
		yspeed= -2.5;
		timeJumped= System.currentTimeMillis();		
		
	}
	
	public void move() {
		
		if((System.currentTimeMillis()-start)>=0) {
			start= System.currentTimeMillis()+2000;
			World.pipes.add(new Pipe());
		}
		y+= yspeed;
		yspeed+= .3*(((double)System.currentTimeMillis()-(double)timeJumped)/(double)1000);
		for(Pipe i : World.pipes) {
			
			if((y<i.height-5||y>i.bottomY-15)&&x>i.x-22 &&x<(i.x+i.thickness)) {
				System.exit(0 );
			}
			
		}
		
	}
	
}
