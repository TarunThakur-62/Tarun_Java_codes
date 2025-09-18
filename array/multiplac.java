package array;
import java.util.Scanner;
public class multiplac { 
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); 
	        System.out.print("Enter an integer: ");
	        int number = input.nextInt(); 
	        int[] multiplicationResults = new int[10]; 
	        for (int i = 0; i < 10; i++) {
	            multiplicationResults[i] = number * (i + 1); 
	        }
	        System.out.println("\nMultiplication Table of " + number + ":");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
	        }
	    }
	}