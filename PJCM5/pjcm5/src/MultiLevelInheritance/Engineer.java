package MultiLevelInheritance;

public class Engineer {
	
	String degree;
	String branch;
	String university;
	double aggregate;
	int yop;
	
	
	public Engineer () {};
	
	public Engineer(String degree,String branch,String university,
			String aggregate,int yop){
		
	        this.degree = degree;
	        this.branch = branch;
	        this.aggregate = aggregate;
	        this.university = university;
	        this.yop = yop;
	        
	}
	public void displayEngineer() {
		
		System.out.println("degree:"+degree);
		System.out.println("branch:"+branch);
		System.out.println("aggregate:"+aggregate);
		System.out.println("yop:"+yop);
		System.out.println("university:"+university);
	}

}
