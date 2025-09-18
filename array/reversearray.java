package array;
import java.util.Scanner;
public class reversearray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (number == 0) {
	            System.out.println("Reversed number: 0");
	            scanner.close();
	            return;
	        }
	        int temp = number;
	        int Count = 0;
	        while (temp != 0) {
	            temp /= 10;
	            Count++;
	        }
	        int[] digits = new int[Count];
	        int index = 0;
	        temp = number;
	        while (temp != 0) {
	            digits[index] = temp % 10;
	            temp /= 10; 
	            index++;
	        }
	        System.out.print("Reversed number: ");
	        for (int i = 0; i < Count; i++) {
	            System.out.print(digits[i]);
	        }
	        System.out.println();
	    }
	}