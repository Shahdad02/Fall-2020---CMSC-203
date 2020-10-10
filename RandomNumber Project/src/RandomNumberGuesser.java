import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		int randNum, nextGuess, 
		highGuess = 100, lowGuess = 0;
		boolean userCorrect = false;
		
		Scanner input = new Scanner(System.in);
		
		RNG.resetCount();
		randNum = RNG.rand();
		System.out.println("Enter your first guess: ");
		while(!userCorrect) { 
			nextGuess = input.nextInt();
			
			if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
				
				if(nextGuess > randNum) {
					highGuess = nextGuess;
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess is too high");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				}
				else if(nextGuess < randNum) {
					lowGuess = nextGuess;
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess is too low");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				}
				else {
					userCorrect = true;
					System.out.println("Congratulations, you guessed correctly");
				}
			}
		}
	
		System.out.println("Thanks for playing...");
		System.exit(0);
	}

}
