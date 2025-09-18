package array;
import java.util.Scanner;
public class oprater {
	    public static void main(String[] args) {
	        double[] numbers = new double[10];
	        double total = 0.0;
	        int index = 0;

	        Scanner input = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter a number: ");
	            double userEntry = input.nextDouble();
	            if (userEntry <= 0) {
	                break;
	            }
	            if (index == 10) {
	                System.out.println("Array is full.");
	                break;
	            }
	            numbers[index] = userEntry;
	            index++;
	        }
	        for (int i = 0; i < index; i++) {
	            System.out.println(numbers[i]);
	            total += numbers[i];
	        }
	        System.out.println("\nSum of all numbers: " + total);
	    }
}