package generic;
public class maximunthree {
	    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	        T max = x; 
	        if (y.compareTo(max) > 0) {
	            max = y;	        }
	        if (z.compareTo(max) > 0) {
	            max = z;        }
	        return max;
	    }
	    public static void main(String[] args) {
	        System.out.printf("Maximum of %d, %d, and %d is: %d%n", 5, 12, 8, maximum(5, 12, 8));
	        System.out.printf("Maximum of %.2f, %.2f, and %.2f is: %.2f%n", 3.55, 9.11, 9.0, maximum(3.55, 9.11, 9.0));
	        System.out.printf("Maximum of \"%s\", \"%s\", and \"%s\" is: \"%s\"%n", 
	            "Apple", "Orange", "Banana", maximum("Apple", "Orange", "Banana"));
	    }
	}