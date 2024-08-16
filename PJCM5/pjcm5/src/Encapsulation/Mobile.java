package Encapsulation;

public class Mobile {
	
	String brand;
	String color;
	String processor;
	double price;
	int ram;
	int hd;
	int cam;
	int sim;
	int battery;
	
	Sim s1 = null;
	
	public Mobile () {}
	
	public Mobile(String brand,String color,String processor,
			double price,int hd,int sim,int cam,int battery,int ram)
	{
		this.brand = brand;
		this.color = color;
		this.battery = battery;
		this.ram = ram;
		this.color = color;
		this.cam = cam;
		this.processor = processor;
		this.hd = hd;
		this.sim = sim;
		
	}
	public void insertsim(String service,String type,String size,long no)
	{
		sim s1 = new Sim(service,type,size,no);
		
		System.out.println("sim inserted successfully");
		
	}
	public void displaymobile()
	{
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		System.out.println("processor:"+processor);
		System.out.println("price:"+price);
		System.out.println("Ram:"+ram);
		System.out.println("hard disk:"+hd);
		System.out.println("cam:"+cam);
		System.out.println("sim:"+sim);
		System.out.println("battery:"+battery);
		
	}
}
