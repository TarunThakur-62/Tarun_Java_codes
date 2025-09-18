package method;
import java.util.Scanner;
public class handshake {
	public static int calculate(int n) {
		return (n * (n - 1)) / 2;
	}public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Number Of Students");
	    int n = sc.nextInt();
	    int handshake =calculate(n);
	    System.out.printf("Total Handshakes: "+ handshake);
}
}
