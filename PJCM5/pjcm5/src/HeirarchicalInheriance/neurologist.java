package HeirarchicalInheriance;

public class neurologist extends Doctor{
	String spl;
	String organ;
	
	neurologist () {}
	
    neurologist(String name,String degree,String time,double fee,long lic,
			double exp,String hospital,String spl,String organ) {
    	
    	this.degree = degree;
    	this.name = name;
    	this.time = time;
    	this.fee = fee;
    	this.lic = lic;
    	this.exp = exp;
    	this.hospital = hospital;
    	
    	this.spl = spl;
    	this.organ = organ;
    }
    public void displayNeurologist()
    {
    	displayDoctor();
    	
    	
    	System.out.println("spl:"+spl);
    	System.out.println("organ:"+organ);
    }

}
