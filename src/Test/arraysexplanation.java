package Test;

import java.util.Scanner;

public class arraysexplanation {
	public static void main(String[] args) {
	// type identifier[] = new type[REQUIRED Spaces]
//		int ages[] = new int[5];
//
//		Scanner keyboard = new Scanner(System.in);
//		for(int i = 0; i < ages.length; i++) {
//			System.out.println("How many years is the student number " + i);
//			ages[i] = keyboard.nextInt();
//			System.out.println("The age is " + ages[i]);
//		}
//		keyboard.close();
		
		exercise3();
	}
	
	public static void exercise2() {
		int students[] = {21, 17, 30,14,12,25};
		String modules[] = {"Computer Systems", "Database", " Programming", "Markup Language", 
				"Development enviroment", "Data access"};
		for(int i = 0; i < students.length; i++) {
			System.out.println("There are " + students[i] + " on " + modules[i]);
		}
	}
	
	public static void exercise3() {
		int students[] = {21, 17, 30, 14, 12, 25};
		double total = 0;
		for(int i = 0; i < students.length; i++) {
			total = total + students[i];
			System.out.println(students[i]);
		}
		System.out.println("Average is " + (total/students.length));
	}
	
}
