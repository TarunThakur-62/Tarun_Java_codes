package class_object;
import java.util.Scanner;
public class students {
	    String name;
	    int rollNumber;
	    double marks;
	    public students(String name, int rollNumber, double marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }
	    public char grade() {
	        if (marks >= 90) {
	            return 'A';
	        } else if (marks >= 80) {
	            return 'B';
	        } else if (marks >= 70) {
	            return 'C';
	        } else if (marks >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }
	    public void details() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + grade());
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Student Name:");
	        String studentName = scanner.nextLine();
	        System.out.println("Enter Roll Number:");
	        int roll = scanner.nextInt();
	        System.out.println("Enter Marks:");
	        double studentMarks = scanner.nextDouble();
	        students student1 = new students(studentName, roll, studentMarks);
	        System.out.println("\n");
	        student1.details();
	    }
	}
