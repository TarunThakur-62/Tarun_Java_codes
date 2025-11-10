package generic;
import java.util.ArrayList;
import java.util.List;
abstract class CourseType {
	    String typeName;
	    public CourseType(String name) { this.typeName = name; }
	    public abstract String getEvaluationMethod();
	    @Override public String toString() { return typeName; }
	}
	class ExamCourse extends CourseType {
	    public ExamCourse() { super("Exam-Based"); }
	    @Override public String getEvaluationMethod() { return "Final exam (100%)."; }
	}
	class AssignmentCourse extends CourseType {
	    public AssignmentCourse() { super("Assignment-Based"); }
	    @Override public String getEvaluationMethod() { return "Assignments & Project."; }
	}
	class Course<T extends CourseType> {
	    private String code, name;
	    private T type;

	    public Course(String code, String name, T type) {
	        this.code = code;
	        this.name = name;
	        this.type = type;
	    }

	    public void displayDetails() {
	        System.out.printf("  Code: %s, Name: %s\n", code, name);
	        System.out.println("  Type: " + type + ", Eval: " + type.getEvaluationMethod());
	    }
	}
	public class multilevel_university {
	    public static void printAllCourses(List<? extends Course<? extends CourseType>> courses) {
	        System.out.println("\n--- University Courses ---");
	        for (Course<? extends CourseType> course : courses) {
	            course.displayDetails();
	        }
	    }
	    public static void main(String[] args) {
	        Course<ExamCourse> math = new Course<>("MATH101", "Calc I", new ExamCourse());
	        Course<AssignmentCourse> cs = new Course<>("CS305", "Data Structs", new AssignmentCourse());
	        List<Course<? extends CourseType>> allCourses = new ArrayList<>();
	        allCourses.add(math);
	        allCourses.add(cs);
	        printAllCourses(allCourses);
	    }
	}