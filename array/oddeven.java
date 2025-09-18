package array;
import java.util.Scanner;
public class oddeven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Natural number: ");
	        int n = scanner.nextInt();
	        if (n <= 0) {
	            System.out.println("Error:");
	            return; 
	        }
	        int size = n / 2 + 1; 
	        int[] evenN = new int[size];
	        int[] oddN = new int[size];
	        int even = 0;
	        int odd = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                evenN[even++] = i;
	            } else {
	                oddN[odd++] = i;
	            }
	        }
	        for (int i = 0; i < odd; i++) {
	            System.out.print(oddN[i] + " ");
	        }
	        System.out.println();
	        for (int i = 0; i < even; i++) {
	            System.out.print(evenN[i] + " ");
	        }
	    }
	}