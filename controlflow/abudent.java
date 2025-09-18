package controlflow;
import java.util.Scanner;
public class abudent {
	    public static void main(String[] args) {
	        Scanner inputScanner = new Scanner(System.in);
	        System.out.print("Integer: ");
	        int number = inputScanner.nextInt(); 

	        int sumOfDivisors = 0; 
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sumOfDivisors += i;
	            }
	        }
	        if (sumOfDivisors > number) {
	            System.out.println(number + " Abundant Number.");
	        } else {
	            System.out.println(number + " Not Abundant Number.");
	        }
	    }
	}