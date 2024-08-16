package AllBasicProgram;

public class Cond2 {

	public static void main(String[] args) {
		long a = 846784545344l;
		
		long b = 867467445344l;
		
		long c = 852087546844l;
		
		long d = 887354685744l;
		
		long large = (a>b)?a:b;
		
		long largesr = (large>c)?large:c;
		
		long  largest = (largesr>d)?largesr:d;
		
	
		System.out.println(largest);
	}
}
