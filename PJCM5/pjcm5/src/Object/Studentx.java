package Object;

public class Studentx {
	
	String name;
	String branch;
	String college;
	String gender;
	int id;
	
	Studentx () {}

	Studentx (String name,String college,String branch,String gender,int id)
	{
		this.name =  name;
		this.college = college;
		this.branch = branch;
		this.id = id;
		this.gender = gender;
	}
	
	public void displayStudentx()
	{
		System.out.println(branch);
		System.out.println(college);
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
	}
	
	public boolean equals(Object o)
	{
		Studentx ip = (Studentx)o;
		
		if ( this.name == ip.name && this.college == ip.college && this.id == ip.id 
				&& this.branch == ip.branch && this.gender == ip.gender)
		{
			return true;
		}
		return false;
		
	}
}
