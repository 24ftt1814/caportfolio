import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        
        int rounds = 0;
        int userScore = 0;
        int compScore = 0;
        int userChoice, compChoice;

        String choice; 

        String[] names = {"rock", "paper", "scissor"};

        do {
           
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            userChoice = input.nextInt();
            compChoice = rand.nextInt(3);

            System.out.print("The computer is " + names[compChoice] + ". ");
            System.out.print("You are " + names[userChoice] + ". ");

      
            if (userChoice == compChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && compChoice == 2) || 
                       (userChoice == 1 && compChoice == 0) || 
                       (userChoice == 2 && compChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                compScore++;
            }

            rounds++; 

            System.out.print("Enter y to play again: ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("y"));


        System.out.println("In the total of " + rounds + " round(s), You scored " 
                           + userScore + ", Computer scored " + compScore);

        if (userScore > compScore) {
            System.out.println("You won the game.");
        } else if (userScore < compScore) {
            System.out.println("You lost the game.");
        } else {
            System.out.println("It is a draw game.");
        }

      
    }
}
