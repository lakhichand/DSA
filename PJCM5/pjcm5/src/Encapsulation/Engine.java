package Encapsulation;

public class Engine {
	
	String fuel;
	int no_of_cy;
	double hp;
	double cc;
	String type;
	
	Engine (){}
	
	Engine (String fuel,int no_of_cy,double hp,double cc,String type)
	{
		this.cc  = cc;
		this.fuel = fuel;
		this.hp = hp;
		this.type = type;
		this.no_of_cy = no_of_cy;
	}
	public void displayEngine()
	{
		System.out.println("cc:"+cc);
		System.out.println("fuel:"+fuel);
		System.out.println("hp:"+hp);
		System.out.println("type of engine:"+type);
		System.out.println("no_of_cy:"+no_of_cy);
	}

}
