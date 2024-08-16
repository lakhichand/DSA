package DecisionStatments;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number !");
		
		int num = s.nextInt();
		
		if (num>0) {
			
			System.out.println("it is natural number");
			
		}
		else
		{
			System.out.println("it is not natural number");
		}
		
	}
}
