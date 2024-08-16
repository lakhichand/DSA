package Encapsulation;

public class Sim {
	
	String service;
	String type;
	String size;
	long no;
	
	Sim () {}
	
	Sim (String service,String type,String size,long no)
	{
		this.no =no;
		this.service = service;
		this.type = type;
		this.size = size;
	}
	public void displaySim()
	{
		System.out.println("service:"+service);
		System.out.println("size:"+size);
		System.out.println("type:"+size);
		System.out.println("no:"+no);
		
		System.out.println("=================");
	}

}
