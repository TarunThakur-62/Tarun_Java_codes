package generic;
import java.util.Objects;
public class comparetwo {
	    public static <T> boolean isEqual(T a, T b) {
	        return Objects.equals(a, b);
	    }
	    public static void main(String[] args) {
	        String s1 = "Test";
	        String sNull = null;
	        Integer i1 = 5;
	        System.out.println("Strings (Equal): " + isEqual(s1, "Test"));       
	        System.out.println("Strings (Not Equal): " + isEqual(s1, "Nope"));       
	        System.out.println("Nulls (Both null): " + isEqual(sNull, null));        
	        System.out.println("Null vs Object: " + isEqual(s1, sNull));             
	    }
	}