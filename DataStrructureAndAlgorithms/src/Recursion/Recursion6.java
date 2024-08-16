package Recursion;

public class Recursion6 {

	public static int power(int x,int n) {
		
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		int pow = power(x, n-1);
		return pow * x;
		
	}
	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		int res = power(x, n);
		System.out.println(res);
	}
}
