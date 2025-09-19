package string;
import java.util.Scanner;
public class comparison {
	    public static boolean compareStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("First string: ");
	        String string1 = scanner.next();

	        System.out.print("Second string: ");
	        String string2 = scanner.next();

	        boolean charAtResult = compareStrings(string1, string2);
	        System.out.println("Using charAt(): " + charAtResult);

	        boolean equalsResult = string1.equals(string2);
	        System.out.println("Using built-in equals():" + equalsResult);

	        if (charAtResult == equalsResult) {
	            System.out.println("Both are same result.");
	        } else {
	            System.out.println("Different results.");
	        }

	        scanner.close();
	    }
	 }