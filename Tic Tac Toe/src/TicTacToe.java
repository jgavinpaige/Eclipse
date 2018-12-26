import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class TicTacToe {
	static TicTacSquares squares= new TicTacSquares();
	public static boolean win=false;
	public static boolean tie=false;
		
	public static void main(String[] args) {
		
		Scanner key= new Scanner(System.in);
		getWindow();
		int[][]board= new int[3][3];
		int x;
		int y;
		while(win==false) {
			
			if(win==false) {
				System.out.print("Row: ");
				x= key.nextInt();
				System.out.print("Column: ");
				y= key.nextInt();
				while((x<0||x>3)||(y<0||y>3)) {
					System.out.println("Please enter a valid input");
					System.out.print("Row: ");
					x= key.nextInt();
					System.out.print("Column: ");
					y= key.nextInt();					
				}
				board[x-1][y-1]= 1;	//taken
				squares.addPlayerColor(y, x);
				getWindow();
			}
			if(win==true) {
				System.out.println("You Won");
				long start = System.currentTimeMillis();
				long end = start + 3*1000; // 3 seconds * 1000 ms/sec
				while (end == end)
				{
					if(System.currentTimeMillis()>=end) {
						System.exit(0);
					}
				}
			}
			if(tie==true) {
				System.out.println("Tie");
				long start = System.currentTimeMillis();
				long end = start + 3*1000; // 3 seconds * 1000 ms/sec
				while (end == end)
				{
					if(System.currentTimeMillis()>=end) {
						System.exit(0);
					}
				}
			}
			long go = System.currentTimeMillis();
			long quit = go + 2*1000; // 2 seconds * 1000 ms/sec
			while (quit == quit){
				if(System.currentTimeMillis()>=quit) {
					break;
				}
			}
			//after 2 send break
			boolean valid=false;
			x=0;y=0;	//ignore... squares.addComputerColor needed x and y defined
			//check for computer win
			if(board[0][0]==2&&board[0][1]==2&&board[0][2]==0) {
				x=1;
				y=3;
			}
			else if(board[0][1]==2&&board[0][2]==2&&board[0][0]==0) {
				x=1;
				y=1;
			}
			else if(board[0][0]==2&&board[0][2]==2&&board[0][1]==0) {
				x=1;
				y=2;
			}
			else if(board[1][0]==2&&board[1][1]==2&&board[1][2]==0) {
				x=2;
				y=3;
			}
			else if(board[1][2]==2&&board[1][1]==2&&board[1][0]==0) {
				x=2;
				y=1;
			}
			else if(board[1][1]==2&&board[1][2]==2&&board[1][0]==0) {
				x=2;
				y=1;
			}
			else if(board[2][0]==2&&board[2][1]==2&&board[2][2]==0) {
				x=3;
				y=3;
			}
			else if(board[2][1]==2&&board[2][2]==2&&board[2][0]==0) {
				x=3;
				y=1;
			}
			else if(board[2][0]==2&&board[2][2]==2&&board[2][1]==0) {
				x=3;
				y=2;
			}
			else if(board[0][0]==2&&board[1][0]==2&&board[2][0]==0) {
				x=3;
				y=1;
			}
			else if(board[1][0]==2&&board[2][0]==2&&board[0][0]==0) {
				x=1;
				y=1;
			}
			else if(board[0][0]==2&&board[2][0]==2&&board[1][0]==0) {
				x=2;
				y=1;
			}
			else if(board[0][1]==2&&board[1][1]==2&&board[2][1]==0) {
				x=3;
				y=2;
			}
			else if(board[1][1]==2&&board[2][1]==2&&board[0][1]==0) {
				x=1;
				y=2;
			}
			else if(board[0][1]==2&&board[2][1]==2&&board[1][1]==0) {
				x=2;
				y=2;
			}
			else if(board[0][2]==2&&board[1][2]==2&&board[2][2]==0) {
				x=3;
				y=3;
			}
			else if(board[1][2]==2&&board[2][2]==2&&board[0][2]==0) {
				x=1;
				y=3;
			}
			else if(board[0][2]==2&&board[2][2]==2&&board[1][2]==0) {
				x=2;
				y=3;
			}
			else if(board[2][0]==2&&board[1][1]==2&&board[0][2]==0) {
				x=1;
				y=3;
			}
			else if(board[1][1]==2&&board[0][2]==2&&board[2][0]==0) {
				x=3;
				y=1;
			}
			else if(board[0][2]==2&&board[2][0]==2&&board[1][1]==0) {
				x=2;
				y=2;
			}
			else if(board[0][0]==2&&board[1][1]==2&&board[2][2]==0) {
				x=3;
				y=3;
			}
			else if(board[1][1]==2&&board[2][2]==2&&board[0][0]==0) {
				x=1;
				y=1;
			}
			else if(board[2][2]==2&&board[0][0]==2&&board[1][1]==0) {
				x=2;
				y=2;
			}
			//check for user win
			else if(board[0][0]==1&&board[0][1]==1&&board[0][2]==0) {
				x=1;
				y=3;
				board[0][2]=2;
			}
			else if(board[0][1]==1&&board[0][2]==1&&board[0][0]==0) {
				x=1;
				y=1;
				board[0][0]=2;
			}
			else if(board[0][0]==1&&board[0][2]==1&&board[0][1]==0) {
				x=1;
				y=2;
				board[0][1]=2;
			}
			else if(board[1][0]==1&&board[1][1]==1&&board[1][2]==0) {
				x=2;
				y=3;
				board[1][2]=2;
			}
			else if(board[1][1]==1&&board[1][2]==1&&board[1][0]==0) {
				x=2;
				y=1;
				board[1][0]=2;
			}
			else if(board[1][1]==1&&board[1][2]==1&&board[1][0]==0) {
				x=2;
				y=1;
				board[1][0]=2;
			}
			else if(board[2][0]==1&&board[2][1]==1&&board[2][2]==0) {
				x=3;
				y=3;
				board[2][2]=2;
			}
			else if(board[2][1]==1&&board[2][2]==1&&board[2][0]==0) {
				x=3;
				y=1;
				board[2][0]=2;
			}
			else if(board[2][0]==1&&board[2][2]==1&&board[2][1]==0) {
				x=3;
				y=2;
				board[2][1]=2;
			}
			else if(board[0][0]==1&&board[1][0]==1&&board[2][0]==0) {
				x=3;
				y=1;
				board[2][0]=2;
			}
			else if(board[1][0]==1&&board[2][0]==1&&board[0][0]==0) {
				x=1;
				y=1;
				board[0][0]=2;
			}
			else if(board[2][0]==1&&board[0][0]==1&&board[1][0]==0) {
				x=2;
				y=1;
				board[1][0]=2;
			}
			else if(board[0][1]==1&&board[1][1]==1&&board[2][1]==0) {
				x=3;
				y=2;
				board[2][1]=2;
			}
			else if(board[1][1]==1&&board[2][1]==1&&board[0][1]==0) {
				x=1;
				y=2;
				board[0][1]=2;
			}
			else if(board[0][1]==1&&board[2][1]==1&&board[1][1]==0) {
				x=2;
				y=2;
				board[1][1]=2;
			}
			else if(board[0][2]==1&&board[1][2]==1&&board[2][2]==0) {
				x=3;
				y=3;
				board[2][2]=2;
			}
			else if(board[1][2]==1&&board[2][2]==1&&board[0][2]==0) {
				x=1;
				y=3;
				board[0][2]=2;
			}
			else if(board[0][2]==1&&board[2][2]==1&&board[1][2]==0) {
				x=2;
				y=3;
				board[1][2]=2;
			}
			else if(board[2][0]==1&&board[1][1]==1&&board[0][2]==0) {
				x=1;
				y=3;
				board[0][2]=2;
			}
			else if(board[1][1]==1&&board[0][2]==1&&board[2][0]==0) {
				x=3;
				y=1;
				board[2][0]=2;
			}
			else if(board[0][2]==1&&board[2][0]==1&&board[1][1]==0) {
				x=2;
				y=2;
				board[1][1]=2;
			}
			else if(board[0][0]==1&&board[1][1]==1&&board[2][2]==0) {
				x=3;
				y=3;
				board[2][2]=2;
			}
			else if(board[1][1]==1&&board[2][2]==1&&board[0][0]==0) {
				x=1;
				y=1;
				board[0][0]=2;
			}
			else if(board[2][2]==1&&board[0][0]==1&&board[1][1]==0) {
				x=2;
				y=2;
				board[1][1]=2;
			}
			//user chose middle
			else if(board[1][1]==1&&(board[0][2]==0||board[2][2]==0||board[2][0]==0||board[0][0]==0)) {
				if(board[0][2]==0) {x=1;y=3;}
				else if(board[2][2]==0) {x=3;y=3;}
				else if(board[2][0]==0) {x=3;y=1;}
				else {x=1;y=1;}
				board[x-1][y-1]=2;			
			}
			//user didn't chose middle
			else if(board[1][1]==0) {
				board[1][1]=2;
				x=2;
				y=2;
			}
			//special cases
			else {
				while(valid==false) {
					x= (int)(3*Math.random()+1);
					y= (int)(3*Math.random()+1);
					if(board[x-1][y-1]== 0) {
						board[x-1][y-1]=2;
						valid=true;
					}
				}
			}
			squares.addComputerColor(y, x);
			getWindow();
			if(win==true) {
				System.out.println("Computer Won");
				long start = System.currentTimeMillis();
				long end = start + 3*1000; // 3 seconds * 1000 ms/sec
				while (end == end)
				{
					if(System.currentTimeMillis()>=end) {
						System.exit(0);
					}
				}
			}
			if(tie==true) {
				System.out.println("Tie");
				long start = System.currentTimeMillis();
				long end = start + 3*1000; // 3 seconds * 1000 ms/sec
				while (end == end)
				{
					if(System.currentTimeMillis()>=end) {
						System.exit(0);
					}
				}
			}
			
		}
	
		
	}
	
	public static void getWindow() {
		JFrame window= new JFrame();
		window.setPreferredSize(new Dimension(530,600));
		window.setTitle("Tic Tac Toe Game");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.pack();
		window.setResizable(false);
		window.setVisible(true);
		window.getContentPane().setBackground(Color.lightGray);
		window.setAlwaysOnTop(true);
		
		

		window.add(squares);
		
		
		
	}
	

}