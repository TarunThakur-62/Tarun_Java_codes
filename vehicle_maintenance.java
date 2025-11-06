package exceptions;
	class ServiceOverdueException extends Exception {
	    public ServiceOverdueException(String m) { super(m); }
	}
	class InvalidMileageException extends Exception {
	    public InvalidMileageException(String m) { super(m); }
	}
	public class vehicle_maintenance {
	    static void checkMaintenance(int mileage, boolean overdue) 
	        throws InvalidMileageException, ServiceOverdueException {        
	        if (mileage < 0) {
	            throw new InvalidMileageException("Mileage cannot be negative!");
	        }        
	        if (overdue) {
	            throw new ServiceOverdueException("Service is PAST DUE. Get moving!");
	        }	        
	        System.out.println(" Status: All clear.");
	    }
	    public static void main(String[] args) {
	        System.out.println("--- Test 1 (Mileage Error) ---");
	        try {
	            checkMaintenance(10, false); 
	        } catch (InvalidMileageException e) {
	            System.err.println(" CAUGHT Mileage Error: " + e.getMessage());
	        } catch (ServiceOverdueException e) {
	            System.err.println(" CAUGHT Overdue Error: " + e.getMessage());
	        }
	        System.out.println("\n--- Test 2 (Service Overdue) ---");
	        try {
	            checkMaintenance(500, true); 
	        } catch (InvalidMileageException e) {
	            System.err.println(" CAUGHT Mileage Error: " + e.getMessage());
	        } catch (ServiceOverdueException e) {
	            System.err.println(" CAUGHT Overdue Error: " + e.getMessage());
	        }
	        System.out.println("\n--- Test 3 (Success) ---");
	        try {
	            checkMaintenance(1000000, false); 
	        } catch (Exception e) {
	            System.err.println("Unexpected Error: " + e.getMessage());
	        }	    }	}