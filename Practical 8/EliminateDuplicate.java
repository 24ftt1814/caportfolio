import java.util.*;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input validation: ensure numbers are between 1–9
        System.out.println("Enter 10 numbers (between 1 and 9):");
        for (int i = 0; i < 10; i++) {
            int num;
            while (true) {
                try {
                    num = sc.nextInt();
                    if (num >= 1 && num <= 9) {
                        numbers[i] = num;
                        break;
                    } else {
                        System.out.print("Number must be 1–9. Try again: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Enter a number: ");
                    sc.next(); // discard invalid input
                }
            }
        }

        // Eliminate duplicates using a Set
        Set<Integer> uniqueNumbers = new TreeSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num); // TreeSet keeps it sorted
        }

        // Display results
        System.out.print("The distinct numbers are: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
