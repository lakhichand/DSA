package DecisionStatments;

import java.util.Scanner;

public class AtmIfElseLadder4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("how much you want withdraw");
		
		int money = s.nextInt();
		
		if (money<=500) {
			
			System.out.println("for withdraw press 1");
			
		}
		else if (money<=1000) {
			System.out.println("for withdraw press 2");
		}
		else if (money<=10000) {
			System.out.println("for withdraw presss 3");
			
		}
		else if (money>100000) {
			System.out.println("sorry the Atm is temorrory out of service");
		}
		
	}

}
