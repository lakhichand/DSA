package MultiLevelInheritance;

public class DevDriver {
      
	public static void main(String[] args) {
		
		Developer d1 = new Developer("BE","CS", "pune", 6.75, 2021, "programming"
				, "Google",5,500000.00,"java");
		
		//d1.displayDeveloper();
		System.out.println("==============");
		
		d1.displaySoftwareEngineer();
		System.out.println("===============");
		
		d1.displayEngineer();
		
		SoftwareEngineer s1 = new SoftwareEngineer("BE","CS","ahmdabad", 2022, 9.1
				, "Coomunication", "microsoft",10);
		
        s1.displaySoftwareEngineer(); 
		
	}
}
