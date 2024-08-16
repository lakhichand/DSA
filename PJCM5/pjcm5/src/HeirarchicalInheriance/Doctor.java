package HeirarchicalInheriance;

public class Doctor {
	
	String name;
	String degree;
	long lic;
	String hospital;
	String time;
	double fee;
	double exp;
	
	Doctor () {};
	
	Doctor(String name,String degree,String hospital,String time,long lic,
			double fee,double exp){
		
		this.name = name;
		this.degree = degree;
		this.fee = fee;
		this.lic = lic;
		this.time = time;
		this.hospital = hospital;
		this.exp  = exp;
		
	}
	
	public void displayDoctor()
	{
		System.out.println("name:"+name);
		System.out.println("degree:"+degree);
		System.out.println("fee:"+fee);
		System.out.println("exp:"+exp);
		System.out.println("time:"+time);
		System.out.println("hospital:"+hospital);
		System.out.println("lic:"+lic);
	}

}
