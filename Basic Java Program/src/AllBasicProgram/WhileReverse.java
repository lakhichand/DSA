package AllBasicProgram;

import java.util.Scanner;

public class WhileReverse {

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number that you want to reverseed");
		
		int num = s.nextInt();
		
		int revers = 0;
		
		while (num>0) {
			int rem = num%10;
			revers = revers*10+rem;
			num = num/10;
		
		}
		System.out.println(revers);
	}
}
