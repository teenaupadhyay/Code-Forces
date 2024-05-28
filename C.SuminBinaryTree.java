 //Question 1 (C. Sum in Binary Tree)
// The root of the tree has vertex number 1.
// Each vertex has exactly two children, numbered consecutively.
// The children of a vertex i are 2*i and 2*i + 1.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read number of test cases
        long[] results = new long[t];// Create an array to store the results
        long x=results.length;

        for (int i = 0; i < t; i++) { // Loop through each test case
            long n = scanner.nextLong(); // Read the vertex number for this test case
            results[i] = calculateSum(n); // Calculate the sum and store it in the array
        }
        for (int i = 0; i < x; i++) { // Traditional for loop to iterate over each result
            System.out.println(results[i]); // Print each result
        }
        scanner.close(); // Close the scanner
    }
    private static long calculateSum(long n) {
        long sum = 0; // Initialize sum to 0
        while (n > 0) { // Loop until n becomes 0
            sum += n; // Add current value of n to sum
            n /= 2; // Move to the parent node
        }
        return sum; // Return the calculated sum
    }
}


// This solution efficiently computes the desired sum for each test case with a time complexity of 
// 𝑂(log𝑛)
// O(logn) per test case, which is efficient given the constraints.
