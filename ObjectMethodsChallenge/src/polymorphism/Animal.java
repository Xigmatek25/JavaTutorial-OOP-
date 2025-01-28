package polymorphism;

public class Animal {
	
	String sound, type;
	
	
	void makeSound() {
		
		System.out.println(type + ": " + sound);
		
	}
	
	void showType() {
		
		System.out.println("Type: " + type);
		
	}

}
