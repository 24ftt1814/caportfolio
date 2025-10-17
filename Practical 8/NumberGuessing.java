import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Create an array with 10 integers (0–9)
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        // 2) Shuffle the array once
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        // 3) Game variables
        int chances = 10; // total tries
        boolean win = false;

        // 4) Game loop
        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = sc.nextInt();
            }

            // 5) Check how many guesses are correct (right number + position)
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            chances--;

            if (score == 4) {
                System.out.println("You have score 4 out of the 4 numbers. You won!");
                win = true;
                break;
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }

        // 6) If user loses all chances
        if (!win) {
            System.out.println("Game over! The correct numbers were:");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}
