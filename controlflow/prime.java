package controlflow;
import java.util.Scanner;
public class prime {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Number: ");
	        int n = scanner.nextInt();

	        boolean isPrime = true;
	        if (n <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i < n; i++) {
	                if (n % i == 0) { 
	                    isPrime = false; 
	                    break;
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println(n + " Prime number.");
	        } else {
	            System.out.println(n+ " Not prime number.");
	        }
	    }
	}