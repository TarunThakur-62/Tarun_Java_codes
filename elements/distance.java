package elements;
import java.util.Scanner;
public class distance {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Distance in feet: ");
	        double distanceInFeet = input.nextDouble();

	        double distanceInYards = distanceInFeet / 3.0;
	        double distanceInMiles = distanceInYards / 1760.0;

	        System.out.println("In yards is: " + distanceInYards + " yards");
	        System.out.println("In miles is: " + distanceInMiles + " miles");

	        input.close();
	    }
	}