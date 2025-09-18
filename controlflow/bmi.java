package controlflow;
import java.util.Scanner;
public class bmi {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Weight(kg): ");
	        double w = input.nextDouble();
	        System.out.print("Height(cm): ");
	        double h = input.nextDouble();
	        double ht = h / 100.0;
	        
	        double bmi = w / (ht * ht);
	        System.out.printf("BMI %.2f\n", bmi);
	        if (bmi < 18.5) {
	            System.out.println("Underweight");
	        } else if (bmi >= 18.5 && bmi <= 24.9) {
	            System.out.println("Normal weight");
	        } else if (bmi >= 25 && bmi <= 29.9) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }
	    }
	}