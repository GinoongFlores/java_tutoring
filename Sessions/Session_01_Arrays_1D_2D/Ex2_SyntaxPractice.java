
// Save as: Ex2_SyntaxPractice.java
import java.util.Scanner;

public class Ex2_SyntaxPractice {

    // Same problem as Exercise 1, but key syntax is missing.
    // Copy this into Ex2_SyntaxPractice.java.
    //
    // 2D Array Example: 2 students, 2 quizzes
    // Quiz 0 Quiz 1
    // Stu 0 20 20 → average = 20.0
    // Stu 1 10 2 → average = 6.0
    // Class average = 13.0, Top student = 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of quizzes: ");
        int quizzes = sc.nextInt();

        // 2D array declaration + creation
        int[][] scores = _______ int[students][quizzes];

        // Fill the 2D array
        for (int i = 0; i _______ students; i++) {
            for (int j = 0; j < _______; j++) {
                System.out.print("Student " + (i + 1) + ", Quiz " + (j + 1) + " score: ");
                int value = sc.nextInt();
                scores[_______][_______] = value;
            }
        }

        // 1D array for averages
        double[] averages = new double[_______];

        double classTotal = 0.0;

        // Compute each student's average
        // Example: Student 0: total = 20 + 20 = 40, avg = 40.0 / 2 = 20.0
        // Example: Student 1: total = 10 + 2 = 12, avg = 12.0 / 2 = 6.0
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < quizzes; j++) {
                total += scores[i][j];
            }

            // Avoid integer division
            double avg = (double) total / _______;
            averages[i] = avg;
            classTotal += avg;
        }

        // Print report
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d average = %.2f%n", (i + 1), averages[_______]);
        }

        double classAvg = classTotal / students;
        System.out.printf("Class average = %.2f%n", classAvg);

        // Find top student
        int topIndex = 0;
        for (int i = 1; i < students; i++) {
            if (averages[i] > averages[topIndex]) {
                topIndex = i;
            }
        }
        System.out.println("Top student: " + (topIndex + 1));

        sc.close();
    }
}
