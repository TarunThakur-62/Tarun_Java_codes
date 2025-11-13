package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class reverse_list {
    public static <T> void reverseList(List<T> list) {
        if (list == null || list.size() < 2) {
            return;       }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {            
            List<String> a = new ArrayList<>();
            System.out.print(" Enter a number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number. Exiting.");
                return;
            }
            int count = scanner.nextInt();
            scanner.nextLine(); 
            for (int i = 0; i < count; i++) {
                System.out.print("Elements " + (i + 1) + ": ");
                String item = scanner.nextLine(); 
                a.add(item);
            }
            System.out.println("\nOriginal List: " + a);       
            reverseList(a);
            System.out.println("Reversed List: " + a);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}