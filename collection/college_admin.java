package collection;
import java.util.*;
	class Student implements Comparable<Student> {
	    String name;
	    int marks;
	    Student(String n, int m) { name=n; marks=m; }
	    public int compareTo(Student s){ return s.marks - marks; }
	    public String toString(){ return name+"-"+marks; }
	}
	public class college_admin {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Student> list = new ArrayList<>();
	        Set<Student> shortlisted = new HashSet<>();
	        Queue<Student> queue = new LinkedList<>();
	        TreeSet<Student> merit = new TreeSet<>();
	        System.out.print("How many applicants? ");
	        int n = sc.nextInt();
	        for(int i=0;i<n;i++){
	            System.out.print("Name: ");
	            String name = sc.next();
	            System.out.print("Marks: ");
	            int marks = sc.nextInt();
	            list.add(new Student(name, marks));	        }
	        for(Student s:list) if(s.marks>=60) shortlisted.add(s);
	        queue.addAll(shortlisted);
	        while(!queue.isEmpty()){
	            Student s = queue.poll();
	            if(s.marks>=75) merit.add(s);	        }
	        System.out.println("\nApplicants: " + list);
	        System.out.println("Shortlisted: " + shortlisted);
	        System.out.println("Merit List: " + merit);
	    }
	}