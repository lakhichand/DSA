package BasicProgram;

public class Incre3 {

	public static void main(String[] args) {
		
	
	double a = 100.300, b = 156.00, c = 250.25;
	
	a = b + c-- +  a++ - --b + ++c;
	
	c = a + b - --a + ++b - --a;
	
	c = a+ b+ c++;
	
	System.out.println(a);
	
	System.out.println(b);
	
	System.out.println(c);
	}
}
