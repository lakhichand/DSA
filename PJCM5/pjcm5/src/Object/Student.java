package Object;

public class Student {
	
	String name;
	String college;
	String branch;
	int id;
	String gender;
	
	Student () {}
	
	Student(String name,String branch,String college,int id, String gender)
	{
		this.name = name;
		this.branch = branch;
		this.id = id;
		this.college = college;
		this.gender = gender;
	}
	public void displayStudent()
	{
		System.out.println(branch);
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(college);
	}
	
	public String toString()
	{
		return"[Name:"+name+" College:"+college+" ID:"+id+
				" Branch:"+branch+" Gender:"+gender+"]";
	}
}
