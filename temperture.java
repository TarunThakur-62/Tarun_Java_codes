package exceptions;
import java.util.Scanner;
public class temperture {
	    private static final double ABS_ZERO_C = -273.15;
	    private static final double ABS_ZERO_F = -459.67;
	    static class InvalidTemperatureException extends Exception {
	        public InvalidTemperatureException(String msg) {
	            super(msg);
	        }	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("=== Temp Converter (C/F) ===");
	        try {
	            System.out.print("Enter temp value: ");
	            double temp = scanner.nextDouble();
	            System.out.print("Enter unit (C or F): ");
	            char unit = Character.toUpperCase(scanner.next().charAt(0));
	            if (unit != 'C' && unit != 'F') {
	                throw new Exception("Invalid unit. Use 'C' or 'F'.");
	            }
	            if ((unit == 'C' && temp < ABS_ZERO_C) || (unit == 'F' && temp < ABS_ZERO_F)) {
	                String msg = (unit == 'C')
	        ? "Error: Temperature below absolute zero is not possible! " + ABS_ZERO_C + "°C)"
	        : "Error: Temperature below absolute zero is not possible!  " + ABS_ZERO_F + "°F)";           
	                throw new InvalidTemperatureException(msg);
	            }
	            double convertedTemp;
	            char targetUnit;
	            
	            if (unit == 'C') {
	                convertedTemp = (temp * 9.0 / 5.0) + 32.0; 
	                targetUnit = 'F';
	            } else { 
	                convertedTemp = (temp - 32.0) * 5.0 / 9.0; 
	                targetUnit = 'C';
	            }
	            System.out.printf("\nSuccess! %.2f°%c is equivalent to %.2f°%c\n", 
	                              temp, unit, 
	                              convertedTemp, targetUnit);
	        } catch (InvalidTemperatureException e) {
	            System.err.println("❌ " + e.getMessage()); 
	        } catch (java.util.InputMismatchException e) {
	            System.err.println(" Error: You had one job—enter a number for the temperature.");
	        } catch (Exception e) {
	            System.err.println(" Error: " + e.getMessage());
	        } finally {
	        }
	    }
	}