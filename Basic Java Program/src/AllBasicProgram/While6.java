package AllBasicProgram;

import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		
		int start = s.nextInt();
		
		System.out.println("enter the ending number");
		
		int end = s.nextInt();
		
		while (start>=end) {
			System.out.println(start);
			start--;
		}
	}
}
