package Test;

import java.util.Scanner;

public class ClassTest {

	public static void Exercise1(double EURO) {
		System.out.println("We have:" + EURO + "€");
	}

	static void Exercise3() {
		int i = -3;
		byte b = 5;
		float f = 1e-10f;
		double d = 3.14;
		boolean b1 = i > i;
		boolean b2 = i < b;
		boolean b3 = b <= f;
		boolean b4 = f >= d;
		boolean b5 = d != 0;
		boolean b6 = 1 == f;
		System.out.println("b1:" + i + ">" + i + "=" + b1);
		System.out.println("b2:" + i + "<" + b + "=" + b2);
		System.out.println("b3:" + b + "<=" + f + "=" + b3);
		System.out.println("b4:" + f + ">=" + d + "=" + b4);
		System.out.println("b5:" + d + "!=" + 0 + "=" + b5);
		System.out.println("b6:" + 1 + "==" + f + "=" + b6);
	}

	static void Exercise4() {

		int operation = ((4 - 2) * (5 + 1) / 2);
		int op2 = 2 - (4 + 3);
		boolean b = operation > op2;

		System.out.println("First math is: " + operation + " and then second math is: " + op2
				+ " so then the comparation of  operation > op2 " + b);
	}

	static void ScannerExam() {
		/*
		 * This is like an exam for my own. I have to create an input. Ask for a char
		 * (DNI letter) and a float (DNI numbers)
		 */

		char[] asignacionLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		Scanner DNI_Char = new Scanner(System.in);
		int numerosDNI;
		char letraDNI;

		while (true) {
			System.out.println("What's you DNI? (Max 8 characters)");
			numerosDNI = DNI_Char.nextInt();
			int DNI_Length = String.valueOf(numerosDNI).length();
			if (DNI_Length != 8) {
				System.out.println("You gave " + DNI_Length + " when we asked for 8 numbers. Try again");
				continue;
			}
			break;
		}

		int indexLetra = numerosDNI % 23;
		letraDNI = asignacionLetras[indexLetra];
		String fullDNI = numerosDNI + String.valueOf(letraDNI);
		System.out.println("The users DNI is " + fullDNI);
		DNI_Char.close();
	}

	static void CastingExample() {
		/*
		 * Casting means changing the data type of any value to another
		 * 
		 * IT DOES NOT WORK WITH OTHER DATA TYPES THAN NUMBERS
		 * 
		 * float, int, long, double and short
		 */

		double floatExample = 12345.56789;
		int result = (int) floatExample;

		System.out.println(result); // Here the print is not "12345.56789", it is printing "123456" because we using
									// the double as an integer
		System.out.println(floatExample);
	}

	static void OperatorsExample() {
		float i = 5;
		float j;
		j = i++;

		// En español porque es loco. "i++" y "++i" es la misma mierda.
		// En "i++" primero se iguala el valor a i y luego se suma 1.
		// En "++i" primero se suma 1 y luego se igual
		//
		// NO SIRVE PARA ABSOLUTAMENTE NADA DE NADA
		System.out.println("The value of i is " + i + " and the value of j is " + j);
	}

	static void conditionals() {
		short i = 1;
		short j = 2;

		if (i >= j) {
			System.out.println("I is bigger or equal than J");
		} else {
			System.out.println("J is bigger than J");
		}

	}

	static void activity17() {
		float i;

		try (Scanner lector = new Scanner(System.in)) {
			System.out.println("Tell me your number");
			i = lector.nextFloat();
		}

		if (i > 0) {
			System.out.println("I is positive");
		} else if (i < 0) {
			System.out.println("J is negative");
		} else {
			System.out.println("I is 0");
		}

	}

	public static void askDayOfTheWeek(Scanner mainScanner) {
		System.out.println("Give me a day of the week");
		if (!mainScanner.hasNextShort()) {
			System.out.println("You are not givin the right value, closing the program");
			mainScanner.next();
			return;
		}

		Short dayNumber = mainScanner.nextShort();

		switch (dayNumber) {
		case 1:
			System.out.println("You gave monday");
			break;
		case 2:
			System.out.println("You gave tuesday");
			break;
		case 3:
			System.out.println("You gave wednesday");
			break;
		case 4:
			System.out.println("You gave thursday");
			break;
		case 5:
			System.out.println("You gave friday");
			break;
		case 6:
			System.out.println("You gave saturday");
			break;
		case 7:
			System.out.println("You gave sunday");
			break;
		default:
			System.out.println("The number is out of the range");
			break;
		}
	}

