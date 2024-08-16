package DecisionStatments;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the percentage");
		
		double percent = s.nextDouble();
		
		if (percent >= 60) {
			
			System.out.println("you are eligible for interview");
			
		}
		else
		{
			System.out.println("you are not eligible for interview");
		}
	}
}
