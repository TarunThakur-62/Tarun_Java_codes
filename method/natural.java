package method;
import java.util.Scanner;
public class natural {
	public static int sum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++ )
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No:" );
		int n = sc.nextInt();
		int total= sum(n);
		System.out.print("Sum of All n Natural Numbers is: "+total);		
	}
}
