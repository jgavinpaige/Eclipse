import java.util.Scanner;
public class TicketyTac {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		int[][]board= new int[3][3];
		int x=2;
		while(x==2) {
			System.out.println("-------------");
			for(int r=0; r<3; r++) {
				System.out.print("|");
				for(int c=0; c<3; c++) {
					if(board[r][c]==1) {
						System.out.print(" "+"X"+" |");
					}
					else if(board[r][c]==2) {
						System.out.print(" "+"O"+" |");
					}
					else {
						System.out.print(" "+" "+" |");
					}	
				}
				System.out.println();
				System.out.println("-------------");
			}
			System.out.print("Row = ");
			int row= key.nextInt();
			System.out.print("Column = ");
			int col= key.nextInt();
			while(board[row-1][col-1]!=0) {
				System.out.println("That space is taken");
				System.out.print("Row = ");
				row= key.nextInt();
				System.out.print("Column = ");
				col= key.nextInt();
			}
			board[row-1][col-1]=1;
			if(win(board)==true) {
				System.out.println("User won");
				System.exit(0);
			}
			row=(int)(Math.random()*3);
			col=(int)(Math.random()*3);
			long tie= System.currentTimeMillis()+1000;
			while(board[row][col]!=0) {
				row=(int)(Math.random()*3);
				col=(int)(Math.random()*3);
				if(System.currentTimeMillis()>=tie) {
					System.out.println("Game Tied");
					System.exit(0);
				}
				
			}
			board[row][col]=2;
			if(win(board)==true) {
				System.out.println("Computer won");
				System.exit(0);
			}
		}

	}

	public static boolean win(int[][]a) {
		if((a[0][0]!=0&&a[0][0]==a[0][1]&&a[0][1]==a[0][2])
			||(a[1][0]!=0&&a[1][0]==a[1][1]&&a[1][1]==a[1][2])
			||(a[2][0]!=0&&a[2][0]==a[2][1]&&a[2][1]==a[2][2])
			||(a[0][0]!=0&&a[0][0]==a[1][0]&&a[1][0]==a[2][0])
			||(a[0][1]!=0&&a[0][1]==a[1][1]&&a[1][1]==a[2][1])
			||(a[0][2]!=0&&a[0][2]==a[1][2]&&a[1][2]==a[2][2])
			||(a[0][0]!=0&&a[0][0]==a[1][1]&&a[1][1]==a[2][2])
			||(a[2][0]!=0&&a[2][0]==a[1][1]&&a[1][1]==a[0][2]))
		{
			return true;
		}
		return false;
	}
}
