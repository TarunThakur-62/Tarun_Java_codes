package elements;
import java.util.Scanner;
public class area {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Base of the triangle");
	        double baseInches = input.nextDouble();

	        System.out.print("Height of the triangle");
	        double heightInches = input.nextDouble();
	        double areaSquareInches = 0.5 * baseInches * heightInches;
	        final double CM_PER_INCH = 2.54;
	        double areaSquareCentimeters = areaSquareInches * CM_PER_INCH * CM_PER_INCH;
	        System.out.printf("Area in Square Inches: %.2f sq in\n", areaSquareInches);
	        System.out.printf("Area in Square Centimeters: %.2f sq cm\n", areaSquareCentimeters);
	        input.close();
	    }
	}