package Test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassTest {
	public static void main(String args[]) {
		activity17();
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
		
		Scanner FirstNumberScanner = new Scanner(System.in);
		System.out.println("What's the value for the first number?");
		FirstNumber = FirstNumberScanner.nextInt();
		Scanner SecondNumberScanner = new Scanner(System.in);
		System.out.println("What's the value for the second number?");
		SecondNumber = SecondNumberScanner.nextInt();
		
		/*
		 * Now what we do here is modifying the values of FirstNumber and SecondNumber.
		 * Then we modify the value of Result calculating the addition of both values.
		 */
				
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
	
	static void Exercise3() {
		int i = -3;
		byte b = 5;
		float f = 1e-10f;
		double d = 3.14;
		boolean b1 = i > i;
		boolean b2 = i < b;
		boolean b3 = b <=f;
		boolean b4 = f >= d;
		boolean b5 = d!=0;
		boolean b6 = 1==f;
		System.out.println("b1:" + i + ">" + i + "="+b1);
		System.out.println("b2:" + i + "<" + b + "="+b2);
		System.out.println("b3:" + b + "<=" + f + "="+b3);
		System.out.println("b4:" + f + ">=" + d + "="+b4);
		System.out.println("b5:" + d + "!=" + 0 + "="+b5);
		System.out.println("b6:" + 1 + "==" + f + "="+b6);
	}
	
	static void Exercise4() {
		
		int operation = ((4-2) * (5+1)/2);
		int op2= 2 - (4+3);
		boolean b=operation>op2;
		
		System.out.println("First math is: " + operation + " and then second math is: " + op2 + " so then the comparation of  operation > op2 " + b);
	}
	
	static void ScannerExample() {
		try (Scanner newScanner = new Scanner(System.in)) {
			System.out.println("Give me a number");
			while (true) {
				if (newScanner.hasNextInt()) {
					System.out.println("Player gave the number:" + newScanner.nextInt()); 
					break;
				} else {
					throw new InputMismatchException("User gave shit ");
				}
			}
		} 
		catch(Exception e) {
			System.out.println("We fucked up some how and got: " + e.getMessage() );
		}
	}
	
	static void ScannerExam() {
		/* 
		 * This is like an exam for my own. I have to create an input. Ask for a char (DNI letter) and a float (DNI numbers) 
		 */
		
		Scanner DNI_Char = new Scanner(System.in);
		String letraDNI, numerosDNI;
		while (true) {
			
			System.out.println("What's your DNI letter");
			letraDNI = DNI_Char.nextLine();
			
			if(letraDNI.length() != 1 || !Character.isLetter(letraDNI.charAt(0))) {
				System.out.println("You have to give us your DNI letter");
				continue;
			} 
			break;
		}
		
		while (true) {
			System.out.println("What's you DNI? (Max 8 characters)");
			numerosDNI = DNI_Char.nextLine();
			
			if(numerosDNI.length() != 8) {
				System.out.println("You gave " + numerosDNI.length() + " when we asked for 8 numbers. Try again");
				continue;
			}			
			break;
		}
		
		String fullDNI = numerosDNI + letraDNI.toUpperCase();
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
		int result = (int)floatExample;
		
		System.out.println(result); // Here the print is not "12345.56789", it is printing "123456" because we using the double as an integer
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
		short i;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Tell me your number");
		i = lector.nextShort();
		
		if (i > 0) {
			System.out.println("I is positive");
		} else if (i < 0) {
			System.out.println("J is negative");
		} else {
			System.out.println("I is 0");
		}
	}
	
	static void parseExample() {
		
	}
}
