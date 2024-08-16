package AllBasicProgram;

import java.util.Scanner;

public class While7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num = s.nextInt();
		
		int  a = 1;
		
		while (a<=1) {
			System.out.println(num+"*"+a+"="+num*a++);
		}
	}
}MN