// Save as: Ex2_SyntaxPractice.java
// GOAL: Build muscle memory for syntax
// Fill in the blanks to complete the palindrome checker

public class Ex2_SyntaxPractice {

    // PROBLEM: Check if an integer array is a palindrome
    // Fill in the blanks (marked with _______) to complete the method
    public static boolean isPalindrome(int[] arr) {
        
        // Handle empty array
        if (arr.length == 0) {
            return true;
        }

        // Create two pointers: one at the start, one at the end
        int left = _______;  // BLANK: What index does the left pointer start at?
        int right = _______;  // BLANK: What is the last valid index?

        // Loop condition: continue while left pointer is before right pointer
        while (left _______ right) {  // BLANK: What comparison should we use? <, >, <=, >=?
            
            // Check if elements at left and right don't match
            if (arr[left] _______ arr[right]) {  // BLANK: What operator checks "not equal"?
                return false;  // Not a palindrome
            }

            // Move pointers toward the center
            left_______;  // BLANK: How do we increment left? (left++ or ++left)
            right_______;  // BLANK: How do we decrement right? (right-- or --right)
        }

        // If we get here, all elements matched
        return true;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 2, 1};
        if (isPalindrome(test1)) System.out.println("Test 1: PASS");
        else System.out.println("Test 1: FAIL (Expected true, got false)");

        int[] test2 = {1, 2, 3, 4, 5};
        if (!isPalindrome(test2)) System.out.println("Test 2: PASS");
        else System.out.println("Test 2: FAIL (Expected false, got true)");

        int[] test3 = {7};
        if (isPalindrome(test3)) System.out.println("Test 3: PASS");
        else System.out.println("Test 3: FAIL (Expected true, got false)");

        int[] test4 = {5, 5};
        if (isPalindrome(test4)) System.out.println("Test 4: PASS");
        else System.out.println("Test 4: FAIL (Expected true, got false)");
    }
}
