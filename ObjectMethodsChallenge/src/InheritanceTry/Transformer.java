package InheritanceTry;

public class Transformer {
	
	String name, botForm;
	int speed, strength, IQ;
	
	Transformer (String name, String botForm, int speed, int strength, int IQ){
		
		this.name = name;
		this.botForm = botForm;
		this.speed = speed;
		this.strength = strength; 
		this.IQ = IQ;
		
	}
	
	Transformer(String name, int speed, int strength, int IQ){
		
		this.name = name;
		this.speed = speed;
		this.strength = strength; 
		this.IQ = IQ;
		
	}
	
	void classifyBot() {
		
		System.out.println("Bot Name: " + name );
		System.out.println("speed: " + speed + " strength " + strength + " IQ: " + IQ);
		
	}
	
	void transform() {
		
		System.out.println(botForm);
		
	}
		
}
