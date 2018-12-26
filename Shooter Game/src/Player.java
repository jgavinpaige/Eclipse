import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;

public class Player {
	
	public static int gold= 1000;
	public static int lives =1;
	//10 gold from killing strong and 20 from killing shooting
	
	public static double x= 600;
	public static double y= 280;
	public static double xspeed= 0;
	public static double yspeed= 0;
	public static double gunX= 15;	
	public static double gunLength= gunX;
	public static double gunY= 0;
	public static double degrees= 0;
	public static double circleClockwise= 0;
	public static double circleCounterclockwise= 0;
	public static ArrayList<Shot> shots=new ArrayList<Shot>();
	private static long lastShot=0;
	public static boolean shoot= false;
	public static boolean alive= true;
	
	public static void addLife() {
		if(gold>=300) {
			lives++;
			gold-=300;
		}
	}
	
	public static void circle() {
		PointerInfo a= MouseInfo.getPointerInfo();
		Point b= a.getLocation();
		double mouseX= b.getX()-50;
		double mouseY= b.getY()-50;
		double hyp= Math.sqrt((mouseX-x)*(mouseX-x)+(mouseY-y)*(mouseY-y));
		gunX= gunLength*((mouseX-x)/hyp);
		gunY= gunLength*((mouseY-y)/hyp);
		
	}
	
	public static void circleCounterclockwise() {
		
		degrees-=circleCounterclockwise;
		gunX= gunLength*Math.cos((degrees/180)*Math.PI);
		gunY= gunLength*Math.sin((degrees/180)*Math.PI);
		
	}
	
	public static void shoot() {
		
		if(shoot==true&&System.currentTimeMillis()>=lastShot) {
			lastShot=System.currentTimeMillis()+400;
			Shot add= new Shot();
			shots.add(add);
		}

		
	}
	
	public static void startShooting() {
		shoot=true;
	}
	
	public static void stopShooting() {
		shoot= false;
	}
	
	public static void move() {
		
		if((yspeed<0&&y<0)||(yspeed>0&&y>646)){
			yspeed=0;
		}
		if((xspeed<0&&x<0)||(xspeed>0&&x>1055)){
			xspeed=0;
		}
		y+=yspeed;
		x+=xspeed;

		circle();
		shoot();
		
		for(StrongEnemy bot : StrongEnemy.Strongenemies) {
			if(bot.alive==true&&x>=bot.x-24&&x<=bot.x+20&&
					y>=bot.y-22&&y<=bot.y+20) {
				if(lives==1) {
					alive=false;
				}
				else{
					lives--;
					bot.alive=false;
				}
			}
		}
		for(ShootingEnemy bot : ShootingEnemy.Shootingenemies) {
			if(bot.alive==true&&x>=bot.x-24&&x<=bot.x+20&&
					y>=bot.y-22&&y<=bot.y+20) {
				alive=false;
			}
			else {
				for(Shot shot : ShootingEnemy.shots) {
					if(shot.x>=x-15&&shot.x<=x+5&&
							shot.y>=y-15&&shot.y<=y+5) {
						alive=false;
					}
				}
			}
		}
		
	}
	
	public static void moveUp() {
		
		if(y>0) {
			yspeed=-1.8;
		}
		
	}
	
	public static void moveDown() {
		
		yspeed=1.8;
		
	}
	
	public static void moveLeft() {
		
		xspeed=-1.8;
		
	}
	
	public static void moveRight() {
		
		xspeed=1.8;
		
	}

	public static void stopLR() {
		
		xspeed=0;
		
	}

	public static void stopUD() {
		
		yspeed=0;
		
	}

	
}
