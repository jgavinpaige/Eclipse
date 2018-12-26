import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class Paint extends JPanel{
	
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		if(Player.alive) {
			
			g2.setColor(Color.RED);
			g2.setStroke(new BasicStroke(3));
			ArrayList<Integer> remove= new ArrayList<Integer>();
			
			//draw the player shots
			for(int i=0; i<Player.shots.size(); i++) {
				g2.fillOval((int)Player.shots.get(i).x+12, (int)Player.shots.get(i).y+12, 7, 7);
				Player.shots.get(i).move();
				if(Player.shots.get(i).x<-30||Player.shots.get(i).x>1220
						||Player.shots.get(i).y<-20||Player.shots.get(i).y>700) {
					remove.add(i);
				}
			}
			
			//cleanup shots off of page
			for(int i : remove) {
				Player.shots.remove(i);
			}
			
			remove= new ArrayList<Integer>();
			
			//draw the bot shots
			g2.setColor(Color.black);
			for(int i=0; i<ShootingEnemy.shots.size(); i++) {
				g2.fillOval((int)ShootingEnemy.shots.get(i).x+12, (int)ShootingEnemy.shots.get(i).y+12, 7, 7);
				ShootingEnemy.shots.get(i).move();
				if(ShootingEnemy.shots.get(i).x<-30||ShootingEnemy.shots.get(i).x>1220
						||ShootingEnemy.shots.get(i).y<-20||ShootingEnemy.shots.get(i).y>700) {
					remove.add(i);
				}
			}
			
			//cleanup shots off of page
			for(int i : remove) {
				ShootingEnemy.shots.remove(i);
			}
			
			remove= new ArrayList<Integer>();
			
			//draw the turret shots
			g2.setColor(Color.red);
			for(int i=0; i<Turret.shots.size(); i++) {
				g2.fillOval((int)Turret.shots.get(i).x+12, (int)Turret.shots.get(i).y+12, 7, 7);
				Turret.shots.get(i).move();
				if(Turret.shots.get(i).x<-30||Turret.shots.get(i).x>1220
						||Turret.shots.get(i).y<-20||Turret.shots.get(i).y>700) {
					remove.add(i);
				}
			}
			
			//cleanup shots off of page
			for(int i : remove) {
				Turret.shots.remove(i);
			}
			
			remove= new ArrayList<Integer>();
			
			//draw turret
			if(Turret.alive) {
				g2.setColor(Color.black);
				int x[] = {(int)Turret.x,(int)Turret.x+10,(int)Turret.x+10,(int)Turret.x,
						(int)Turret.x-10, (int)Turret.x-10};
			    int y[] = {(int)Turret.y,(int)Turret.y+7,(int)Turret.y+14,(int)Turret.y+21,
			    		(int)Turret.y+14, (int)Turret.y+7};
			    int npoints = x.length;
				g2.fillPolygon(x,y, npoints);
				g2.setColor(Color.GRAY);
				g2.setStroke(new BasicStroke(9));
				g2.drawLine((int)Turret.x, (int)Turret.y+11, 
						(int)(Turret.x+Turret.gunX), (int)((Turret.y+Turret.gunY)+11));
				g2.fillOval((int)Turret.x-6, (int)Turret.y+4, 13, 13);
				
				//g2.fillOval((int)Turret.x, (int)Turret.y, 14, 14);
			}
			
			//draw player
			g2.setColor(Color.black);
			g2.fillOval((int)Player.x, (int)Player.y, 24, 24);		
		    g2.setStroke(new BasicStroke(9));
			g2.drawLine((int)Player.x+12, (int)Player.y+12, 
					(int)(Player.x+Player.gunX)+12, (int)(Player.y+Player.gunY)+12);
			
			//draw enemies
			for(int i=0; i<StrongEnemy.Strongenemies.size(); i++) {
				StrongEnemy enemy= StrongEnemy.Strongenemies.get(i);
				if(enemy.alive==true) {
					if(enemy.lives==2) {
						g2.setColor(Color.BLUE);
					}
					else {
						g2.setColor(new Color(0, 180, 255));
					}
					g2.fillRect((int)enemy.x, (int)enemy.y, 20, 20);
					enemy.move();
				}
				else {
					remove.add(i);
				}
			}
			
			for(int i : remove) {
				StrongEnemy.Strongenemies.remove(i);
			}
			remove= new ArrayList<Integer>();
			
			//draw enemies
			for(int i=0; i<ShootingEnemy.Shootingenemies.size(); i++) {
				ShootingEnemy enemy= ShootingEnemy.Shootingenemies.get(i);
				if(enemy.alive==true) {
					g2.setColor(Color.ORANGE);
					g2.fillRect((int)enemy.x, (int)enemy.y, 20, 20);
					enemy.move();
				}
				else {
					remove.add(i);
				}
			}
			
			for(int i : remove) {
				ShootingEnemy.Shootingenemies.remove(i);
			}
			
			//draw info panel on side of screen and player stats
			g2.setColor(new Color(220,220,220));
			g2.fillRect(1080, 0, 300, 800);
			g2.setColor(Color.black);
			g2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			g2.drawString("Player Lives: "+Player.lives, 1090, 25);
			g2.drawString("Gold: "+Player.gold, 1090, 50);
			
			//get underline
			Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
			fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			Font boldUnderline = new Font("TimesRoman",Font.BOLD, 18).deriveFont(fontAttributes);
			
			//options to buy
			g2.setFont(boldUnderline);
			g2.drawString("Shop", 1090, 80);
			
			g2.setFont(new Font("TimesRoman", Font.ITALIC, 15));
			g2.drawString("Turret (SPACE): ", 1090, 100); 
			g2.drawString("250 Gold", 1225, 100);
			g2.drawString("Extra Life (E): ", 1090, 120);
			g2.drawString("300 Gold", 1225, 120);
			
			g2.setFont(new Font("TimesRoman", Font.PLAIN, 13));
			g2.drawString("*To purchase an item, use the key in", 1080, 640);
			g2.drawString("  the parentheses next to the item name", 1083, 655);
			
			
		}
		else {
			g2.setFont(new Font("TimesRoman", Font.BOLD, 350));
			g2.drawString("Game", 120, 280);
			g2.drawString("Over", 200, 560);
		}
			
	}
	
}
