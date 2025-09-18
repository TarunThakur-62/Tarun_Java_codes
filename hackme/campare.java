package hackme;
import java.util.Scanner;
public class campare {
	    public static boolean compareStringsUsingCharAt(String s1, String s2) {
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

	        System.out.print("Enter the first string: ");
	        String str1 = scanner.next();

	        System.out.print("Enter the second string: ");
	        String str2 = scanner.next();

	        boolean customComparisonResult = compareStringsUsingCharAt(str1, str2);
	        System.out.println("charAt() comparison: " + customComparisonResult);
	        boolean builtInComparisonResult = str1.equals(str2);
	        System.out.println("equals() method: " + builtInComparisonResult);

	        if (customComparisonResult == builtInComparisonResult) {
	            System.out.println("Same result.");
	        } else {
	            System.out.println("Different results.");
	        }
	        scanner.close();
	    }
	}