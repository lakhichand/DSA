package AllBasicProgram;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		Scanner s  = new Scanner (System.in);
		
		System.out.println("Enter the percentage that you you have earn");
		double percentage = s.nextDouble();
		
		if (percentage>60) {
			System.out.println("your eligible for gate?");
			System.out.println("duniya main aaya hai to amje kar");
			
		}
		else {
			System.out.println("chal bhikari ghar niakal");
			System.out.println("End of era");
		}
	
	}
}
