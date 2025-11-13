package collection;
import java.util.Arrays;
import java.util.Scanner;
public class rotate_elements {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        k = arr.length - k; 
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Enter array elements: ");
        String inputLine = scanner.nextLine();
        String[] parts = inputLine.trim().split("\\s+");
        int n = parts.length;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Positions to rotate: ");
        int k = scanner.nextInt();       
        System.out.println("\nOriginal List: " + Arrays.toString(list));
        rotate(list, k);
        System.out.println("Rotated List:  " + Arrays.toString(list));
    }
}