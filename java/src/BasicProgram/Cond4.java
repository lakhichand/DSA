package BasicProgram;

public class Cond4 {

	public static void main(String[] args) {
		
		int a = 45;
		int b = 46;
		int c = 78;
		int d = 10;
		
		int large = a > b ? a : b;
		
		int largest = large > c ? large : c;
		
		int result  =  largest > d ? largest : d;
		
		System.out.println(result);
		
	}
}
