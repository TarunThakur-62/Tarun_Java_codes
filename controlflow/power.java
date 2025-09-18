package controlflow;
import java.util.Scanner;
public class power {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number, power;

	        System.out.print("Base: ");
	        number = input.nextInt();
	        System.out.print("Power  ");
	        power = input.nextInt();

	        long result = 1; 
	        int counter = 0;
	        while (counter < power) {
	            result *= number; 
	            counter++; 
	        }
	        System.out.println(result);
	    }
	}