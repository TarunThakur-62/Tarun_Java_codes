package elements;
import java.util.Scanner;
public class universitydiscount {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the student fee: ");
		        double fee = input.nextDouble();
		        System.out.print("Enter the university discount percentage: ");
		        double discountPercent = input.nextDouble();
		        double discount = (fee * discountPercent) / 100;
		        double finalFee = fee - discount;
		        System.out.println("The discount amount is: " + discount);
		        System.out.println("The fee you have to pay after discount is: " + finalFee);
		        input.close();
		    }
		}