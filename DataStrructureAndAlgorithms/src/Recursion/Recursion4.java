package Recursion;

public class Recursion4 {

	public static int fac(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int a = fac(n-1);
		
		return a*n;
	}
	public static void main(String[] args) {
		int res = fac(5);
		System.out.println(res);
	}
}
