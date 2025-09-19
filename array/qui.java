package array;
import java.util.Scanner;
public class qui {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("coefficient a: ");
	        double a = input.nextDouble();

	        System.out.print("coefficient b: ");
	        double b = input.nextDouble();

	        System.out.print("coefficient c: ");
	        double c = input.nextDouble();

	        input.close();
	        double delta = Math.pow(b, 2) - 4 * a * c;

	        if (delta > 0) {
	            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("Two distinct real roots:");
	            System.out.println("Root 1 = " + root1);
	            System.out.println("Root 2 = " + root2);
	        } else if (delta == 0) {
	            double root = -b / (2 * a);
	            System.out.println("One real root:");
	            System.out.println("Root = " + root);
	        } else {
	            System.out.println("No real roots exist");
	        }
	    }
	}