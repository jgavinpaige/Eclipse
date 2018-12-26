import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.ArrayList;

public class Turret {
	
	public static double x= Player.x, y=Player.y;
	public static ArrayList<Shot>shots= new ArrayList<Shot>();
	public static boolean alive= false;
	private static long lastShot=0;
	public static long timecreated=0;
	public static double gunX= 10;	
	public static double gunLength= gunX;
	public static double gunY= 0;
	public static double bulletSpeed= 1;
	public static int reloadSpeed= 0;
	
	public static void upgradeReload() {
		if(Player.gold>=80) {
			Player.gold-=80;
			reloadSpeed+=100;
		}
	}
	
	public static void upgradeBulletSpeed() {
		if(Player.gold>=40) {
			Player.gold-=40;
			bulletSpeed+=.125;
		}
	}
	
	public static void shoot() {
		
		if(alive) {
			aim();
			if(System.currentTimeMillis()>=lastShot) {
				lastShot=System.currentTimeMillis()+1800-reloadSpeed;
				Shot add= new Shot(new Turret());
				add.x-=10;
				shots.add(add);
			}
		}
		
	}
	
	public static void update() {
		
		if(Player.gold>=250) {
			timecreated= System.currentTimeMillis();
			alive=true;
			x= Player.x-1; 
			y=Player.y-1;
			Player.gold-=250;
		}
		
	}
	
	public static void aim() {
		
		double closest= 5000;	
		StrongEnemy strong= new StrongEnemy();		
		ShootingEnemy shooter= new ShootingEnemy();
		boolean Strong= true;
		
		for(StrongEnemy enemy : StrongEnemy.Strongenemies) {
			if(Math.sqrt((enemy.x-x)*(enemy.x-x)+(enemy.y-y)*(enemy.y-y))<closest) {
				closest= Math.sqrt((enemy.x-x)*(enemy.x-x)+(enemy.y-y)*(enemy.y-y));
				strong= enemy;
			}
		}
		for(ShootingEnemy enemy : ShootingEnemy.Shootingenemies) {
			if(Math.sqrt((enemy.x-x)*(enemy.x-x)+(enemy.y-y)*(enemy.y-y))<closest) {
				closest= Math.sqrt((enemy.x-x)*(enemy.x-x)+(enemy.y-y)*(enemy.y-y));
				shooter= enemy;
				Strong=false;
			}
		}
		
		double targetX= 0;
		double targetY= 0;
		
		if(ShootingEnemy.Shootingenemies.size()>=1||StrongEnemy.Strongenemies.size()>=1) {
			if(Strong) {
				targetX= strong.x+10;
				targetY= strong.y;
			}
			else {
				targetX= shooter.x+10;
				targetY= shooter.y;
			}
		}
		double hyp= Math.sqrt((targetX-x)*(targetX-x)+(targetY-y)*(targetY-y));
		gunX= gunLength*((targetX-x)/hyp);
		gunY= gunLength*((targetY-y)/hyp);
		
	}
	
}
