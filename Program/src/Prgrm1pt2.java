import java.util.Scanner;
public class Prgrm1pt2 {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		Scanner ending= new Scanner(System.in);
		
		System.out.println("Enter any integer or enter 'end' at any time to stop");
		String given= key.nextLine();
		int sum=0;
		boolean isnumber;
		
	
		while(!given.equals("end")) {
			isnumber= true;
			for(int a=0; a<given.length(); a++) {
				char check= given.charAt(a);
				isnumber= Character.isDigit(check);
				if(isnumber==false) {
					break;
				}
			}
			if(isnumber==true) {
				int input= Integer.valueOf(given);
				sum=0;
				for(int count=1; count<input; count++) {
					if(input%count==0) {
						sum=sum+count;
					}
				}
				
				if(input==sum) {
					System.out.println("Your number is perfect!");
				}
				if(input>sum) {
					System.out.println("Your number is deficient!");
		
				}
				if(input<sum) {
					System.out.println("Your number is abundant!");
		
				}
			}
			given= key.nextLine();
		}
	}
}
