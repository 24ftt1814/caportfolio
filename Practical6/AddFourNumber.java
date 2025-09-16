import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int num1 = rand.nextInt(100);
    int num2 = rand.nextInt(100);
    int num3 = rand.nextInt(100);
    int num4 = rand.nextInt(100);

    int correctSum = num1 + num2 + num3 + num4;

    System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + "?");
    int Answer = input.nextInt();

     if (Answer == correctSum) {
         System.out.println("Well done , you are correct!");
    } 
    else {
        System.out.println("Nice try, the sum should be " + correctSum);
    }
    }
}
