package CMSC203_Lab1;

import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
        	
            //Movie details
        	Movie movie = new Movie();
            System.out.print("Enter the name of a movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of sold for this movie: ");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold);

            // Consume newline 
            scanner.nextLine();

            // Display information
            System.out.println(movie.toString());

            // Ask if the user wants to continue
            System.out.print("Do you want to enter another? (y or n)? ");
            continueInput = scanner.nextLine();
            
        } while (continueInput.equalsIgnoreCase("y"));

        // Close the scanner
        scanner.close();
    }
}
