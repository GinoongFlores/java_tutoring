// Save as: Ex3_ExamSim.java
// GOAL: Apply palindrome logic to a slightly different problem
// Check if a SUBARRAY (portion) of an array is a palindrome

public class Ex3_ExamSim {

    // PROBLEM:
    // You are given a large array of integers and two indices: startIdx and endIdx
    // Your task is to check if the elements from startIdx to endIdx (inclusive) form a palindrome
    //
    // Example: arr = [5, 1, 2, 3, 2, 1, 7]
    //          isSubarrayPalindrome(arr, 1, 5) → checks [1, 2, 3, 2, 1] → true
    //          isSubarrayPalindrome(arr, 0, 2) → checks [5, 1, 2] → false
    //
    // Required Method Signature:
    // public static boolean isSubarrayPalindrome(int[] arr, int startIdx, int endIdx)
    //
    // Hint: This is similar to Ex1 and Ex2, but instead of starting at 0 and arr.length-1,
    //       you start at startIdx and endIdx, and compare elements within that range

    // STUDENT TODO: Write this method
    public static boolean isSubarrayPalindrome(int[] arr, int startIdx, int endIdx) {
        // ... write your code here ...
        return false;
    }

    // TEST HARNESS (Do not edit)
    public static void main(String[] args) {
        // Test Case 1: Check subarray [1, 2, 3, 2, 1] in array [5, 1, 2, 3, 2, 1, 7]
        int[] test1 = {5, 1, 2, 3, 2, 1, 7};
        if (isSubarrayPalindrome(test1, 1, 5)) System.out.println("Test 1: PASS");
        else System.out.println("Test 1: FAIL (Expected true)");

        // Test Case 2: Check subarray [5, 1, 2] - not a palindrome
        int[] test2 = {5, 1, 2, 3, 2, 1, 7};
        if (!isSubarrayPalindrome(test2, 0, 2)) System.out.println("Test 2: PASS");
        else System.out.println("Test 2: FAIL (Expected false)");

        // Test Case 3: Check single element [7] - always a palindrome
        int[] test3 = {5, 1, 2, 3, 2, 1, 7};
        if (isSubarrayPalindrome(test3, 6, 6)) System.out.println("Test 3: PASS");
        else System.out.println("Test 3: FAIL (Expected true)");

        // Test Case 4: Check entire array [9, 4, 5, 4, 9] - is a palindrome
        int[] test4 = {9, 4, 5, 4, 9};
        if (isSubarrayPalindrome(test4, 0, 4)) System.out.println("Test 4: PASS");
        else System.out.println("Test 4: FAIL (Expected true)");

        // Test Case 5: Check subarray [4, 5, 4] in the middle
        int[] test5 = {9, 4, 5, 4, 9};
        if (isSubarrayPalindrome(test5, 1, 3)) System.out.println("Test 5: PASS");
        else System.out.println("Test 5: FAIL (Expected true)");
    }
}
