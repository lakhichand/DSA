package DecisionStatments;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter your shopping money");
		
		int money = s.nextInt();
		
		if (money>=1555 && money <3555) {
			
			System.out.println("your eligible for 10%");
			
		}
		else if (money>=3555 && money<5555) {
			
			System.out.println("your eligible for 20%");
			
		}
		else if (money>=5555 && money<10555) {
			System.out.println("your eligible for 35%");
		}
		else if (money>=20555) {
			
			System.out.println("your eligible for 50% as well as in lucky draw of 50,000");
		}
		else if (money<1555) {
			
			System.out.println("your not eligible for offers");
		}
	}
	
}
