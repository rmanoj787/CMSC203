package CMSC203_Lab1;

import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a new Movie object
        Movie movie = new Movie();

        // Prompt the user for movie details
        System.out.print("Enter the name of a movie: ");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.print("Enter the rating of the movie: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of sold for this movie: ");
        int ticketsSold = scanner.nextInt();
        movie.setSoldTickets(ticketsSold);

        // Display the movie information
        System.out.println(movie.toString());

        // Close the scanner
        scanner.close();
    }
}
