package simplestring;
import java.util.Scanner;
public class string_counter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String main = scanner.nextLine();

	        System.out.print("Enter the substring to count: ");
	        String sub = scanner.nextLine();

	        int count = cso(main, sub);

	        System.out.println("Substring \"" + sub + "\" appears " + count + " Times");

	        scanner.close();
	    }
	    public static int cso(String mainString, String subString) {
	        if (mainString == null || subString == null || subString.isEmpty()) {
	            return 0; 
	        }
	        int count = 0;
	        int lastIndex = 0;

	        while (lastIndex != -1) {
	            lastIndex = mainString.indexOf(subString, lastIndex);
	            if (lastIndex != -1) {
	                count++;
	                lastIndex += subString.length(); 
	            }
	        }
	        return count;
	    }
	}