import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		char answer;
		
		do {
			Movie firstMovie = new Movie();
			
			System.out.println("Enter the name of a movie: ");
			String theTitle = userInput.nextLine();
			firstMovie.setTitle(theTitle);
			
			System.out.println("Enter the raiting of the movie: ");
			String theRaiting = userInput.nextLine();
			firstMovie.setRating(theRaiting);
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			int numTickets = userInput.nextInt();
			firstMovie.setSoldTickets(numTickets);
			
			System.out.println(firstMovie.toString());
			
			System.out.println("Do you want to enter another? (yes or no)");
			//answer = userInput.nextLine();
			answer = userInput.next().toLowerCase().charAt(0);
			userInput.nextLine();
		}
		while(answer != 'n');
			System.out.println("Goodbye");

		
		
	}

}
