package DecisionStatments;

import java.util.Scanner;

public class Scan2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the byte data");
		byte b = s.nextByte();
		
		System.out.println("ENter the short data");
		short w = s.nextShort();
		
		System.out.println("Enter the int data ");
		int a = s.nextInt();
		
		System.out.println("Enter the long data");
		long l= s.nextLong();
		
		System.out.println("Enter the float data");
		float f = s.nextFloat();
		
		System.out.println("Enter the boolean data");
		boolean o = s.nextBoolean();
		
		System.out.println("Enter the String data");
		String word = s.next();
		
		System.out.println("Enter the char data");
		char c = s.next().charAt(0);
		
		System.out.println("Enter the String with Space");
		String sentence = s.nextLine();
		
		
		
		System.out.println(b);
		System.out.println(w);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(o);
		System.out.println(c);
		System.out.println(word);
		System.out.println(sentence);
		
		
	}

}
