package Test;
import java.util.Scanner;

public class ClassTest {
	public static void main(String args[]) {
		Scanner mainScanner = new Scanner(System.in);
//		ScannerExam();
//		twoDecimalsAverage(mainScanner);
		mainScanner.close();
	}
	
	public static void Exercise1(double EURO) {
		System.out.println("We have:" + EURO + "€");
	}
	
	static void Exercise2() {
		/* 
		
		Initialize the variables
		
		This means we create the variables to be usable, but we don't give them a value
		
		*/
		
		int FirstNumber ,SecondNumber, Addition, Substraction, Multiply, Division, Reminder;
		
		try (Scanner FirstNumberScanner = new Scanner(System.in)) {
			System.out.println("What's the value for the first number?");
			FirstNumber = FirstNumberScanner.nextInt();
		}
		try (Scanner SecondNumberScanner = new Scanner(System.in)) {
			System.out.println("What's the value for the second number?");
			SecondNumber = SecondNumberScanner.nextInt();
		}
		
		
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
	
	static void ScannerExam() {
		/* 
		 * This is like an exam for my own. I have to create an input. Ask for a char (DNI letter) and a float (DNI numbers) 
		 */
		
        char[] asignacionLetras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 
                'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 
                'Q', 'V', 'H', 'L', 'C', 'K', 'E'
            };
        
		
		Scanner DNI_Char = new Scanner(System.in);
		int numerosDNI;
		char letraDNI;

		while (true) {
			System.out.println("What's you DNI? (Max 8 characters)");
			numerosDNI = DNI_Char.nextInt();
			int DNI_Length = String.valueOf(numerosDNI).length();
			if(DNI_Length != 8) {
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
				System.out.println("You gave thursday")
				;break;
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
			for (position=0;position<=(gottenWord.length());position++) {
				char character;
				if (position == gottenWord.length()) {return;}
				character = gottenWord.charAt(position);
				int ascii = (int) character;
				asciiWord = asciiWord + " " + ascii;
				System.out.println("Got position " + position + " into ascii it is " + ascii + " and the new asciiWord is " + asciiWord);
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
		System.out.println(	"*. int 1 * int 2");
		System.out.println(	"+. int 1 + int 2");
		System.out.println(	"-. int 1 - int 2");
		System.out.println(	"/. int 1 / int 2");
		System.out.println(	"%. int 1  int 2");
		
		option = mainScanner.next().charAt(0);
		switch(option) {
		case '*':
			System.out.println("The result is " + firstInt*secondInt);
			break;
		case '+':
			System.out.println("The result is " + (firstInt+secondInt));
			break;
		case '-':
			System.out.println("The result is " + (firstInt-secondInt));
			break;
		case '/':		
			System.out.println("The result is " + firstInt/secondInt);
			break;
		case '%':
			System.out.println("The result is " + firstInt%secondInt);
			break;
		default:
			System.out.println("This option does not exist");
			return;
		}
		
	}
	
	static void twoDecimalsAverage(Scanner mainScanner) {
		int count = 0, howManyNumbersDoWeHave = 0;
		System.out.println("How many numbers are you gonna give me");
		if(mainScanner.hasNextInt()) {
			count = mainScanner.nextInt();
		} else {
			System.out.println("You gave shit, try again");
			mainScanner.next();
		}
		
		
		double average = 0, numberList[] = new double[count];

		while(count > howManyNumbersDoWeHave) {
			System.out.println("Give me a number");
			if(mainScanner.hasNextDouble()) {
				numberList[howManyNumbersDoWeHave] = mainScanner.nextDouble();
				howManyNumbersDoWeHave++;
			} else {
				System.out.println("You gave shit, try again");
				mainScanner.next();
			}
			
		}
				
		for(int i = 0; i<numberList.length; i++) {
			average = average + numberList[i];
		}
				
		System.out.printf("The average of our numbers is: %.2f", average / count);
		
	}
	
	
	static void parseExample() {
		
	}
}
