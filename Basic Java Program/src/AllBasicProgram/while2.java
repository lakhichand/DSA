package AllBasicProgram;

import java.util.Scanner;

public class while2 {

	public static void mrain(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println(" Enter the strsting number");
		int start = s.nextInt();
		
		System.out.println("Enter the ending number");
		int end = s.nextInt();
		
		while (start<=end) {
			System.out.println(start);
			start++;
			
		}
	}
}
