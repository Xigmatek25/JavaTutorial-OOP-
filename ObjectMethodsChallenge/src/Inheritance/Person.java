package Inheritance;

public class Person {
	
	String name, sex;
	int age;
	
	Person(String name, int age, String sex){
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	
	void checkStatus() {
		
		System.out.println("Name : " + name);
		System.out.println("Sex  : " + sex);
		System.out.println("Age  : " + age);
	}

}
