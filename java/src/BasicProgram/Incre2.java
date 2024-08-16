
package BasicProgram;

public class Incre2 {

	public static void main(String[] args) {
		
		float a  = 50.25f;
		
		float b= a++ + ++a + a--;
		
		System.out.println(a);
		
		System.out.println(b);
	}
}
