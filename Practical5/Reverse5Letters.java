import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = scanner.nextLine();

        if (word.length() == 5) {
            String reverseWord = "";
            reverseWord += word.charAt(4);
            reverseWord += word.charAt(3);
            reverseWord += word.charAt(2);
            reverseWord += word.charAt(1);
            reverseWord += word.charAt(0);

            
            System.out.println("The reverse of the word " + word + " is " + reverseWord);
        } else {
            System.out.println("Invalid input! Please run the program again and enter exactly 5 letters.");
        }

        
    }
}