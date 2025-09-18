package method;
import java.util.Scanner;
public class recursive {
	    public static long recursive (int n) {
	        if (n == 0) {
	            return 0;
	        } else {
	            return n + recursive(n - 1);
	        }
	    }
	    public static long sum(int n) {
	        return (long) n * (n + 1) / 2;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a natural number (n): ");
	        int n = scanner.nextInt();
	        if (n <= 0) {
	            System.out.println("Enter a positive natural number.");
	            scanner.close();
	            return;
	        }
	        long sumRecursive = recursive(n);
	        long sumFormula = sum(n);
	        System.out.println("Sum (Recursive Method): " + sumRecursive);
	        System.out.println("Sum (Formula Method): " + sumFormula);

	        if (sumRecursive == sumFormula) {
	            System.out.println("Both are match.");
	        } else {
	            System.out.println("Error: Two computations do not match.");
	        }
	        scanner.close();
	    }
	}