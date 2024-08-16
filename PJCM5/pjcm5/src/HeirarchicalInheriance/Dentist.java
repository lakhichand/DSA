package HeirarchicalInheriance;

public class Dentist extends Doctor {
	
	String spl;
	String organ;
	
	public Dentist () {}
	
	Dentist(String name,String degree,long lic,double fee,String time
			,String hospital,double exp,String spl,String organ){
		
		this.name = name;
		this.degree = degree;
		this.lic = lic;
		this.hospital = hospital;
		this.time = time;
		this.fee = fee;
		this.time = time;
		this.exp = exp;
		
		this.spl = spl;
		this.organ = organ;
		
	}
	
	public void displayDenist()
	{
		displayDoctor();
		
		System.out.println("spl:"+spl);
		System.out.println("organ:"+organ);
    }
}
