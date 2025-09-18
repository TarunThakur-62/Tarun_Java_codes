package controlflow;
import java.util.Scanner;
public class countdown {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("StartinG countdown: ");
	        int counter = scanner.nextInt();
	        System.out.println("Initiating countdown...");
	        while (counter >= 1) { 
	            System.out.println(counter + "...");
	            counter--; 
	        }

	        System.out.println("Lift off!");
	        scanner.close();
	    }    }
	