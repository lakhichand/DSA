package AllBasicProgram;

public class WidenningAndNarrowing {

	public static void main(String[] args) {
		byte a = 100;  //widenning done implicitly by compiller
		
		byte b = 20;
		
		byte c = (byte)1225.12f;   // narrowing not done implicitly by comipller
		                           //   programmer needs to force compiller to do nnarrowing
		
		byte d = (byte)10214l;
		
		byte f = 'g';
		
		byte h = (byte)124563.4578
				;
		System.out.println(a);
		
		System.out.println(b);
		
		
		System.out.println(c);
		
		System.out.println(d);
	
		System.out.println(f);
		
		System.out.println(h);
		
	}
}
