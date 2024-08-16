package DecisionStatments;

import java.util.Scanner;

public class PowerBattery {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the battery percentage");
		
		int battery = s.nextInt();
		
		if (battery>=10 && battery<20) {
			
			System.out.println("Battery is low !");
			
		}
		else if (battery >=5 && battery<10) {
			
			System.out.println("Switch to power saver mode !");
			
		}
		else if (battery >0 && battery< 5) {
			
			System.out.println("connect charger before switching off !");
			
		}
		else if (battery<1) {
			
			System.out.println("good night ");
			
		}
		else if (battery >=20 && battery<=100) {
			
			System.out.println("no need to charge ");
		}
	}
}
