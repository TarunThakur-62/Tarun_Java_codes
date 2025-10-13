package INTERFACE;
import java.util.function.Predicate;
public class temp_alert {
	    public static void main(String[] args) {
	        final double ALERT = 30.0;
	        Predicate<Double> isAN = (temp) -> temp > ALERT;
	        double ctemp1 = 35.5;
	        double ctemp2 = 28.0;
	        System.out.println("      Test 1 ");
	        System.out.println("Current Temperature: " + ctemp1);
	        if (isAN.test(ctemp1)) {
	            System.out.println("ALERT! Temperature crossed the threshold of " + ALERT);
	        } else {
	            System.out.println("Temperature is normal.");
	        }   
	        System.out.println("\n      Test 2 ");
	        System.out.println("Current Temperature: " + ctemp2);
	        if (isAN.test(ctemp2)) {
	            System.out.println("🚨 ALERT! Temperature crossed the threshold of " + ALERT);
	        } else {
	            System.out.println("Temperature is normal.");
	        }
	    }
	}