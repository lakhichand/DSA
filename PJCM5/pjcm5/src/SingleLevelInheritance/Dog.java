package SingleLevelInheritance;

public class Dog extends Animal {
	
	String hair;
	String breed;
	boolean tail;
	
	Dog () {};
	
	Dog(String name,String sound,String type,String color
			,int leg,String hair,String breed,boolean tail){
		
		this.name = name;
		this.type = type;
		this.leg = leg;
		this.color = color;
		this.sound = sound;
		
		this.breed = breed;
		this.hair = hair;
		this.tail = tail;
		
	}
	 
	public void displayDog () {
		
		displayAnimal();
		
	    System.out.println("hair:"+hair);
	    System.out.println("breed:"+breed);
	    System.out.println("tail:"+tail);
	}

}
