package Test;
import java.util.Scanner;

public class ClassTest {
	public static void main(String args[]) {
		// Exercise1(300); // Simple print with arguments exercise
		Exercise2();
	}
	
	static void Exercise1(double EURO) {
		System.out.println("We have:" + EURO + "€");
	}
	
	static void Exercise2() {
		/* 
		
		Initialize the variables
		
		This means we create the variables to be usable, but we don't give them a value
		
		*/
		
		int FirstNumber;
		int SecondNumber;
		int Addition, Substraction, Multiply, Division, Reminder;
		
		Scanner FirstNumberScanner
		/*
		 * Now what we do here is modifying the values of FirstNumber and SecondNumber.
		 * Then we modify the value of Result calculating the addition of both values.
		 */
		
		FirstNumber = 1;
		SecondNumber = 2;
		
		Addition = FirstNumber + SecondNumber;
		
		System.out.println("The addition of " + FirstNumber + " and " + SecondNumber + " is equals to: " + Addition);
		
		Substraction = FirstNumber - SecondNumber;
		
		System.out.println("The substaction of " + FirstNumber + " and " + SecondNumber + " is equals to: " + Substraction);

		Multiply = FirstNumber * SecondNumber;
		
		System.out.println("The multiplication of " + FirstNumber + " and " + SecondNumber + " is equals to: " + Multiply);
		
		Division = FirstNumber / SecondNumber;
		
		System.out.println("The division of " + FirstNumber + " and " + SecondNumber + " is equals to: " + Division);
		
		Reminder = FirstNumber % SecondNumber;
		
		System.out.println("The reminder of " + FirstNumber + " and " + SecondNumber + " is equals to: " + Reminder);
		
		
		/*
		 * Here what we have done is making every logic operation with the same 2 values, then printing with a similar print the result.
		 */
		

		
	}
}
