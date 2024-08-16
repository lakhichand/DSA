package AllBasicProgram;

import java.util.Scanner;

public class IfElseIfLadder1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Entre  the percentage");
		double percentage  = s.nextDouble();
		
		if (percentage>35&&percentage<50) {
			System.out.println("your just pass");
		}
		else if (percentage>=50&& percentage<65) {
			System.out.println("congrats  your optaninig third class");
		}
		else if (percentage>=65 && percentage<75) {
			System.out.println("congrts your achieving Second class");
		}
		else if (percentage>=75 && percentage<=100) {
			System.out.println("congrats its destination with first class");
		}
		else if (percentage>100) {
			System.out.println("inbvalid entry");
		}
	}
}
