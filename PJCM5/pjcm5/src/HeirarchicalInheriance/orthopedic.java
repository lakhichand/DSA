package HeirarchicalInheriance;

public class orthopedic extends Doctor {
	String spl;
	String organ;
	
	orthopedic() {} 
	
	orthopedic(String name,String degree,long lic,double fee,String time,
			String hospital,double exp,String spl,String organ){
		
		this.name = name;
		this.degree = degree;
		this.lic = lic;
		this.fee =fee;
		this.time = time;
		this.hospital = hospital;
		this.exp = exp;
		
		this.spl = spl;
		this.organ = organ;
	
	}
	public void displayOrthopedic() {
		displayDoctor();
		
		System.out.println("spl:"+spl);
		System.out.println("organ:"+organ);
	}
	

}
