package BasicProgram;

public class Logical2 {
	public static void main(String[] args) {
		
		
		System.out.println("  AND TRUTH TABLE ! ");
		
		System.out.println(10>1 && 1<10);
		
		System.out.println(5 == 5 && 5<5);
		
		System.out.println('x'>'X' && 'a'>'A');
		
		System.out.println(13.23<=13 && 0 == 0);
		
		
		System.out.println("  OR TRUTH TABLE ! ");
		
        System.out.println(10>1 || 1> 0.04);
		
		System.out.println(true || 'a'<= 97);
		
		System.out.println(6 == 6 || 5<5);
		
		System.out.println(1>2 || 0>0); 
		
		
		System.out.println("  not truth table ! ");
		
		System.out.println(! (9 >= 9.0001));
		
		System.out.println(! (false!= false) );
		

	}

}
