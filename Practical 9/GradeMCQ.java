import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array of answers (4 students × 6 questions)
        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},
            {'C', 'D', 'D', 'A', 'B', 'D'},
            {'D', 'D', 'A', 'B', 'B', 'A'},
            {'C', 'A', 'D', 'A', 'B', 'C'}
        };

        // 1D array for answer key
        char[] key = new char[6];

        System.out.println("Enter the key to the MCQ:");
        for (int i = 0; i < key.length; i++) {
            key[i] = sc.next().charAt(0);
        }

        System.out.println();

        // Compare each student's answers with the key
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }

            String result = (correctCount >= 3)
                    ? "passed the test."
                    : "failed the test.";

            System.out.println("Student " + i + "'s correct count is " + correctCount +
                               ". Therefore, he/she " + result);
        }
    }
}
