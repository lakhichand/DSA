package AllBasicProgram;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the byte data");
		byte b = s.nextByte();
		
		System.out.println("ENter the short data");
		short sh = s.nextShort();
		
		System.out.println("Enter the int data");
		int i = s.nextInt();
		
		System.out.println("Enter the char data");
		char c = s.next().charAt(i);
		
		System.out.println("Enter the long data");
		long l= s.nextLong();
		
		System.out.println("Enter the float data");
		float f = s.nextFloat();
		
		System.out.println("Enter the double data");
		double d = s.nextDouble();
		
		System.out.println("Enter the boolean data");
		boolean bo = s.nextBoolean();
		
		System.out.println("Enter the String data withoput space");
		String st = s.next();
		
		System.out.println("Enter the string data with space");
		String str = s.nextLine();
	}
}
