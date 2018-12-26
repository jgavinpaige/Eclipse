import java.util.ArrayList;

public class StrongEnemy {
	
	public static ArrayList<StrongEnemy> Strongenemies= new ArrayList<StrongEnemy>();
	double x,y,xspeed,yspeed;
	boolean alive;
	int lives= 2;
	
	public StrongEnemy() {
		
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
				y=-20;
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
		StrongEnemy bot= new StrongEnemy();
		Strongenemies.add(bot);
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
		
		for(int i=0; i<Player.shots.size(); i++) {
			Shot shot= Player.shots.get(i);
			if(shot.x>=this.x-15&&shot.x<=this.x+5&&
					shot.y>=this.y-15&&shot.y<=this.y+5) {
				lives--;
				if(lives==0) {
					Player.gold+=10;
					alive=false;
				}
				Player.shots.remove(i);
			}
		}
		for(int i=0; i<Turret.shots.size(); i++) {
			Shot shot= Turret.shots.get(i);
			if(shot.x>=this.x-15&&shot.x<=this.x+5&&
					shot.y>=this.y-15&&shot.y<=this.y+5) {
				lives--;
				if(lives==0) {
					Player.gold+=10;
					alive=false;
				}
				Turret.shots.remove(i);
			}
		}
		
	}
	
}
