package LoopStatments;

import java.util.Scanner;

public class While5 {
	

       public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		
		int start = s.nextInt();
		
		System.out.println("Enter the ending number");
		
		int end = s.nextInt();
		
		while (start<=end) {
			if (start%2 == 1) {
				System.out.println(start);
		
			}
			start++;
		}
			
			
    }

}
