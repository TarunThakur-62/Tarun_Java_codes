package exceptions;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
class InvalidSeatException extends Exception {
	    public InvalidSeatException(String seat) {
	        super("Invalid Seat: '" + seat + "'. That row doesn't exist!");
	    }	}
	class SeatAlreadyBookedException extends Exception {
	    public SeatAlreadyBookedException(String seat) {
	        super("Booked Out: Seat '" + seat + "' was just reserved. Pick another!");
	    }	}
	public class movie_ticked {
	    private static final Set<String> ALL_SEATS = new HashSet<>(Arrays.asList(
	        "A1", "A2", "B5", "C10"
	    ));
	    private final Set<String> bookedSeats = new HashSet<>();
	    public void bookSeat(String seat) throws InvalidSeatException, SeatAlreadyBookedException {
	        if (!ALL_SEATS.contains(seat)) {
	            throw new InvalidSeatException(seat);	        }
	        if (bookedSeats.contains(seat)) {
	            throw new SeatAlreadyBookedException(seat);	        }
	        bookedSeats.add(seat);
	        System.out.println("  Success! Ticket issued for seat " + seat + ".");
	    }
	    public Set<String> getBookedSeats() {
	        return bookedSeats;
	    }
	    public static void main(String[] args) {
	        movie_ticked app = new movie_ticked();
	        String[] requests = {"A1", "C10", "A1", "Z99", "B5"};
	        System.out.println("--- Starting Booking Requests ---");
	        for (String seat : requests) {
	            System.out.print("Attempting to book " + seat + "... ");	            
	            try {
	                app.bookSeat(seat);            } 
	            catch (InvalidSeatException | SeatAlreadyBookedException e) {
	                System.out.println("\n    Failed! Reason: " + e.getMessage());	            } 
	            finally {
	                System.out.println("----------------------------------------");
	            }	        }	        
	        System.out.println("\n   Final Booked Seats: " + app.getBookedSeats());
	    }	}