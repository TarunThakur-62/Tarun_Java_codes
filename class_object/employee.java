package class_object;
import java.util.Scanner;
public class employee {

	    String name;
	    int id;
	    double salary;
	    public employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }
	    public void dis() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Salary: " + salary);
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Employee Name: ");
	        String empName = input.nextLine();

	        System.out.print("Employee ID: ");
	        int empId = input.nextInt();

	        System.out.print("Employee Salary: ");
	        double empSalary = input.nextDouble();
	        employee employee1 = new employee(empName, empId, empSalary);

	        System.out.println(" ");
	        employee1.dis(); 
	    }
	}