package LoopStatments;

import java.util.Scanner;

public class reverse2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = s.nextInt();
		
		int ans = 0;
		
		for ( int i = num; i>0;i/=10)
		{
			int rem = i%10;
			
			ans = ans*10+rem;
			
			
			
		}
		System.out.println(ans);
	}
}
