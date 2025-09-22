import java.util.Scanner;
import java.util.Random;


public class NumberGuess {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		int computerGuess = random.nextInt(1,100);
		boolean gameIsOn = true;
		
		System.out.println("The computer has guessed a secret number between (1-100)");
		System.out.print("Guess the number: ");
		int userGuess = scanner.nextInt();
		while(gameIsOn){
			if(userGuess == computerGuess){
				System.out.println("Correct!! You win.");
				gameIsOn = false;
			}
			if(userGuess > computerGuess){
				scanner.nextLine();
				System.out.print("Too high, try again: ");
				userGuess = scanner.nextInt();
			} else if (userGuess < computerGuess){
				scanner.nextLine();
				System.out.print("Too low, try again: ");
				userGuess = scanner.nextInt();
			}
		}
		
		
		
		scanner.close();
	}
}