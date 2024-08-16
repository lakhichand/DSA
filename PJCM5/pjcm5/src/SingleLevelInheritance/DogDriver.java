package SingleLevelInheritance;

public class DogDriver {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog("sheru","bark","omnivrous","Brown", 4, "long coat",
				"German Shepered",true);
	
		d1.displayDog();
		
		System.out.println("==========");
		d1.displayAnimal();
	}
}
