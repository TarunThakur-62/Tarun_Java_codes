package collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class find_subset {
	    public static Set<Integer> readSetFromUser(Scanner scanner, String prompt) {
	        System.out.println(prompt);
	        System.out.print("Enter elements: ");
	        String inputLine = scanner.nextLine().trim();
	        if (inputLine.isEmpty()) {
	            return new HashSet<>();
	        }
	        try {
	              return Arrays.stream(inputLine.split("\\s+"))
	                         .map(Integer::parseInt)
	                         .collect(Collectors.toSet());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: ");
	            return new HashSet<>();
	        }    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Set<Integer> set1 = readSetFromUser(scanner, "Set 1: ");
	        Set<Integer> set2 = readSetFromUser(scanner, "Set 2: ");
	        System.out.println("Set1: " + set1);
	        System.out.println("Set2: " + set2);
	        boolean isSubset = set2.containsAll(set1);
	        System.out.println("\nIs Set1 a subset of Set2? " + isSubset);
	    }
	}