import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

import javax.swing.JComponent;

public class TicTacSquares extends JComponent {
	
	boolean rect1Playercolor=false;		boolean rect1Computercolor=false;
	boolean rect2Playercolor=false;		boolean rect2Computercolor=false;
	boolean rect3Playercolor=false;		boolean rect3Computercolor=false;
	boolean rect4Playercolor=false;		boolean rect4Computercolor=false;
	boolean rect5Playercolor=false;		boolean rect5Computercolor=false;
	boolean rect6Playercolor=false;		boolean rect6Computercolor=false;
	boolean rect7Playercolor=false;		boolean rect7Computercolor=false;
	boolean rect8Playercolor=false;		boolean rect8Computercolor=false;
	boolean rect9Playercolor=false;		boolean rect9Computercolor=false;
	
	boolean filled1= false;
	boolean filled2= false;
	boolean filled3= false;
	boolean filled4= false;
	boolean filled5= false;
	boolean filled6= false;
	boolean filled7= false;
	boolean filled8= false;
	boolean filled9= false;
	
	
	public void paintComponent(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		g2.setStroke(new java.awt.BasicStroke(10));
		g2.setColor(Color.black);
		
		Rectangle rect1= new Rectangle(30,10,150,150);
		if(rect1Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect1.getX(), (int)rect1.getY(),(int)rect1.getWidth(),(int)rect1.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect1Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect1.getX(), (int)rect1.getY(),(int)rect1.getWidth(),(int)rect1.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect2= new Rectangle(30,160,150,150);
		if(rect2Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect2.getX(), (int)rect2.getY(),(int)rect2.getWidth(),(int)rect2.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect2Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect2.getX(), (int)rect2.getY(),(int)rect2.getWidth(),(int)rect2.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect3= new Rectangle(30,310,150,150);
		if(rect3Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect3.getX(), (int)rect3.getY(),(int)rect3.getWidth(),(int)rect3.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect3Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect3.getX(), (int)rect3.getY(),(int)rect3.getWidth(),(int)rect3.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect4= new Rectangle(180,10,150,150);
		if(rect4Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect4.getX(), (int)rect4.getY(),(int)rect4.getWidth(),(int)rect4.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect4Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect4.getX(), (int)rect4.getY(),(int)rect4.getWidth(),(int)rect4.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect5= new Rectangle(180,160,150,150);
		if(rect5Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect5.getX(), (int)rect5.getY(),(int)rect5.getWidth(),(int)rect5.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect5Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect5.getX(), (int)rect5.getY(),(int)rect5.getWidth(),(int)rect5.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect6= new Rectangle(180,310,150,150);
		if(rect6Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect6.getX(), (int)rect6.getY(),(int)rect6.getWidth(),(int)rect6.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect6Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect6.getX(), (int)rect6.getY(),(int)rect6.getWidth(),(int)rect6.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect7= new Rectangle(330,10,150,150);
		if(rect7Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect7.getX(), (int)rect7.getY(),(int)rect7.getWidth(),(int)rect7.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect7Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect7.getX(), (int)rect7.getY(),(int)rect7.getWidth(),(int)rect7.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect8= new Rectangle(330,160,150,150);
		if(rect8Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect8.getX(), (int)rect8.getY(),(int)rect8.getWidth(),(int)rect8.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect8Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect8.getX(), (int)rect8.getY(),(int)rect8.getWidth(),(int)rect8.getHeight());  
			g2.setColor(Color.black);
		}
		
		Rectangle rect9= new Rectangle(330,310,150,150);
		if(rect9Playercolor==true) {
			g2.setColor(Color.red);
			g2.fillRect((int)rect9.getX(), (int)rect9.getY(),(int)rect9.getWidth(),(int)rect9.getHeight());  
			g2.setColor(Color.black);
		}
		else if(rect9Computercolor==true) {
			g2.setColor(Color.blue);
			g2.fillRect((int)rect9.getX(), (int)rect9.getY(),(int)rect9.getWidth(),(int)rect9.getHeight());  
			g2.setColor(Color.black);
		}
		
		g2.draw(rect1);
		g2.draw(rect2);
		g2.draw(rect3);
		g2.draw(rect4);
		g2.draw(rect5);
		g2.draw(rect6);
		g2.draw(rect7);
		g2.draw(rect8);
		g2.draw(rect9);
		
		g2.drawString("1", 10, 85);
		g2.drawString("2", 10, 235);
		g2.drawString("3", 10, 385);
		g2.drawString("1", 100, 485);
		g2.drawString("2", 250, 485);
		g2.drawString("3", 400, 485);
		
	}
	public void addPlayerColor(int y, int x) {
		if(filled1==false&&y==1&&x==1) {
			rect1Playercolor=true;
			filled1=true;
		}
		else if(filled2==false&&y==1&&x==2) {
			rect2Playercolor=true;
			filled2=true;
		}
		else if(filled3==false&&y==1&&x==3) {
			rect3Playercolor=true;
			filled3=true;
		}
		else if(filled4==false&&y==2&&x==1) {
			rect4Playercolor=true;
			filled4=true;
		}
		else if(filled5==false&&y==2&&x==2) {
			rect5Playercolor=true;
			filled5=true;
		}
		else if(filled6==false&&y==2&&x==3) {
			rect6Playercolor=true;
			filled6=true;
		}
		else if(filled7==false&&y==3&&x==1) {
			rect7Playercolor=true;
			filled7=true;
		}
		else if(filled8==false&&y==3&&x==2) {
			rect8Playercolor=true;
			filled8=true;
		}
		else if(filled9==false&&y==3&&x==3) {
			rect9Playercolor=true;
			filled9=true;
		}
		
		if(rect9Playercolor==true&&rect6Playercolor==true&&rect3Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect8Playercolor==true&&rect5Playercolor==true&&rect2Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect7Playercolor==true&&rect4Playercolor==true&&rect1Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect1Playercolor==true&&rect2Playercolor==true&&rect3Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect4Playercolor==true&&rect5Playercolor==true&&rect6Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect7Playercolor==true&&rect8Playercolor==true&&rect9Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect1Playercolor==true&&rect5Playercolor==true&&rect9Playercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect3Playercolor==true&&rect5Playercolor==true&&rect7Playercolor==true) {
			TicTacToe.win=true;
		}
		if(filled1==true&&filled2==true&&filled3==true&&filled4==true&&filled5==true
				&&filled6==true&&filled7==true&&filled8==true&&filled9==true) {
			TicTacToe.tie=true;
		}
		
		}
	
	public void addComputerColor(int y, int x) {
		if(filled1==false&&y==1&&x==1) {
			rect1Computercolor=true;
			filled1=true;
		}
		else if(filled2==false&&y==1&&x==2) {
			rect2Computercolor=true;
			filled2=true;
		}
		else if(filled3==false&&y==1&&x==3) {
			rect3Computercolor=true;
			filled3=true;
		}
		else if(filled4==false&&y==2&&x==1) {
			rect4Computercolor=true;
			filled4=true;
		}
		else if(filled5==false&&y==2&&x==2) {
			rect5Computercolor=true;
			filled5=true;
		}
		else if(filled6==false&&y==2&&x==3) {
			rect6Computercolor=true;
			filled6=true;
		}
		else if(filled7==false&&y==3&&x==1) {
			rect7Computercolor=true;
			filled7=true;
		}
		else if(filled8==false&&y==3&&x==2) {
			rect8Computercolor=true;
			filled8=true;
		}
		else if(filled9==false&&y==3&&x==3) {
			rect9Computercolor=true;
			filled9=true;
		}
		
		if(rect9Computercolor==true&&rect6Computercolor==true&&rect3Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect8Computercolor==true&&rect5Computercolor==true&&rect2Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect7Computercolor==true&&rect4Computercolor==true&&rect1Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect1Computercolor==true&&rect2Computercolor==true&&rect3Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect4Computercolor==true&&rect5Computercolor==true&&rect6Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect7Computercolor==true&&rect8Computercolor==true&&rect9Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect1Computercolor==true&&rect5Computercolor==true&&rect9Computercolor==true) {
			TicTacToe.win=true;
		}
		else if(rect3Computercolor==true&&rect5Computercolor==true&&rect7Computercolor==true) {
			TicTacToe.win=true;
		}
		if(filled1==true&&filled2==true&&filled3==true&&filled4==true&&filled5==true
				&&filled6==true&&filled7==true&&filled8==true&&filled9==true) {
			TicTacToe.tie=true;
		}
		
		}
	}

