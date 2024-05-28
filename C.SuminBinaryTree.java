 //Question 1 (C. Sum in Binary Tree)
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        long[] results = new long[t];
        
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            results[i] = calculateSum(n);
        }
        
        for (long result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    private static long calculateSum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n;
            n /= 2;
        }
        return sum;
    }
}
