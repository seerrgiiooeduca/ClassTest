package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;

public class TeacherExercise {

	public static void main(String arg[]) {
		int rand=0;
		
		int userChoose = -1, userAttempts = 0;
		ArrayList<Integer> usernumbers = new ArrayList<>();
		
		rand=(int)(Math.random()*100);
		System.out.println(rand);
		Scanner asker = new Scanner(System.in);
		
		System.out.println("You have to guess a number between 1 and 100");
		
		while(rand != userChoose) {
			System.out.println("What is your guess?");
			userChoose = asker.nextInt();
			userAttempts++;
			usernumbers.add(userChoose);
			if (userChoose <rand) {
				System.out.println("Too low!");
				
			} else if (userChoose > rand) {
				System.out.println("Too high!");
			}
		}
		 
		StringJoiner UserNumbersJoiner = new StringJoiner(", ");
		for(int i = 0; i<userAttempts; i++) {
			Collections.sort(usernumbers);
			UserNumbersJoiner.add(String.valueOf(usernumbers.get(i)));
		}
		System.out.println("Congrats! You have done " + userAttempts + " attempts. You said previously: " + UserNumbersJoiner);
		asker.close();
	}
}
