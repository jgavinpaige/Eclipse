import javax.swing.JPanel;

public class Ball extends JPanel{
	
	double x, y, xspeed, yspeed;
	Score score;
	
	public Ball() {
		x=385;
		y=250;
		
		yspeed= 1+Math.random()*3;
		xspeed= Math.sqrt(25-yspeed*yspeed);
		
		//random direction
		xspeed=xspeed-2*(xspeed)*(int)(Math.random()*2);
		yspeed=yspeed-2*(yspeed)*(int)(Math.random()*2);
		
		
	}

	boolean change=false;
	long wait;
	public void move() {
		
		x+=xspeed;
		y+=yspeed;
		if(y>=450||y<=0) {
			yspeed*=-1;
		}
		if(x>=800||x<=-20) {
			if(x>=800) {
				Pong.score.addPlayerPoint();
			}
			else {
				Pong.score.addCpuPoint();
			}
			x=385;
			y=250;
			
			yspeed= 1+Math.random()*2;
			xspeed= Math.sqrt(18-yspeed*yspeed);
			//random direction
			xspeed=xspeed-2*(xspeed)*(int)(Math.random()*2);
			yspeed=yspeed-2*(yspeed)*(int)(Math.random()*2);
		}
		if(System.currentTimeMillis()>=wait
				&&x>=Pong.player.x&&x<=Pong.player.x+18
				&&y>=Pong.player.y-1&&y<=Pong.player.y+120) {
			change=true;
		}
		
		if(System.currentTimeMillis()>=wait
				&&x>=Pong.cpu.x-20&&x<=Pong.cpu.x
				&&y>=Pong.cpu.y&&y<=Pong.cpu.y+120) {
			change=true;
		}
		if(change==true) {
			xspeed*=-1;
			change=false;
			wait=System.currentTimeMillis()+200;
		}
	}
	
	
}
