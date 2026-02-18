// Save as: Ex1_Blueprint_ANSWER.java
// ANSWER KEY - INSTRUCTOR ONLY

import java.util.Scanner;

public class Ex1_Blueprint_ANSWER {

    // TOPIC: Single-dimensional (1D) and Multi-dimensional (2D) arrays
    // UNIVERSITY-STYLE PRACTICE: Gradebook Summary

    public static void main(String[] args) {
        // 1) Create a Scanner for input.
        Scanner sc = new Scanner(System.in);

        // 2) Ask the user for the number of students.
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // 3) Ask the user for the number of quizzes per student.
        System.out.print("Enter number of quizzes: ");
        int quizzes = sc.nextInt();

        // 4) Create a 2D int array named scores with size [students][quizzes].
        int[][] scores = new int[students][quizzes];

        // 5) Use nested loops to fill scores.
        // 2D Array Visualization (Example: 2 students, 2 quizzes):
        // Quiz 0 Quiz 1
        // Stu 0 20 20
        // Stu 1 10 2
        // In code: scores[0][0]=20, scores[0][1]=20, scores[1][0]=10, scores[1][1]=2
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.print("Student " + (i + 1) + ", Quiz " + (j + 1) + " score: ");
                scores[i][j] = sc.nextInt(); // Row i, Column j
            }
        }

        // 6) Create a 1D double array named averages with size [students].
        double[] averages = new double[students];

        // 7) For each student i, compute average.
        // For each row (student), sum all columns (quizzes) in that row.
        // Example: Student 0's scores are in row 0: scores[0][0], scores[0][1],
        // scores[0][2], ...
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < quizzes; j++) {
                total += scores[i][j]; // Add all quizzes for this student
            }
            double avg = (double) total / quizzes;
            averages[i] = avg;
        }

        // 8) Print a report:
        double classTotal = 0.0;
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d average = %.2f%n", (i + 1), averages[i]);
            classTotal += averages[i];
        }
        double classAvg = classTotal / students;
        System.out.printf("Class average = %.2f%n", classAvg);

        // 9) Find the top student (highest average, earliest on tie).
        int topIndex = 0;
        for (int i = 1; i < students; i++) {
            if (averages[i] > averages[topIndex]) {
                topIndex = i;
            }
        }
        System.out.println("Top student: " + (topIndex + 1));

        // 10) (Optional) Print the original 2D table of scores in a grid.
        System.out.println("\nScores by student and quiz:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < quizzes; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        // 11) Close the Scanner.
        sc.close();
    }
}
