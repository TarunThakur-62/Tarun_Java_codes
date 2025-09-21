package simplestring;
import java.util.Scanner;
public class remove {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("String: ");
	        String orig = scanner.nextLine();
	        System.out.print("Character to remove: ");
	        char Remove = scanner.next().charAt(0); 
	        String modified = orig.replace(Remove, '\u0000');
	        modified = modified.replace("\u0000", ""); 
	        StringBuilder Builder = new StringBuilder();
	        for (int i = 0; i < orig.length(); i++) {
	            if (orig.charAt(i) != Remove) {
	                Builder.append(orig.charAt(i));
	            }
	        }
	        System.out.println(" ");
	        String modif = Builder.toString();
	        System.out.println("Modified String  " + modif);
	    }
}
