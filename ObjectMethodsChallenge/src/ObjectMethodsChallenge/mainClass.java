package ObjectMethodsChallenge;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inpFname, inpSname, inpYear, inpCourse, inpSection;
		float inpMG, inpFG, ave;
		
		System.out.println("Enter First Name of the student: ");
		inpFname = scan.nextLine();
		
		System.out.println("Enter Second Name of the student: ");
		inpSname = scan.nextLine();
		
		System.out.println("Enter year of the student: ");
		inpYear = scan.nextLine();
		
		System.out.println("Enter Course of the student: ");
		inpCourse = scan.nextLine();
		
		System.out.println("Enter Section of the student: ");
		inpSection = scan.nextLine();
		
		System.out.println("Enter midterm grade of the student: ");
		inpMG = scan.nextFloat();
		
		System.out.println("Enter final grade of the student: ");
		inpFG = scan.nextFloat();
		
		Student s1 = new Student(inpFname, inpSname, inpYear, inpCourse, inpSection, inpMG, inpFG);
		
		s1.introduceSelf();
		
		System.out.println("Remarks: " + s1.evaluateGrade(inpMG, inpFG));
		
		User u = new User(12,"kingjames", "Lebron", "James"); 
		
		u.setUserID(scan.nextInt());
		
		

	}

}
