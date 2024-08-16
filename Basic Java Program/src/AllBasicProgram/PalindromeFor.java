package AllBasicProgram;

import java.util.Scanner;

public class PalindromeFor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int ans = 0;
		int temp = num;
		
		for (int i = temp;i>0;i = i/10)
		{
		int rem = i%10;
		ans = ans*10+rem;
		}
		System.out.println(ans);
		if (ans  == num) {
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
