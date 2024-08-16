package LamdaFunction;

public class ABDriver {
	
	public static void main(String[] args) {
		
		A a1 =(s)-> {
			System.out.println("Writing with lamda function !");
			
			System.out.println(s);
			
		};
		
		a1.abc("i am tejus");
	}

}
