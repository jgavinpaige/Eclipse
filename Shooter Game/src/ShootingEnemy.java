import java.util.ArrayList;

public class ShootingEnemy {
	
	double x;
	double y;
	double xspeed= 0;
	double yspeed= 0;
	double gunX= 15;	
	double gunLength= gunX;
	double gunY= 0;
	double degrees= 0;
	static ArrayList<Shot> shots=new ArrayList<Shot>();
	public static ArrayList<ShootingEnemy> Shootingenemies= new ArrayList<ShootingEnemy>();
	long lastShot=0;
	boolean shoot= false;
	boolean alive= true;
	
	public ShootingEnemy() {
		
		//random y
		if((int)(Math.random()*2)==1) {
			y= Math.random()*650;
			if((int)(Math.random()*2)==1) {
				x=-20;
			}
			else {
				x= 1220;
			}
		}
		//random x
		else {
			x= Math.random()*1150;
			if((int)(Math.random()*2)==1) {
				y=-30;
			}
			else {
				y= 720;
			}
		}
		
		xspeed= .15*(Math.random()+1);
		yspeed= .15*(Math.random()+1);
		alive= true;
		
	}
	
	
	public static void addEnemy() {
		ShootingEnemy bot= new ShootingEnemy();
		Shootingenemies.add(bot);
	}
	
	
	public void shoot() {
		
		if(System.currentTimeMillis()>=lastShot) {
			lastShot=System.currentTimeMillis()+2200;
			Shot add= new Shot(this);
			shots.add(add);
		}

		
	}
	
	
	public void move() {
		
		if(Player.x+2>this.x) {
			x+=xspeed;
		}
		else {
			x-=xspeed;
		}
		if(Player.y+2>this.y) {
			y+=yspeed;
		}
		else {
			y-=yspeed;
		}
		
		//check for collision with player bullet
		for(int i=0; i<Player.shots.size(); i++) {
			Shot shot= Player.shots.get(i);
			if(shot.x>=this.x-15&&shot.x<=this.x+5&&
					shot.y>=this.y-15&&shot.y<=this.y+5) {
				Player.gold+=20;
				alive=false;
				Player.shots.remove(i);
			}
		}
		//check for collision with turret bullet
		for(int i=0; i<Turret.shots.size(); i++) {
			Shot shot= Turret.shots.get(i);
			if(shot.x>=this.x-15&&shot.x<=this.x+5&&
					shot.y>=this.y-15&&shot.y<=this.y+5) {
				Player.gold+=20;
				alive=false;
				Turret.shots.remove(i);
			}
		}
		
		shoot();
		
	}
	
}
