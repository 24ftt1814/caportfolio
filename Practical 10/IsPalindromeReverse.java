import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100; 
        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = sc.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = sc.nextInt();
        }

        int reversed = reverse(number);
        boolean result = isPalindrome(userInput, reversed);

        System.out.println("\nThe digit " + userInput + " is palindrome of " + number + " is " + result + ".");
    }


    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int userInput, int reversed) {
        return userInput == reversed;
    }
}

