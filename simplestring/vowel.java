package simplestring;
import java.util.Scanner;
public class vowel {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int vowel = 0;
	        int consonant = 0;
	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowel++;
	                } else {
	                    consonant++;
	                }
	            }
	        }
	        System.out.println("Number of vowels: " + vowel);
	        System.out.println("Number of consonants: " + consonant);
	    }
	}
