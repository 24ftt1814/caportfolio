import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Ask the user for the number of numbers
        System.out.print("How many numbers are there? ");
        int count = sc.nextInt();

        int[] numbers = new int[count];

        // 2) Capture the numbers
        System.out.println("Enter the " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        // 3) Ask for number of shifts
        System.out.print("Enter number of left shift: ");
        int shifts = sc.nextInt();

        // 4) Perform the shifting (repeat the shift operation)
        for (int s = 0; s < shifts; s++) {
            int first = numbers[0];
            for (int i = 0; i < count - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[count - 1] = first;
        }

        // 5) Output result
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
