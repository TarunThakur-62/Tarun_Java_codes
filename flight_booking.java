package exceptions;
public class flight_booking {
	    static class SeatUnavailableException extends Exception {
	        public SeatUnavailableException(String m) { super(m); }	    }
	    static class PaymentFailedException extends Exception {
	        public PaymentFailedException(String m) { super(m); }	    }
	    public static void checkSeatAvailability(boolean available) throws SeatUnavailableException {
	        if (!available) throw new SeatUnavailableException("Seats are gone!");	    }
	    public static void processPayment(boolean success) throws PaymentFailedException {
	        if (!success) throw new PaymentFailedException("Payment declined.");	    }
	    public static void bookTicket(boolean seats, boolean payment) throws Exception {
	        System.out.println("Attempting to book...");
	        checkSeatAvailability(seats);
	        processPayment(payment);
	        System.out.println("TICKET SUCCESS!");	    }
	    public static void main(String[] args) {
	        try {
	            bookTicket(false, true);            
	        } catch (SeatUnavailableException | PaymentFailedException e) {
	            System.err.println("Booking Failed: " + e.getMessage());	            
	        } catch (Exception e) {
	            System.err.println("Unexpected Error: " + e.getMessage());	            
	        } finally {
	            System.out.println("\n Thank you for booking with us! ");
	        }
	    }
	}