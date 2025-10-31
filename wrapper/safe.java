package wrapper;
import java.util.List;
import java.util.ArrayList;
public class safe {
	    public static int safInt(String input) {
	        try {
	            return Integer.parseInt(input);
	        } catch (NumberFormatException e) {
	            return -1;
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(safInt("123"));
	        System.out.println(safInt("abc"));
	        System.out.println(safInt("45.6"));
	        System.out.println(safInt("0"));
	    }
	}