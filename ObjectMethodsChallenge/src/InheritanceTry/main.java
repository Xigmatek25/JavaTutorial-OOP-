package InheritanceTry;

 

public class main {

	public static void main(String[] args) {
		
		Autobot a1 = new Autobot("optimus", "Truck", 8, 10, 10, "Sam");
		Decepticon d1 = new Decepticon("Megatron", "Tank", 7, 10, 9, "jet");
		Transformer c1 = new Creators("Quintessa", 5, 3, 10);
		Transformer t1 = new Autobot("bumblebee", "camaro", 8, 10, 10, "test");
	
		a1.classifyBot();
		a1.transform();
		a1.humanFriend();
		
		System.out.println("-----------------------------");
		
		d1.classifyBot();
		d1.transform();
		d1.secondForm();
		
		System.out.println("-----------------------------");
		
		c1.classifyBot();
		c1.transform();
		
		System.out.println("-----------------------------");
		
		t1.transform();
		
		
		

	}

}
