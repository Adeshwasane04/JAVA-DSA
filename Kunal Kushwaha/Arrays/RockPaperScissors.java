package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Let's play Rock, Paper, Scissors!");
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

            System.out.print("Computer chose: ");
            switch (computerChoice) {
                case 0:
                    System.out.println("rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("scissors");
                    break;
            }

            int result = determineWinner(userChoice, computerChoice);
            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }

        scanner.close();
    }

    private static int determineWinner(String userChoice, int computerChoice) {
        // 0 for tie, 1 for user win, -1 for computer win

        if (userChoice.equals("rock") && computerChoice == 2 ||
            userChoice.equals("paper") && computerChoice == 0 ||
            userChoice.equals("scissors") && computerChoice == 1) {
            return 1;
        } else if (userChoice.equals("rock") && computerChoice == 1 ||
                   userChoice.equals("paper") && computerChoice == 2 ||
                   userChoice.equals("scissors") && computerChoice == 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

    
