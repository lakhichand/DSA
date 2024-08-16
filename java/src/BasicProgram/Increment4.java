package BasicProgram;

public class Increment4 {

	public static void main(String[] args) {
		
		int a= 26;
		
		int b = 7;
		
		int c = 12;
		
		int d = 4;
		
		a++;
		
		d = ++a - --c;
		
		--a;
		
		++d;
		
		b = d++ - b++;
		
		--b;
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c); 
		
		System.out.println(d);
	
	}
}
