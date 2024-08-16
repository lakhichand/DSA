package DecisionStatments;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		
		double percent = s.nextDouble();
		
		if (percent>100) {
			System.out.println("invalid input !");
			
		}
		else if (percent == 35) {
			System.out.println("just pass");
		}
		else if (percent>35 && percent <60) {
			
			System.out.println("second class chill !");
		}
		else if (percent>=60 && percent<75) {
			
			System.out.println("first class .... give sweet");
			
		}
		else if (percent>=75 && percent<=100) {
			System.out.println("congrats ... pleaseon't spoil "
					+ "your neighbour !");
			
		}
		else
		{
			System.out.println("don't worry retry ... but don't do sucicide");
		}
	}
}