	public static void wordsSwitch(Scanner mainScanner) {
		System.out.println("Give me a word and lets see if the switch can get it");

		String gottenWord = mainScanner.next();

		int position = 0;
		String asciiWord = "";
		if (position == gottenWord.length()) {
			System.out.println("Got last position");
			return;
		} else {
			for (position = 0; position <= (gottenWord.length()); position++) {
				char character;
				if (position == gottenWord.length()) {
					return;
				}
				character = gottenWord.charAt(position);
				int ascii = (int) character;
				asciiWord = asciiWord + " " + ascii;
				System.out.println("Got position " + position + " into ascii it is " + ascii
						+ " and the new asciiWord is " + asciiWord);
			}
		}

//		switch(gottenWord) {
//			case "hello":
//				System.out.println("Whats good mate");
//				break;
//			case "bye":
//				System.out.println("Seeya i guess");
//				break;
//			default:
//				System.out.println("Which language are u speaking folk");
//				break;
//		}
	}

	public static void act22(Scanner mainScanner) {
		int firstInt;
		int secondInt;
		char option;
		System.out.println("Give me the first int");
		firstInt = mainScanner.nextInt();

		System.out.println("Give me the second int");
		secondInt = mainScanner.nextInt();

		System.out.println("Which option do yo want?:");
		System.out.println("*. int 1 * int 2");
		System.out.println("+. int 1 + int 2");
		System.out.println("-. int 1 - int 2");
		System.out.println("/. int 1 / int 2");
		System.out.println("%. int 1  int 2");

		option = mainScanner.next().charAt(0);
		switch (option) {
		case '*':
			System.out.println("The result is " + firstInt * secondInt);
			break;
		case '+':
			System.out.println("The result is " + (firstInt + secondInt));
			break;
		case '-':
			System.out.println("The result is " + (firstInt - secondInt));
			break;
		case '/':
			System.out.println("The result is " + firstInt / secondInt);
			break;
		case '%':
			System.out.println("The result is " + firstInt % secondInt);
			break;
		default:
			System.out.println("This option does not exist");
			return;
		}

	}

	static void twoDecimalsAverage(Scanner mainScanner) {
		int count = 0, howManyNumbersDoWeHave = 0;
		System.out.println("How many numbers are you gonna give me");
		if (mainScanner.hasNextInt()) {
			count = mainScanner.nextInt();
		} else {
			System.out.println("You gave shit, try again");
			mainScanner.next();
		}

		double average = 0, numberList[] = new double[count];

		while (count > howManyNumbersDoWeHave) {
			System.out.println("Give me a number");
			if (mainScanner.hasNextDouble()) {
				numberList[howManyNumbersDoWeHave] = mainScanner.nextDouble();
				howManyNumbersDoWeHave++;
			} else {
				System.out.println("You gave shit, try again");
				mainScanner.next();
			}

		}

		for (int i = 0; i < numberList.length; i++) {
			average = average + numberList[i];
		}

		System.out.printf("The average of our numbers is: %.2f", average / count);

	}

	static void parseExample() {

	}

//	Activity 43: Draw a square of "n" side elements using *. ​
//
//	"n" must be requested from the user.​
//
//	For example, if the "n" entered is 4, it should print on the screen:​

	static void squareExercise() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many rows and columns our square is going to have?");
		int times = keyboard.nextInt();

		for (int i = 0; i < times; i++) {

			for (int j = 0; j < times; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		keyboard.close();
	}

//	Activity 44: Design a program that displays the multiplication tables from 1 to 10. ​
//
//	It should be displayed like this for all numbers from 1 to 10:​	

	static void multiplicationTablet() {
		short multiply = 10;
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " * " + multiply + " = " + i * multiply);
		}
	}

//	Activity 45: Given 6 grades, write the number of passing, conditional (=4) and failing students. ​

	static void sixGrades() {
		Scanner numbers = new Scanner(System.in);
		short howMany = 6, conditional = 4;

		for (int i = 0; i < howMany; i++) {
			System.out.println("Tell me the grade");
			double grade = numbers.nextDouble();
			if (grade < conditional) {
				System.out.println("You failed");
			} else if (grade > conditional) {
				System.out.println("You passed");
			} else {
				System.out.println("You are on conditional");
			}
		}
		numbers.close();
	}

	// Activity 46: Ask for 10 numbers, and show at the end if you have entered any
	// greater than 8.​
	static void tenGrades() {
		Scanner numbers = new Scanner(System.in);
		short howMany = 10, conditional = 8, count = 0;
		double grade[] = new double[howMany];
		for (int i = 0; i < howMany; i++) {
			grade[i] = numbers.nextDouble();
			if (grade[i] >= conditional) {
				count = (short) (count + 1);
			}
		}
		numbers.close();
		System.out.println("You have entered a greater number " + count + " times");
	}

	// Activity 47: A data source records several ages, with age zero indicating the
	// end of data entry.
	// Design a program to determine the average of the ages entered and also the
	// percentage of people over age 50.​

	static void ageAverages() {
		Scanner numbers = new Scanner(System.in);

		int age = 0, totalAges = 0, count = 0;

		do {
			System.out.println("Give me an age (0 will end the program): ");
			age = numbers.nextInt();

			if (age != 0) {
				totalAges += age;
				count++;
			}
		} while (age != 0);

		numbers.close();

		if (count > 0) {
			double average = (double) totalAges / count;
			System.out.printf("The age average is %.2f years old%n", average);
		} else {
			System.out.println("No ages were entered.");
		}
	}

	// Activity 48: Given a value n and a value y, design a program that displays
	// sequential numbers from 1 to n,
	// replacing with a * each time a multiple of y is displayed.

	static void figures() {
		int n, y;

		Scanner reader = new Scanner(System.in);

		System.out.println("Give me the value n");
		n = reader.nextInt();

		System.out.println("Give me the value y");
		y = reader.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % y == 0) {
				System.out.print("* ");
			} else {
				System.out.print(i + " ");
			}
		}
		reader.close();
	}

