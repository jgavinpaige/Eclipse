import java.util.Scanner;
public class Prgrm1pt1 {

	public static void main(String[] args) {
		// be prepared is 18.95 next best is 21.95
		//both for 37.95
		//3+ copies = 15.95 each
		//12+ copies = 14 each
		Scanner nbnum=new Scanner(System.in);
		Scanner bpnum=new Scanner(System.in);

		System.out.println("How many Be Prepared books do you have?");
		double bp= bpnum.nextInt();
		System.out.println("How many Next Best books do you have?");
		double nb= nbnum.nextInt();
		double cost;
		
		if(nb>=0&&bp>=0) {
			if(nb==1&&bp==0) {
				cost=21.95;
				System.out.println("The cost is $"+cost);
			}
			if(bp==1&&nb==0) {
				cost=18.95;
				System.out.println("The cost is $"+cost);
			}
			if(bp==1&&nb==1) {
				cost=37.95;
				System.out.println("The cost is $"+cost);
			}
			if(nb+bp>=3&&nb+bp<12) {
				cost=15.95*(nb+bp);
				System.out.println("The cost is $"+cost);
			}
			if(nb+bp>=12) {
				cost=14*(nb+bp);
				System.out.println("The cost is $"+cost);
			}
			if(nb==0&&bp==0){
				System.out.println("The cost is $0"); //nothing is purchased
			}
		}
		else {
			System.out.println("Error");
		}

	}
}
