package Encapsulation;

public class Car {
	
	String brand;
	String name;
	String colour;
	double price;
	String type;
	int airbag;
	int seat;
	String gear;
	
	Engine e1 = new Engine("petrol",4,100,1000,"sport");
	
	public Car(){}
	
	public Car(String brand,String name,String colour,double price,String type,int airbag,int seat,String gear) {
	
		this.brand = brand;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.type = type;
		this.airbag = airbag;
		this.seat = seat;
		this.gear = gear;
		
	}
	public void displayCar()
	{
		System.out.println("name:"+name);
		System.out.println("Brand:"+brand);
		System.out.println("Colour:"+colour);
		System.out.println("Price:"+price);
		System.out.println("Type:"+type);
		System.out.println("Airbag:"+airbag);
		System.out.println("Eeat:"+seat);
		System.out.println("Gear:"+gear);
	}
}
