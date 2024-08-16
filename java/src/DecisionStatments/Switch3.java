package DecisionStatments;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("****menu***");
		System.out.println("1.veg");
		System.out.println("2.non veg");
		
		System.out.println("Enter your option");
		int option = s.nextInt();
		
		switch (option) {
		case 1:{
			System.out.println("1.mix veg thali");
			System.out.println("2.kolapohri special");
			System.out.println("3.malavani special");
			
		}
		System.out.println("Select your option ");
		int order = s.nextInt();
		
		switch (order) {
		case 1:
		{
			System.out.println("you have to pay 150");
			break;
			
		}
		case 2:
		{
			System.out.println("you have to pay 220rs");
			break;
		}
		case 3:
		{
			System.out.println("you have to pay 200rs");
			break;
			
		}
		}
		break;
		
		case 2:
			System.out.println("1.kolhapui mutton special");
			System.out.println("2.mutton thali");
			System.out.println("3.eggs thali");
			
			System.out.println("select your order");
			int order2 = s.nextInt();
			
		switch (order2) {
		case 1:
		{
			System.out.println("you have to pay 250");
			break;
			
		}
		case 2:
		{
			System.out.println("you have to pay 3000");
			break;
			
		}
		case 3:
		{
			System.out.println("you havt to pay 450");
			break;
		}

		default:
		{
			System.out.println("invalid entry....retry");
		}
		}
		}
			
			
	}
}
