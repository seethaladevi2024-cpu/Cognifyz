import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Secret number chosen by the computer
        int secretNumber = 13;

        // Ask user for input
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Guess a number between 1 and 20: ");

        int userGuess = sc.nextInt();

        // Conditional statements for game logic
        if (userGuess == secretNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } 
        else if (userGuess > secretNumber) {
            System.out.println("Too high! Try again next time.");
        } 
        else {
            System.out.println("Too low! Try again next time.");
        }

        // Close scanner
        sc.close();
    }
}