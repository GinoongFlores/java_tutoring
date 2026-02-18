// Save as: Ex1_Blueprint.java
// GOAL: Learn the logic of checking if an array is a palindrome
// A palindrome array reads the same forwards and backwards

public class Ex1_Blueprint {

    // PROBLEM: Check if an integer array is a palindrome
    // Example: [1, 2, 3, 2, 1] → true (reads same forwards and backwards)
    // Example: [1, 2, 3, 4, 5] → false
    // Example: [7] → true (single element is always a palindrome)
    // Example: [5, 5] → true (two same elements)
    
    // STUDENT TODO: Write this method
    // Hint: Use a two-pointer approach
    // - One pointer starts at the beginning (index 0)
    // - One pointer starts at the end (index arr.length - 1)
    // - Compare elements and move pointers toward the center
    public static boolean isPalindrome(int[] arr) {
        
        // Step 1: Handle empty array
        // An empty array is considered a palindrome
        // Hint: if arr.length == 0, return true
        
        
        // Step 2: Create two pointers
        // left pointer starts at index 0
        // right pointer starts at the last index (arr.length - 1)
        
        
        // Step 3: Loop while left < right
        // In each iteration:
        //   - Compare arr[left] with arr[right]
        //   - If they're different, it's NOT a palindrome, return false
        //   - If they're the same, move left forward (left++) and right backward (right--)
        
        
        // Step 4: If the loop finishes without finding a mismatch, it's a palindrome
        // return true
        
        return false; // REPLACE THIS after writing your code
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
