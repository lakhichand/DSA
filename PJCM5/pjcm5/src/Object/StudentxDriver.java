package Object;

public class StudentxDriver {
	
	public static void main(String[] args) {
		
		Studentx s1 = new Studentx("Guldu", "Java", "Q spyder", "male",101);
		
		Studentx s2 = new Studentx("Guldu", "Java", "Q spyder", "male",101);
				
				System.out.println(s1 == s2);
		
				System.out.println(s1.equals(s2));
	}

}
