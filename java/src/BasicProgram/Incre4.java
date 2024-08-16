package BasicProgram;

public class Incre4 {

	public static void main(String[] args) {
		
		double a = 'd', b = -88 , c = 100.23;
		
		a = b + c-- + a++ - --b + ++c;
		
		b = a + b - --a + ++b - --a;
		
		c = a + b+ c++;
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
	}
}
