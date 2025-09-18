package method;
import java.util.Scanner;
public class qui {
	public static int digit(int a, int b) {
		int quit = a/b;
		return quit;
	}
	public static int digi(int a, int b) {
		int rem = a%b;
		return rem;
	}
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number");
        int a = input.nextInt();
        System.out.print("Secound Number");
        int b = input.nextInt();
        
        int q= digit(a,b);
        int r = digi(a,b);
        
        System.out.print("Quotient is= " +q+ "  Remainder is= "+r);        
	}
}