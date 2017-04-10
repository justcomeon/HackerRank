package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day12_Inheritance {
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
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores) {

        super(firstName,lastName,id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for(int score_i : this.testScores) {
            sum+=score_i;
        }
        int avg_score = sum/testScores.length;
        if(avg_score>=90 && avg_score<=100)
            return 'O';
        else if(avg_score>=80 && avg_score<90)
            return 'E';
        else if(avg_score>=70 && avg_score<80)
            return 'A';
        else if(avg_score>=55 && avg_score<70)
            return 'P';
        else if(avg_score>=40 && avg_score<55)
            return 'D';
        else
            return 'T';

    }
}

