package BasicProgram;

public class Increment2 {

	public static void main(String[] args) {
		
		int a= 101;
		
		int b= a++ + ++a + a--;
		
		System.out.println(a);
		
		System.out.println(b);
	}
}
