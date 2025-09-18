package controlflow;
import java.util.Scanner;
public class multiple {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number;
	        while (true) {
	            System.out.print("Positive no. less than 100: ");
	            if (scanner.hasNextInt()) {
	                number = scanner.nextInt();
	                if (number > 0 && number < 100) {
	                    break;
	                } else {
	                    System.out.println("Invalid input.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter an integer.");
	                scanner.next(); 
	            }
	        }
	        System.out.println("Multiples of " + number + " below 100:");
	        for (int i = 99; i >= 1; i--) { 
	            if (i % number == 0) { 
	                System.out.println(i);
	            }
	        }
	    }
	}