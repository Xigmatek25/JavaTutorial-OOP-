package Inheritance;

public class Toddler extends Person{
	
	String favGame;
	
	Toddler(String name, int age, String sex, String favGame){
		super(name, age, sex);
		this.favGame = favGame;
		
	}
	
	void checkStatus() {
		
		System.out.println("Fav Game  :  " + favGame);
		super.checkStatus();
	}
	
	void crawl() {
		
		System.out.println("");
		
	}

}
