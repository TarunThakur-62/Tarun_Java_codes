package controlflow;
import java.util.Scanner;
public class fizzbuzz {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        int no = scanner.nextInt();
	        int i = 1; 
	        while (i <= no) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } else {
	                System.out.println(i);
	            }
	            i++;
	        }
	    }
	}