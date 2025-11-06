package exceptions;
import java.io.IOException;
class InvalidStudentException extends Exception {}
public class online_exam {
	    public static void validateStudent() throws InvalidStudentException {
	        throw new InvalidStudentException();	    }
	    public static void submitExam() throws InvalidStudentException, IOException {
	        validateStudent(); 
	        System.out.println("Exam submitted successfully.");	    }
	    public static void main(String[] args) {
	        System.out.println("--- Exam Submission Process Starting ---");	        
	        try {
	            submitExam();	            
	        } catch (InvalidStudentException e) {
	            System.err.println(" Error: Student validation failed.");	            
	        } catch (IOException e) {
	            System.err.println(" Error: Network failure during submission.");	            
	        } finally {
	            System.out.println(" Exam submission process completed.");
	        }
	    }
	}