package collection;
import java.util.*;
public class online_exam {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Set<String> students = new HashSet<>();
	        Queue<String> queue = new LinkedList<>();
	        List<String> questions = new ArrayList<>();
	        Stack<String> history = new Stack<>();
	        System.out.println("Enter number of students: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Student ID: ");
	            String id = sc.nextLine();
	            if (students.add(id)) {
	                queue.offer(id);
	            } else {
	                System.out.println("Duplicate ID ignored!");
	            }
	        }
	        System.out.println("\nEnter number of questions: ");
	        int q = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < q; i++) {
	            System.out.print("Enter Question: ");
	            questions.add(sc.nextLine());
	        }

	        Collections.shuffle(questions);
	        if (!queue.isEmpty()) {
	            String student = queue.poll();
	            System.out.println("\nExam started for: " + student);

	            for (String ques : questions) {
	                System.out.println("Q: " + ques);
	                history.push(ques);
	            }
	        }
	        System.out.println("\nPress 1 to Go Back:");
	        while (sc.hasNextInt() && sc.nextInt() == 1) {
	            if (!history.isEmpty()) {
	                System.out.println("Back to: " + history.pop());
	            } else {
	                System.out.println("No more previous questions.");
	                break;
	            }
	        }
	}
}
