package MultiLevelInheritance;

public class SoftwareEngineer extends Engineer{
	
	String skill;
	String company;
	double exp;
	
	SoftwareEngineer() {}
	
	 public SoftwareEngineer(String degree,String branch,String university,int yop,
			double aggregate,String skill,String company,double exp){
		
		this.degree = degree;
		this.branch = branch;
		this.aggregate = aggregate;
		this.university = university;
		this.yop = yop;
		
		this.skill = skill;
		this.company = company;
		this.exp = exp;
		
	}
	 public void displaySoftwareEngineer()
	 {
		 displayEngineer();
		 
		 System.out.println("skill:"+skill);
		 System.out.println("company:"+company);
		 System.out.println("exp:"+exp);
	 }

}
