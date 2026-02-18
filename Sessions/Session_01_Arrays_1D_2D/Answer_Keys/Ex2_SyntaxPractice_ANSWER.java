// Save as: Ex2_SyntaxPractice_ANSWER.java
// ANSWER KEY - INSTRUCTOR ONLY

import java.util.Scanner;

public class Ex2_SyntaxPractice_ANSWER {

    // Same problem as Exercise 1, but with blanks filled in.
    // This shows the correct syntax for array operations and loops.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of quizzes: ");
        int quizzes = sc.nextInt();

        // 2D array declaration + creation
        int[][] scores = new int[students][quizzes];

        // Fill the 2D array
        // 2D Array Visualization:
        //        Quiz 0   Quiz 1   Quiz 2  ...
        // Stu 0  [0][0]   [0][1]   [0][2]  ...
        // Stu 1  [1][0]   [1][1]   [1][2]  ...
        // Stu 2  [2][0]   [2][1]   [2][2]  ...
        // ...
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.print("Student " + (i + 1) + ", Quiz " + (j + 1) + " score: ");
                int value = sc.nextInt();
                scores[i][j] = value;  // Row i, Column j
            }
        }

        // 1D array for averages
        double[] averages = new double[students];

        double classTotal = 0.0;

        // Compute each student's average
        // For each row (student), sum all columns (quizzes) in that row.
        // Example: Student 0's scores are in row 0: scores[0][0], scores[0][1], scores[0][2], ...
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < quizzes; j++) {
                total += scores[i][j];  // Add all quizzes for this student
            }
            }

            // Avoid integer division
            double avg = (double) total / quizzes;
            averages[i] = avg;
            classTotal += avg;
        }

    // Print report
    for(

    int i = 0;i<students;i++)
    {
        System.out.printf("Student %d average = %.2f%n", (i + 1), averages[i]);
    }

    double classAvg = classTotal / students;System.out.printf("Class average = %.2f%n",classAvg);

    // Find top student
    int topIndex = 0;for(
    int i = 1;i<students;i++)
    {
        if (averages[i] > averages[topIndex]) {
            topIndex = i;
        }
    }System.out.println("Top student: "+(topIndex+1));

    sc.close();
}}
