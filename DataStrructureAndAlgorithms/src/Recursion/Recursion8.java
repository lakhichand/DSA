package Recursion;

public class Recursion8 {

	public static int reverse(int i, int sum) {
		if (i == 0) {
			System.out.println(sum);
			return sum ;
		}
		
		int rem = i%10;
		sum = sum*10+rem;
		i /=10;
		return reverse(i, sum);
		
	}
	public static void main(String[] args) {
		int sum = 0;
		int i = 4578;
	int ans   =reverse(i, sum);

	System.out.println(ans);
	}
}
