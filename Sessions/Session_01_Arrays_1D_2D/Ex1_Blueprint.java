
// Save as: Ex1_Blueprint.java
import java.util.Scanner;

public class Ex1_Blueprint {

    // TOPIC: Single-dimensional (1D) and Multi-dimensional (2D) arrays
    // UNIVERSITY-STYLE PRACTICE: Gradebook Summary

    public static void main(String[] args) {
        // Copy this into Ex1_Blueprint.java.
        // Read the comments. Write the code under each comment.

        // 1) Create a Scanner for input.

        // 2) Ask the user for the number of students.
        // Example prompt: "Enter number of students: "

        // 3) Ask the user for the number of quizzes per student.
        // Example prompt: "Enter number of quizzes: "

        // 4) Create a 2D int array named scores with size [students][quizzes].
        // This is a MULTI-DIMENSIONAL array.

        // 5) Use nested loops to fill scores.
        // 2D Array Visualization (Example: 2 students, 2 quizzes):
        // Quiz 0 Quiz 1
        // Stu 0 20 20
        // Stu 1 10 2
        // For each student i, for each quiz j:
        // - prompt: "Student i, Quiz j score: " (use i+1 and j+1 for friendlier
        // numbering)
        // - read an int
        // - store it into scores[i][j]

        // 6) Create a 1D double array named averages with size [students].
        // This is a SINGLE-DIMENSION array.

        // 7) For each student i:
        // - compute the total of their quiz scores by looping j over scores[i]
        // Example: Student 0: 20 + 20 = 40, then 40 / 2 = 20.0
        // Example: Student 1: 10 + 2 = 12, then 12 / 2 = 6.0
        // - compute average = total / quizzes (make sure you get a double result)
        // - store it in averages[i]

        // 8) Print a report:
        // - For each student i print: "Student X average = Y" (format to 2 decimals)
        // - Then print the class average (average of the student averages)

        // 9) Find the top student:
        // - the student index with the highest average
        // - if there is a tie, keep the earlier student
        // - print: "Top student: X"

        // 10) (Optional but good practice)
        // Print the original 2D table of scores in a grid.

        // 11) Close the Scanner.

        // NOTE: You should NOT use packages or external libraries.
        // NOTE: Common gotcha: integer division. Use (double) total or a double total.
    }
}
