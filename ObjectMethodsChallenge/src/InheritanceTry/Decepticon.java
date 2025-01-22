package InheritanceTry;

public class Decepticon extends Transformer {
	
	String botFormSecondary;
	
	Decepticon (String name, String botForm, int speed, int strength, int IQ, String botFormSecondary){
		super(name, botForm, speed, strength, IQ);
		this.botFormSecondary = botFormSecondary;
		
		
	}
	
	void secondForm() {
		
		System.out.println(botFormSecondary);
	}

}
