package Encapsulation;

public class CarDriver {
	
	public static void main(String[] args) {
		
		Car c1 = new Car("TATA","Neon","Black",1400000.00,"SUV",5,5,"Automatic");
		
		c1.displayCar();
		
	System.out.println("=================");
	
	c1.e1.displayEngine();
	
	Car c2 = new Car("oooo","Q3","BROWN",1200000.00,"SUV",5,5,"MANUAL");
	
	System.out.println("=================");
	
	c2.displayCar();
	
	System.out.println("=================");
	
	c2.e1.displayEngine();
	
	}

}
