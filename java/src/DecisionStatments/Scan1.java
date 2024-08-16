package DecisionStatments;

import java.util.Scanner;

public class Scan1 {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number!");
		
		int num1 = s.nextInt();
		
		System.out.println("Enter the second number !");
		
		int num2 = s.nextInt();
		
		System.out.println("Enter the third number !");
		
		int num3 = s.nextInt();
		
		int largest = num1>(num2 > num3 ? num2 : num3)? num1 : (num2 > num3 ? num2 : num3);
		
		System.out.println("The largest of "+num1+","+ num2+" & "+num3+" is : "+ largest);
		
				
	}
}
