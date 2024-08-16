package AllBasicProgram;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the first number!");
		
		int num1 = s.nextInt();
		
		System.out.println("Enter the Scond number !");
		
		int num2 = s.nextInt();
		
		System.out.println("Enter the Third number !");
		
		int num3 = s.nextInt();
		
		int result = num1 > (num2>num3?num2:num3)?num1:(num2>num3?num2:num3);
		
		System.out.println("The largest value of "+num1+","+num2+" and "+num3+" is :-"
				+ " "+result);
		
	}
}