//	Activity 49: Write a program that asks for two numbers. If the two numbers given are the same, 
//	a message informing you of this will be displayed and two more numbers will be requested again. 
//	So on, until two numbers are inserted that are different from each other. Of these two numbers, the larger one will be displayed.​

	static void largerActivity49() {
		int n, y;
		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Give me the value for the first number");
			n = reader.nextInt();

			System.out.println("Give me the value for the second number");
			y = reader.nextInt();

			if (n == y) {
				System.out.println("The numbers are the same. Please try again with different numbers.\n");
			}

		} while (n == y);

		int max = (n > y) ? n : y;

		System.out.println("The bigger number is " + max);

		reader.close();
	}

	// Activity 50: Write a program that asks for a number and displays the sum of
	// all odd numbers from 1 to this number (including this one).
	// The number read has to be positive, so if it is not, it will ask for another
	// one until it is​

	static void Act50() {
		int number, count = 0;
		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Give me the value for the first number");
			number = reader.nextInt();

			if (number < 0) {
				System.out.println("The numbers are the same. Please try again with different numbers.\n");
			}

		} while (number < 0);

		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				count = count + i;
			}
		}

		System.out.println("The result is " + count);

		reader.close();
	}

	static void testcontinue() {
		int times;
		for (times = 1; times <= 7; times++) {
			System.out.println("is on Lap " + times + "of the for");
			if (times % 2 == 0) {
				continue;
			}
			System.out.println("End of lap " + times + "of for");
		}
		System.out.println("End of program");
	}

	public static void activity51() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print("Enter a character (* to stop): ");
			String input = scanner.next();
			char character = input.charAt(0);
			if (character == '*') {
				break;
			}
			if (character >= 'I' && character <= 'P') {
				count++;
			}
		}
		System.out.println("Characters between 'I' and 'P': " + count);
		scanner.close();
	}

	static void activity52() {
		Scanner scanner = new Scanner(System.in);
		int countPositives = 0;
		double sumPositives = 0;
		boolean hasNegative = false;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			double num = scanner.nextDouble();
			if (num >= 10 && num <= 50) {
				System.out.println("Error: Number is between 10 and 50.");
				return;
			}
			if (num > 0) {
				sumPositives += num;
				countPositives++;
			} else if (num < 0) {
				hasNegative = true;
			}
		}

		if (countPositives > 0) {
			System.out.println("Average of positives: " + (sumPositives / countPositives));
		} else {
			System.out.println("No positive numbers entered.");
		}

		if (hasNegative) {
			System.out.println("Negative numbers were entered.");
		} else {
			System.out.println("No negative numbers were entered.");
		}
		scanner.close();
	}

	static void activity53() {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;

		while (true) {
			System.out.print("Enter first number: ");
			num1 = scanner.nextInt();
			System.out.print("Enter second number: ");
			num2 = scanner.nextInt();
			if (num1 <= num2) {
				break;
			}
			System.out.println("First number must be less than or equal to the second. Try again.");
		}

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		scanner.close();
	}

	static void activity54() {
		Scanner scanner = new Scanner(System.in);
		char choice;

		do {
			double num;
			while (true) {
				System.out.print("Enter a positive number or 0: ");
				num = scanner.nextDouble();
				if (num >= 0) {
					break;
				}
				System.out.println("Invalid number. Must be positive or zero.");
			}

			System.out.println("Square root: " + Math.sqrt(num));

			while (true) {
				System.out.print("Do you want to insert another number to calculate its root (Y/N)? ");
				String ans = scanner.next();
				if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) {
					choice = ans.charAt(0);
					break;
				}
				System.out.println("Invalid input. Please enter Y or N.");
			}
		} while (choice == 'Y' || choice == 'y');
		scanner.close();
	}

	static int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		int inicio = 1;
		int fin = x;
		int respuesta = 0;

		while (inicio <= fin) {
			int medio = inicio + (fin - inicio) / 2;

			if (medio <= x / medio) {
				respuesta = medio;
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}

		return respuesta;
	}

	public static void main(String args[]) {
		int asdas = mySqrt(8);
		System.out.println("mysqrt is " + asdas);

	}

}
