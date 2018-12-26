import javax.swing.JPanel;

public class Paddle extends JPanel{
	
	double x, y, ymove;
	boolean cpu;
	
	public Paddle() {
		x=5;
		y=180;
		ymove=0;
	}
	
	//passing an integer through to make the computer paddle
	public Paddle(int a) {
		cpu= true;
		x=770;
		y=180;
		ymove=1.5;
	}
	
	public void move() {
		if(cpu==true) {
			
			//find the position the ball will be
			double time= (x-Pong.ball.x)/Pong.ball.xspeed;
			double futurey= Pong.ball.y;
			double speed= Pong.ball.yspeed;
			while(time>=0) {
				time--;
				if(futurey>=450||futurey<=0) {
					speed*=-1;
				}
				futurey+=speed;
			}
			futurey-=35;
			if(y<350&&futurey+3>y) {
				y+=ymove;
			}
			else if(y>0&&futurey-3<y) {
				y-=ymove;
			}
			else {
				y+=0;
			}
			
		}
		else {
			y+=ymove;
		
			if(y>=500-150||y<=0) {
				ymove=0;
			}
		}

	}
	
	public void moveDown() {
		if(y<350) {
			ymove=3;
		}
	}
	
	public void moveUp() {
		if(y>0) {
			ymove=-3;
		}
	}
	
	public void stop() {
		ymove=0;
	}
	
}
