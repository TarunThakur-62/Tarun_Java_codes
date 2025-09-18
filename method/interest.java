package method;
import java.util.Scanner;
public class interest {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Principal amount: ");
	        double principal = input.nextDouble();
	        System.out.print("Rate of Interest ");
	        double rate = input.nextDouble();
	        System.out.print("Time period (in years): ");
	        double time = input.nextDouble();
	        
	        double intrest=(principal*rate*time)/100;
	        
	        System.out.printf("Interest is %.2f\n Principal %.2f\n Rate of Interest %.2f%%\n Time %.2f years.%n",
	                intrest, principal, rate, time);        
	    }
	}