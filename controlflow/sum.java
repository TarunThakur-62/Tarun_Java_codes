package controlflow;
import java.util.Scanner;
public class sum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        int sum = 0; 
	        int number; 
	        System.out.println("Nmbers to sum");
	        while (true) { 
	            System.out.print("Enter a number: ");
	            number = scanner.nextInt();
	            if (number >=0) { 
	                break; 
	            }
	            sum += number; 
	        }
	        System.out.println("The sum of the positive numbers entered is: " + sum);
	        scanner.close(); 
	    }
	}