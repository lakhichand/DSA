package LoopStatments;

import java.util.Scanner;

public class While7 {
	
        public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		
		int start = s.nextInt();
		
		System.out.println("Enter the ending number");
		
		int end = s.nextInt();
		
		while (start>=end) {
			
			System.out.println(start);
			start--;
		}
		
        }
}
