package class_object;
import java.util.Scanner;
public class circle {
	    private double radius;
	    public circle(double radius) {
	        this.radius = radius;
	    }
	    public double Area() {
	        return Math.PI * radius * radius;
	    }
	    public double cumfe() {
	        return 2 * Math.PI * radius;
	    }
	    public void dis() {
	    	System.out.println(" ");
	        System.out.println("Area of the circle: " + Area());
	        System.out.println("Circumference of the circle: " + cumfe());
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        System.out.print("Radius of the circle: ");
	        double use = scanner.nextDouble(); 
	        circle myCircle = new circle(use);
	        myCircle.dis();
	    }
	}