package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Joshua", 25, "Male");
		Toddler t = new Toddler("Miguel", 2, "Female", "Nba");
		
		/* CAN REMOVE THIS PART SINCE CONSTRUCTORS ARE USED NOW
		  
		p.name = "Joshua";
		p.sex = "Male";
		p.age = 18;
		
		t.name = "Miguel";
		t.sex = "Female";
		t.age = 2;
		
		*/
		p.checkStatus();
		t.checkStatus();
		
		t.crawl();

	}

}
