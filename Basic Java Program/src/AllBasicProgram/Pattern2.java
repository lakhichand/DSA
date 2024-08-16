package AllBasicProgram;

public class Pattern2 {

	public static void main(String[] args) {
		
		 for( int i = 0;i<4;i++) {
			for(int g = 0;g<4;g++) {
			  if (i==5|| i == g) {
				System.out.println("*"+"*");
			}
			  else
			  {
				  System.out.println(" "+" ");
			  }
			}
		}
	}
}
