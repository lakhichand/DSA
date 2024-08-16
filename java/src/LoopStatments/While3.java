package LoopStatments;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the character");
		char start =s.next().charAt(0);
		
		System.out.println("Enter the end character");
		char end =s.next().charAt(0);
		
		while (start<=end) {
			System.out.println(start);
			++start;
		}
	}
}
