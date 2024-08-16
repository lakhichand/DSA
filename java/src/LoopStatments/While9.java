package LoopStatments;

import java.util.Scanner;

public class While9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int a= 2;
		
		while (a<=10) {
			
			System.out.println(num+"*"+a+"="+num*a++);
		}
	}
}
