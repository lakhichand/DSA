package AllBasicProgram;

public class Incre1 {

	public static void main(String[] args) {
		
		int a = 'n', b = 7,c = 'd',d = 4;
		
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
