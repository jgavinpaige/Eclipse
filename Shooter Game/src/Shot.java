
public class Shot {
	
	double x,y,xspeed,yspeed;
	public boolean bot= false;
	
	public Shot() {
		
		x= Player.x+Player.gunX-3.5;
		y= Player.y+Player.gunY-3.5;
		xspeed= (Player.gunX)/10;
		yspeed= (Player.gunY)/10;
		
	}
	
	public Shot(ShootingEnemy bot) {
		
		x= bot.x-5;
		y= bot.y-5;
		
		double xdir= -(bot.y-Player.y)/100;
		double ydir= -(bot.x-Player.x)/100;
		double hypo= Math.sqrt(xdir*xdir+ydir*ydir);
		
		yspeed= 1.2*(xdir/hypo);
		xspeed= 1.2*(ydir/hypo);
		
	}
	
	public Shot(Turret z) {
		
		x= Turret.x+Turret.gunX-3.5;
		y= Turret.y+Turret.gunY-3.5;
		xspeed= Turret.bulletSpeed*((Turret.gunX)/10);
		yspeed= Turret.bulletSpeed*((Turret.gunY)/10);
		
	}
	
	public void move() {
		
		x+=xspeed;
		y+=yspeed;
		
	}
	
}
