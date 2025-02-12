/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: A computer science course to learn the fundamental computer concepts
 * Due: 02/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Rhys Manoj
*/


package Assignments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        final String FILE_NAME = "colors.txt";
        final int rounds = 3;
        int points = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Define individual color variables
        String COLOR_1 = null, COLOR_2 = null, COLOR_3 = null, COLOR_4 = null, COLOR_5 = null;
        String COLOR_6 = null, COLOR_7 = null, COLOR_8 = null, COLOR_9 = null, COLOR_10 = null;
        String COLOR_11 = null, COLOR_12 = null, COLOR_13 = null, COLOR_14 = null, COLOR_15 = null, COLOR_16 = null;

        // Read colors from file
        File file = new File(FILE_NAME);
        
        // Game loop
        while (true) {
            System.out.println("Welcome to ESP - extrasensory perception!");
            System.out.println("1- Read and display on the screen first 16 names of colors from a file colors.txt.");
            System.out.println("2- Read and display on the screen first 10 names of colors from a file colors.txt.");
            System.out.println("3- Read and display on the screen first 5 names of colors from a file colors.txt.");
            System.out.println("4- Exit from a program");
            System.out.print("Please choose an option: ");
            
            int option = input.nextInt();
            int limit = 0;
            input.nextLine(); // consume newline
            
            // If each option is selected
            if (option == 1) {
                limit = 16;
            } else if (option == 2) {
                limit = 10;
            } else if (option == 3) {
                limit = 5;
            } else if (option == 4) {
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Describe yourself: ");
                String description = input.nextLine();
                System.out.print("Due Date: ");
                String dueDate = input.nextLine();
                try {
                    FileWriter writer = new FileWriter("EspGameResults.txt");
                    writer.write("Game Over\n");
                    writer.write("You guessed " + points + " out of " + rounds + " colors correctly.\n");
                    writer.write("Due Date: " + dueDate + "\n");
                    writer.write("Username: " + name + "\n");
                    writer.write("User Description: " + description + "\n");
                    writer.write("Date: " + dueDate + "\n");
                    writer.close();  // Ensure you close the writer
                    System.out.println("Results saved in EspGameResults.txt");
                } catch (Exception e) {
                    System.out.println("Error writing to file.");
                }
                break; // Exit the loop after writing results
            }
 
            try {
                Scanner fileScanner = new Scanner(file);
                
                // Read the specified number of colors from the file
                for (int i = 1; i <= limit && fileScanner.hasNextLine(); i++) {
                    String color = fileScanner.nextLine();
                    if (i == 1) COLOR_1 = color;
                    else if (i == 2) COLOR_2 = color;
                    else if (i == 3) COLOR_3 = color;
                    else if (i == 4) COLOR_4 = color;
                    else if (i == 5) COLOR_5 = color;
                    else if (i == 6) COLOR_6 = color;
                    else if (i == 7) COLOR_7 = color;
                    else if (i == 8) COLOR_8 = color;
                    else if (i == 9) COLOR_9 = color;
                    else if (i == 10) COLOR_10 = color;
                    else if (i == 11) COLOR_11 = color;
                    else if (i == 12) COLOR_12 = color;
                    else if (i == 13) COLOR_13 = color;
                    else if (i == 14) COLOR_14 = color;
                    else if (i == 15) COLOR_15 = color;
                    else if (i == 16) COLOR_16 = color;
                    System.out.println("Color " + i + ": " + color);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
                return;
            }
            
            // Randomly choose a color from the list of variables
            for (int round = 1; round <= rounds; round++) {
                int randomColor = random.nextInt(limit) + 1;  // Generate random number between 1 and limit
                String selectedColor = "";

                // Use if-else to select the correct color
                if (randomColor == 1) selectedColor = COLOR_1;
                else if (randomColor == 2) selectedColor = COLOR_2;
                else if (randomColor == 3) selectedColor = COLOR_3;
                else if (randomColor == 4) selectedColor = COLOR_4;
                else if (randomColor == 5) selectedColor = COLOR_5;
                else if (randomColor == 6) selectedColor = COLOR_6;
                else if (randomColor == 7) selectedColor = COLOR_7;
                else if (randomColor == 8) selectedColor = COLOR_8;
                else if (randomColor == 9) selectedColor = COLOR_9;
                else if (randomColor == 10) selectedColor = COLOR_10;
                else if (randomColor == 11) selectedColor = COLOR_11;
                else if (randomColor == 12) selectedColor = COLOR_12;
                else if (randomColor == 13) selectedColor = COLOR_13;
                else if (randomColor == 14) selectedColor = COLOR_14;
                else if (randomColor == 15) selectedColor = COLOR_15;
                else if (randomColor == 16) selectedColor = COLOR_16;
                
                // Getting user's guess and checking it
                System.out.println("Round " + round);
                System.out.println("I am thinking of a color. Enter your guess:");
                String userGuess = input.nextLine();
                
                if (userGuess.equalsIgnoreCase(selectedColor)) {
                    System.out.println("Correct! I was thinking of " + selectedColor + ".");
                    points++;
                } else {
                    System.out.println("Wrong! I was thinking of " + selectedColor + ".");
                }
            }
            
            // Results
            System.out.println("Game Over");
            System.out.println("You guessed " + points + " out of " + rounds + " correctly.");
            
            // Ask to replay the game
            System.out.println("Would you like to play again? (Yes/No)");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("No")) {
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.print("Describe yourself: ");
                String description = input.nextLine();
                System.out.print("Due Date: ");
                String dueDate = input.nextLine();
                try {
                    FileWriter writer = new FileWriter("EspGameResults.txt");
                    writer.write("Game Over\n");
                    writer.write("You guessed " + points + " out of " + rounds + " colors correctly.\n");
                    writer.write("Due Date: " + dueDate + "\n");
                    writer.write("Username: " + name + "\n");
                    writer.write("User Description: " + description + "\n");
                    writer.write("Date: " + dueDate + "\n");
                    writer.close();  // Ensure you close the writer
                } catch (Exception e) {
                    System.out.println("Error writing to file.");
                }
            }
            
            // Close the scanner and exit
            input.close();
            System.out.println("Thanks for playing!");
        }
    }
}
