package controlflow;
import java.util.Scanner;
public class highestno {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first number:");
	        int number1 = scanner.nextInt();

	        System.out.println("Enter the second number:");
	        int number2 = scanner.nextInt();

	        System.out.println("Enter the third number:");
	        int number3 = scanner.nextInt();

	        if (number1 >= number2 && number1 >= number3) {
	            System.out.println("The first number (" + number1 + ") is the largest.");
	        } else if (number2 >= number1 && number2 >= number3) {
	            System.out.println("The second number (" + number2 + ") is the largest.");
	        } else {
	            System.out.println("The third number (" + number3 + ") is the largest.");
	        }

	        scanner.close();
	    }
	}