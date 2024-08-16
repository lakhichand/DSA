package AllBasicProgram;

import java.util.Scanner;

public class ForRevers {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int rev = 0;
		
		for (int i = num;i>0;i/=10) {
			int rem = i%10;
			
			rev = rev*10+rem;
			
		}
		System.out.println(rev);
	}
}
