package DecisionStatments;

public class Switch1 {

	public static void main(String[] args) {
		
		switch (1) {
		case 2:
		{
			System.out.println("from case block 1");
			break;
		}
		case 1:
		{
			System.out.println("from case block 2");
			break;
			
		}
		case 5:
		{
			System.out.println("from case block 3");
			break;
			
		}
		case 4:
		{
			System.out.println("from case block 4");
		}

		default:
		{
			System.out.println("from default block");
			break;
		}
		}
	}
}
