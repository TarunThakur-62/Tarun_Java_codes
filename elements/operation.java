package elements;
import java.util.Scanner;
public class operation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a, b, c;
	        System.out.print("value for 'a': ");
	        a = scanner.nextInt();

	        System.out.print("value for 'b': ");
	        b = scanner.nextInt();

	        System.out.print("value for 'c': ");
	        c = scanner.nextInt();
	        scanner.close();
	        int result1 = a + b * c;
	        System.out.println("Result: " + a + " + " + b + " * " + c + " = " + result1);
	        int result2 = a * b + c;
	        System.out.println("Result:" + a + " * " + b + " + " + c + " = " + result2);
	        int result3 = c + a / b;
	        System.out.println("Result: " + c + " + " + a + " / " + b + " = " + result3);
	        int result4 = a % b + c;
	        System.out.println("Result: " + a + " % " + b + " + " + c + " = " + result4);

	    }
	}