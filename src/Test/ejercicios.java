package Test;

import java.util.Scanner;

public class ejercicios {
	public static void main(String[] args) {
		final int TIMES = 4;
		final double MODULEPASSED = 5;
		double[] givenNumbers = new double[TIMES];
		for (int i = 0; i < TIMES; i++) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Give me a grade between 0 and 10");
			double temporalNum = keyboard.nextDouble();
			if (temporalNum <= 10 && temporalNum >= 0) {
				givenNumbers[i] = temporalNum;
				System.out.println("Received the number: " + temporalNum);
			} else {
				i--;
				System.out.println("You gave a higher number. Try again");
			}
			keyboard.close();
		}
		
		for (int i = 0; i < givenNumbers.length; i++) {
			System.out.println(givenNumbers[i]);
			if (givenNumbers[i] >= MODULEPASSED) {
				System.out.println("Student number " + (i+ 1) + " passed the module with " + givenNumbers[i] + " points");
			} else {
				System.out.println("Student number " + (i +1) + " did not pass the module with " + givenNumbers[i] + " points");
			}
		}
	}
}
