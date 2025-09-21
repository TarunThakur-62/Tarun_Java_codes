package simplestring;
import java.util.Scanner;
public class compare {
	    public static int csl(String str1, String str2) {
	        int minLength = Math.min(str1.length(), str2.length());

	        for (int i = 0; i < minLength; i++) {
	            char char1 = str1.charAt(i);
	            char char2 = str2.charAt(i);

	            if (char1 != char2) {
	                return char1 - char2; 
	            }
	        }
	        if (str1.length() != str2.length()) {
	            return str1.length() - str2.length();
	        }

	        return 0; 
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("First string: ");
	        String a = scanner.nextLine();

	        System.out.print("Second string: ");
	        String b = scanner.nextLine();

	        int result = csl(a, b);

	        if (result < 0) {
	            System.out.println("\"" + a + "\" is lexicographically less than \"" + b + "\"");
	        } else if (result > 0) {
	            System.out.println("\"" + a + "\" is lexicographically greater than \"" + b + "\"");
	        } else {
	            System.out.println("\"" + a + "\" is lexicographically equal to \"" + b + "\"");
	        }
	    }
	}