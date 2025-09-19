package method;
import java.util.Scanner;
public class geometry {
	    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }
	    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
	        double[] lineEquation = new double[2];

	        if (x1 == x2) {
	            lineEquation[0] = Double.NaN;
	            lineEquation[1] = Double.NaN; 
	        } else {
	            double slope = (y2 - y1) / (x2 - x1);
	            double yIntercept = y1 - slope * x1;
	            lineEquation[0] = slope;
	            lineEquation[1] = yIntercept;
	        }
	        return lineEquation;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("first point coordinates ");
	        double x1 = scanner.nextDouble();
	        double y1 = scanner.nextDouble();

	        System.out.println("second point coordinates ");
	        double x2 = scanner.nextDouble();
	        double y2 = scanner.nextDouble();
	        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
	        System.out.printf("Euclidean Distance: %.2f%n", distance);
	        double[] lineParams = calculateLineEquation(x1, y1, x2, y2);
	        double slope = lineParams[0];
	        double yIntercept = lineParams[1];

	        if (Double.isNaN(slope)) {
	            System.out.println("Equation of the line: x = " + x1 + " (Vertical line)");
	        } else {
	            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", slope, yIntercept);
	        }

	        scanner.close();
	    }
	}