package LoopStatments;

import java.util.Scanner;

public class While6 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the start character");
		char start =s.next().charAt(0);
		
		System.out.println("Enter the end character");
		char end =s.next().charAt(0);
		
		while (start<=end) {
			
			if (start%2 == 1) {      // for even replace 1 by 2
				System.out.println(start);
			}
			
			++start;
		}
	}

}
