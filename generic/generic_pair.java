package generic;
	class Pair<T, U> {
	    private T first;
	    private U second;
	    public Pair(T first, U second) {
	        this.first = first;
	        this.second = second;
	    }
	    public T getFirst() {
	        return first;
	    }

	    public U getSecond() {
	        return second;
	    }
	}
	public class generic_pair {
	    public static void main(String[] args) {
	        Pair<String, Integer> student = new Pair<>("Amol", 20);
	        
	        System.out.println("Student Pair:");
	        System.out.println("Name (First): " + student.getFirst());
	        System.out.println("Age (Second): " + student.getSecond());
	        
	        System.out.println("-------------------------");
	        Pair<Double, String> location = new Pair<>(40.7128, "New York Latitude");

	        System.out.println("Location Pair:");
	        System.out.println("Latitude (First): " + location.getFirst());
	        System.out.println("Description (Second): " + location.getSecond());
	    }
	}