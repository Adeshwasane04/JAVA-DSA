package Arrays;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            // Generate a random choice for the computer
            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            // Ask the user for their choice
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Check if the user's choice is valid
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie! Both chose " + userChoice + ".");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win! Your choice (" + userChoice + ") beats the computer's choice (" + computerChoice + ").");
            } else {
                System.out.println("You lose! The computer's choice (" + computerChoice + ") beats your choice (" + userChoice + ").");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }

        scanner.close();
    }
}

    

