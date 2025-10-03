import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0; 
        int count = 0;
        int num;
        boolean hasNumbers = false;

        System.out.println("Enter numbers, the input ends with 0 entered:");

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break; 
            }

            hasNumbers = true; 

            if (count == 0 || num > largest) {
                largest = num; 
                count = 1; 
            } else if (num == largest) {
                count++; 
            }
        }

        if (!hasNumbers) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }
}