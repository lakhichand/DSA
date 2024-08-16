package MultiLevelInheritance;

public class Developer extends SoftwareEngineer {
	
	String language;
	double salary;
	
	public Developer() {}
	
	Developer(String degree,String branch,String university,double aggregate,int yop,
			String skill,String company,double exp,double salary,String language){
		
		this.degree = degree;
		this.branch = branch;
		this.university = university;
		this.aggregate = aggregate;
		this.yop = yop;
		
		this.skill = skill;
		this.company = company;
		this.exp = exp;
		
		this.language = language;
		this.salary = salary;
		
	}
	public void displayDeveloper() {
		
		displaySoftwareEngineer();
		
		System.out.println("language:"+language);
		System.out.println("salary:"+salary);
	}

}
