package Recursion;

public class Recursion7 {

	public static int log(int x, int n) {
		
		if (x ==0) {
			return 0;
			
		}
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return log(x, n/2)*log(x, n/2);
		}
		else
		{
			return log(x, n/2)*log(x, n/2)*x;
		}
	}
	public static void main(String[] args) {
		int x = 2,n = 5;
		int res = log(x, n);
		System.out.println(res);
	}
}
