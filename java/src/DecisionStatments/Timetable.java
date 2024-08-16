package DecisionStatments;

import java.util.Scanner;

public class Timetable {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("==============Welcome============");
		System.out.println("1.monday");
		System.out.println("2.tuesday");
		System.out.println("3.wedensday");
		System.out.println("4.thursday");
		System.out.println("5.friday");
		System.out.println("6.sataurday");
		System.out.println("7.susday");
		
		System.out.println("Enter your option");
		
		int option = x.nextInt();
		
		switch (option) {
		case 1:{
			System.out.println("read marathi");
			break;
		}
		case 2:
		{
			System.out.println("practice english");
			break;
		}
		case 3:
		{
			System.out.println("practice science");
			break;
			
				
		}
		case 4:
		{
			System.out.println("solve math");
			break;
		}
		case 5:
		{
			System.out.println("explore histroy");
			break;
			
		}
		case 6:
		{
			System.out.println("draw art/drawing");
			break;
			
		}
		case 7:
		{
			System.out.println("go play");
			break;
		}

		default:{
			System.out.println("invalid input");
			break;
		}
			
		}
	}
}
