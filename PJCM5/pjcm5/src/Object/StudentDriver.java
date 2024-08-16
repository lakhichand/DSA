package Object;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("guldu", "java", "Q spyder", 101,"male");
		
		System.out.println(s1);
		
		Student s2 = new Student();
		
		System.out.println(s2);
		s2.displayStudent();
		
		s1.displayStudent();
	}

}
