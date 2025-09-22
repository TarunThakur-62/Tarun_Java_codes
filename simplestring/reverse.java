package simplestring;
import java.util.Scanner;
public class reverse {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string to reverse: ");
	        String orig = scanner.nextLine();
	        String rever = " ";
	        for (int i = orig.length() - 1; i >= 0; i--) {
	            rever = rever + orig.charAt(i);
	        }
	        System.out.println("Reversed String:" + rever);
	    }
}