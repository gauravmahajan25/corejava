package afi;
import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
	}
	
	Student(String firstName, String lastName, int identification, int [] scores) {
		super(firstName, lastName, identification);
		this.testScores = scores;
		// TODO Auto-generated constructor stub
	}

	private int[] testScores;

	public String calculate() {
		int totalMarks = 0; 
		for (int i = 0; i < this.testScores.length; i++) {
			totalMarks+=testScores[i];
		}
		
		int average =  (int) (totalMarks/(testScores.length));
		String grade="T";
		if (average >= 40 && average < 55) 
			grade = "D";
		else if (average >= 55 && average < 70) 
			grade = "P";
		else if (average >= 70 && average < 80) 
			grade = "A";
		else if (average >= 80 && average < 90) 
			grade = "E";
		else if (average >= 90 && average <= 100) 
			grade = "O";
		
		return grade;

	}
   
}


public class Day12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}
