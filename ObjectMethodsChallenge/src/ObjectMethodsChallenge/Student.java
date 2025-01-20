package ObjectMethodsChallenge;

public class Student {
	
	String firstName, secondName, year, course, section;
	float midtermGrade, finalGrade;
	
	Student(String firstName, String secondName, String year, String course, String section, float midtermGrade, float finalGrade){
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.year = year;
		this.course = course;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		
	}
	
	void introduceSelf() {
		
		System.out.println("Student Name: " + firstName + " " + secondName);
		System.out.println("Course: " + course + " Year: " + year + " Section: " + section);
		
	}
	public String evaluateGrade(float MG, float FG) {
	
		float ave;
		String remarks = "Invalid";
		ave = (MG + FG)/2; 
		System.out.println("Average: " + ave);
		
		if(ave > 100  ) {
			
			System.out.println("Invalid Grade");
			
		}
		else if (100 >= ave && ave >= 98) {
			
			remarks = "With Highest Honors";
		}
		else if (97.99 >= ave && ave >= 90) {
			
			remarks = "With High Honors";
		}
		else if (89.99 >= ave && ave >= 75) {
			
			remarks = "Passed";
		}
		else {
			
			remarks = "Failed";
		}
		
		return remarks;
		
	}
	

}
