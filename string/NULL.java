package string;

public class NULL {
	    public static void generate() {
	        String text = null;
	        System.out.println("length of a null string...");
	        int length = text.length();
	        System.out.println("The length is: " + length);
	    }
	    public static void main(String[] args) {
	        System.out.println("--- First, demonstrating the raw NullPointerException ---");
	        generate();
	    }
	}