package generic;
import java.util.Arrays;
import java.util.List;
public class numeric_sum {
	  public static double sumNumbers(List<? extends Number> list) {
	        double total = 0.0;
	        for (Number number : list) {
	            total += number.doubleValue();
	        }
	        return total;
	    }
	  public static void main(String[] args) {
	        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
	        double sumIntegers = sumNumbers(integerList);

	        System.out.println("Testing with List<Integer>");
	        System.out.println("List: " + integerList);
	        System.out.println("Sum: " + sumIntegers); 
	        List<Double> doubleList = Arrays.asList(10.5, 20.25, 30.0);
	        double sumDoubles = sumNumbers(doubleList);
            System.out.println(" ");
	        System.out.println(" Testing with List<Double>");
	        System.out.println("List: " + doubleList);
	        System.out.println("Sum: " + sumDoubles);
	    }
	}