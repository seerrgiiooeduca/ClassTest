package Test;

import java.util.Scanner;

public class arraysexplanation {
	public static void main(String[] args) {
	// type identifier[] = new type[REQUIRED Spaces]
		int ages[] = new int[5];

		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < ages.length; i++) {
			System.out.println("How many years is the student number " + i);
			ages[i] = keyboard.nextInt();
			System.out.println("The age is " + ages[i]);
		}
		keyboard.close();
	}
}
