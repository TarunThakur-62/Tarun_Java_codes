package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays; 
public class union_intersection {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> set1 = getSetFromUser(scanner, "Set 1");
	        List<Integer> set2 = getSetFromUser(scanner, "Set 2");
	        List<Integer> union = new ArrayList<>(set1); 
	        for (Integer element : set2) {
	            if (!union.contains(element)) {
	                union.add(element);
	            }	        }
	        List<Integer> intersection = new ArrayList<>();
	        for (Integer element : set1) {
	            if (set2.contains(element)) {
	                intersection.add(element);
	            }
	        }
	        System.out.println("\n Results ");
	        System.out.println("Union: " + union);
	        System.out.println("Intersection: " + intersection);
	    }
	    private static List<Integer> getSetFromUser(Scanner scanner, String setName) {
	        List<Integer> set = new ArrayList<>();
	        System.out.print("Enter elements for " + setName + " ");
	        String inputLine = scanner.nextLine();
	        String[] elements = inputLine.split(" ");
	        for (String element : elements) {
	            try {
	                if (!element.trim().isEmpty()) {
	                    set.add(Integer.parseInt(element.trim()));
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Skipping invalid input: " + element);
	            }
	        }
	        return set;
	    }	}