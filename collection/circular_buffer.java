package collection;
import java.util.Scanner;
public class circular_buffer {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Buffer size: ");
	        int size = sc.nextInt();
	        int[] buffer = new int[size];
	        int index = 0;
	        while (true) {
	            System.out.print("Enter value (-1 to exit): ");
	            int val = sc.nextInt();
	            if (val == -1) break;
	            buffer[index] = val; 
	            index = (index + 1) % size;
	            System.out.print("Buffer: ");
	            for (int x : buffer) System.out.print(x + " ");
	            System.out.println();
	        }
	    }	}