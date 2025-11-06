package exceptions;
import java.util.ArrayList;
import java.util.List;
public class student {
	    public static void main(String[] args) {
	        List<String> grades = List.of("90", "A+", "85", "77", "B-", "100");	        
	        List<Integer> num = new ArrayList<>();
	        System.out.println("    Starting Grade Parsing ");	        
	        for (String grade : grades) {
	            try {
	                int n = Integer.parseInt(grade);
	                num.add(n);
	                System.out.println("Successfully parsed: " + grade + " -> " + n);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid grade input: " + grade);
	            }	        }       
	        System.out.println("\n      Parsing Complete     ");
	        System.out.println("Valid Numeric Grades Collected: " + num);
	    }
	}