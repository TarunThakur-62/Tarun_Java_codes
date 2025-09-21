package simplestring;
import java.util.Scanner;
public class toggle {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String A = scanner.nextLine();
	        StringBuilder ts = new StringBuilder();
	        for (char ch : A.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                ts.append(Character.toLowerCase(ch));
	            } else if (Character.isLowerCase(ch)) {
	                ts.append(Character.toUpperCase(ch));
	            } else {
	                ts.append(ch);
	            }
	        }

	        System.out.println("Toggled case string: " + ts.toString());
	    }
	}