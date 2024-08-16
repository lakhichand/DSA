package SingleLevelInheritance;

public class Animal {
	
	int leg;
	String name;
	String color;
	String type;
	String sound;
	
	Animal() {};
	
	Animal(int leg,String name,String color,String type,String sound){
		
		this.name = name;
		this.leg = leg;
		this.color = color;
		this.type = type;
		this.sound = sound;
	}
	
	public void displayAnimal()
	{
		System.out.println("name:"+name);
		System.out.println("leg:"+leg);
		System.out.println("type:"+type);
		System.out.println("sound:"+sound);
		System.out.println("color:"+color);
	}
	

}
