import java.util.Scanner;
import java.util.Random;

// Define a class to encapsulate the game logic
class Game {
    private int randomNumber;  // Store the random number
    private int userGuess;     // Store the user's guess
    private int noOfGuesses;   // Count the number of guesses

    // Constructor to initialize the game
    public Game() {
        Random random = new Random();
        // Generate a random number between 1 and 100
        randomNumber = random.nextInt(100) + 1;
        noOfGuesses = 0;
    }

    // Method to take user's guess input
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        userGuess = scanner.nextInt();
        noOfGuesses++;
    }

    // Method to check if user's guess is correct
    public boolean isCorrectNumber() {
        return userGuess == randomNumber;
    }

    // Method to check if user's guess is greater than random number
    public boolean isGreaterThanRandom() {
        return userGuess > randomNumber;
    }

    // Method to get the number of guesses made by the user
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Method to get the random number
    public int getRandomNumber() {
        return randomNumber;
    }
}

// Main class to execute the game
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game game = new Game();  // Create an instance of the Game class

        System.out.println("Welcome to Guess the Number Game!");

        boolean isCorrect = false;  // Flag to track if the guess is correct

        // Loop until the user guesses the correct number
        while (!isCorrect) {
            game.takeUserInput();  // Take user's guess input
            if (game.isCorrectNumber()) {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                if (game.isGreaterThanRandom()) {
                    System.out.println("Try again. Hint: Your guess is greater than the random number.");
                } else {
                    System.out.println("Try again. Hint: Your guess is less than the random number.");
                }
            }
        }

        // Display the result
        System.out.println("The random number was: " + game.getRandomNumber());
        System.out.println("Number of guesses: " + game.getNoOfGuesses());
    }
}
