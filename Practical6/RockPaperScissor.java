
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(System.currentTimeMillis() % 100000) % 3;

        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();

        String[] names = {"rock", "paper", "scissor"};

        System.out.println("The computer is " + names[computer] + ". You are " + names[user] + ".");

        
        if (user == computer)
            System.out.println("It is a draw.");

        if (user == 0 && computer == 2)
            System.out.println("You Win.");
        if (user == 0 && computer == 1)
            System.out.println("You Lose.");

        if (user == 1 && computer == 0)
            System.out.println("You Win.");
        if (user == 1 && computer == 2)
            System.out.println("You Lose.");

        if (user == 2 && computer == 1)
            System.out.println("You Win.");
        if (user == 2 && computer == 0)
            System.out.println("You Lose.");

        
    }
}
