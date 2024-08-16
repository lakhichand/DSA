package AllBasicProgram;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int passowrd = 1234;
		int times = 0;
		
		do {
			System.out.println("Enter the password");
			
			int pass = s.nextInt();
			
			if (passowrd == pass) {
				
				System.out.println("login succesfully");
				break;
			}
			else
			{
				System.out.println("retry again");
				break;
			}
			
		} while (times<=5);
		if (times == 5) {
			System.out.println("try after 30 minutes");
		}
	}
}
