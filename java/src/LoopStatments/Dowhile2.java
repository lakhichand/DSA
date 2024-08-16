package LoopStatments;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int times = 5;
		int pin = 1234;
		
		do {
			System.out.println("Enter your pin");
			int pass = s.nextInt();
			
			if (pin == pass) {
				
				System.out.println("login successfully");
				break;
				
			}
			else
			{
				System.out.println("pin incorrect ...retry");
				break;
			}
			
		} 
		while (times<5);
		{
			if (times == 5) {
				System.out.println("try after 30sec");
			}
		}
	}
}
