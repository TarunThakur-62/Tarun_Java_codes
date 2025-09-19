package method;
import java.util.Scanner;
public class ramdom { 
	    public static boolean isPositive(int number) {
	        return number > 0;
	    }
	    public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }
	    public static int compare(int number1, int number2) {
	        if (number1 > number2) {
	            return 1; 
	        } else if (number1 < number2) {
	            return -1; 
	        } else {
	            return 0; 
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	        for (int number : numbers) {
	            if (isPositive(number)) {
	                System.out.print(number + " is positive and ");
	                if (isEven(number)) {
	                    System.out.println("even.");
	                } else {
	                    System.out.println("odd.");
	                }
	            } else if (number < 0) {
	                System.out.println(number + " is negative.");
	            } else {
	                System.out.println(number + " is zero");
	            }
	        }
	        int firstElement = numbers[0];
	        int lastElement = numbers[numbers.length - 1];
	        int comparisonResult = compare(firstElement, lastElement);

	        if (comparisonResult == 1) {
	            System.out.println(firstElement + " (first element) is greater than " + lastElement + " (last element).");
	        } else if (comparisonResult == -1) {
	            System.out.println(firstElement + " (first element) is less than " + lastElement + " (last element).");
	        } else {
	            System.out.println(firstElement + " (first element) is equal to " + lastElement + " (last element).");
	        }
	    }
	}