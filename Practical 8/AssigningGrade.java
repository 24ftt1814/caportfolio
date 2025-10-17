import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Capture number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] scores = new int[numStudents];  // for storing scores
        char[] grades = new char[numStudents]; // for storing grades
        int best = 0;

        // 2) Input scores and find the best score
        System.out.println("Enter the " + numStudents + " scores");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        // 3) Assign grades based on the best score
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // 4) Display results
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}

