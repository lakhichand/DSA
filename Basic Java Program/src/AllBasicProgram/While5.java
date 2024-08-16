package AllBasicProgram;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the starting character");
		
		int start = s.next().charAt(0);
		
		System.out.println("Enter the ending chracter");
		
		int end = s.next().charAt(0);
		
		while (start<end) {
			System.out.println(start);
			}
			++start;
		}
	}

