package class_object;
import java.util.Scanner;
 class tickets {
	    private String movieName;
	    private int seatNumber;
	    private double price;
	    public void bookTicket(String movieName, int seatNumber, double price) {
	        this.movieName = movieName;
	        this.seatNumber = seatNumber;
	        this.price = price;
	        System.out.println("Ticket booked successfully!");
	    }
	    public void displayTicket() {
	        System.out.println("\n--- Ticket Details ---");
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Seat Number: " + seatNumber);
	        System.out.println("Price: Rs. " + price);
	    }
	}
	public class ticket{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        tickets ticket = new tickets();
	        System.out.print("Enter Movie Name: ");
	        String movieName = sc.nextLine();

	        System.out.print("Enter Seat Number: ");
	        int seatNumber = sc.nextInt();

	        System.out.print("Enter Ticket Price: ");
	        double price = sc.nextDouble();
	        ticket.bookTicket(movieName, seatNumber, price);
	        ticket.displayTicket();
	    }
	}