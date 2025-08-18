import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate two random whole numbers between 0 and 100
        int num1 = (int) (Math.random() * 101); // multiply by 101 to include 100
        int num2 = (int) (Math.random() * 101);

        // Ask for the sum
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int sumAnswer = input.nextInt();
        boolean isSumCorrect = (sumAnswer == (num1 + num2));
        System.out.println(num1 + " + " + num2 + " = " + sumAnswer + " is " + isSumCorrect);

        // Ask for the modulus
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int modAnswer = input.nextInt();
        boolean isModCorrect = (modAnswer == (num1 % num2));
        System.out.println(num1 + " % " + num2 + " = " + modAnswer + " is " + isModCorrect);

    }
}

