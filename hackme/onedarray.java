package hackme;
import java.util.Scanner;
import static java.lang.System.out;
public class onedarray {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int[] onedarray = {10,20,30,40,50};
		int key = 50;
		int count = 0;
		for(int i = 0;i<onedarray.length;i++) {
			if (key==onedarray[i]) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}		
	}
}