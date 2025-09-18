package hackme;
import java.util.Scanner;
public class darray {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
        int[] onedarray = {10,20,30,40,50,60};
        int[] a = new int[onedarray.length];
        for (int i = 0; i < onedarray.length; i++) { 
                System.out.print("Enter The Data");
                int data = sc.nextInt();
                a[i]= data;           
            } 
        }
    }

