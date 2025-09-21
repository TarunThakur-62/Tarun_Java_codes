package built_in;
import java.time.LocalDate;
import java.util.Scanner;
public class arithmatic {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Date (yyyy-MM-dd): ");
	        String input = sc.nextLine();
	        LocalDate date = LocalDate.parse(input);

	        LocalDate modifid = date.plusDays(7) 
	                                    .plusMonths(1)   
	                                    .plusYears(2)     
	                                    .minusWeeks(3);
	        System.out.println("");
	        System.out.println("Original Date: " + date);
	        System.out.println("After operations: " + modifid);
	    }
	}