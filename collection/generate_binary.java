package collection;
import java.util.Scanner;
public class generate_binary{
    public static String convertToBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number ");
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N < 0) {
                System.out.println("Input must be a non-negative integer.");
            } else {
                String binaryNumber = convertToBinary(N);
                System.out.println("\n Result");
                System.out.println("Binary Output: " + binaryNumber);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}