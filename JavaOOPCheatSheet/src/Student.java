
public class Student {
	//Class attributes
	String firstName;
	String lastName;
	int age;
	double gpa;
	String major;
	boolean isOnProbation;
	
	
	//Constructor - always get executed when you make instance of this class
	public Student(String firstName, String lastName, int age, double gpa, String major, boolean isOnProbation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.isOnProbation = isOnProbation;
	}
	
	//Making a Method
	public boolean isOnHonorRoll() {
		if(this.gpa >= 3.5) {
			return false;
		} else {
			return true;
		}
	}
}
