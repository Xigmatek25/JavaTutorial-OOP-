package InheritanceTry;

public class Autobot extends Transformer{
	
	String humanFriend;
	
	Autobot(String name, String botForm, int speed, int strength, int IQ, String humanFriend){
		super(name, botForm, speed, strength, IQ);
		this.humanFriend = humanFriend;
		
		
	}
	
	void humanFriend() {
		
		System.out.println(humanFriend);
	}
	
	

}
