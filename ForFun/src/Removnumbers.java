import java.util.Scanner;

public class Removnumbers {

	public static void main(String[]args) {
		Scanner key= new Scanner(System.in);
		String input= key.nextLine();
		int num=1;
		int start=0;
		for(int i=0; i<input.length()-2; i++) {
			String look="";
			if(num<10)look+= (num);
			else if(num<100)look+= (num);
			else look+= num;
			if(input.substring(i,  i+look.length()).equals(look)) {
				num++;
				System.out.println(input.substring(start, i));
				start= i+look.length();
				
				
			}
			
		}
		
		
	}
	
}
