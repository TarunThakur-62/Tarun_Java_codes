package generic;
public class generic_box<T>{
	    private T value;
	    public void set(T value) {
	        this.value = value;
	    }
	    public T get() {
	        return value;
	    }
	    public static void main(String[] args) {
	        generic_box<Integer> intBox = new generic_box<>();
	        intBox.set(92);
	        System.out.println("Integer Box Value: " + intBox.get());
	        generic_box<String> stringBox = new generic_box<>();
	        stringBox.set("Easy Code!");
	        System.out.println("String Box Value: " + stringBox.get());
	    }
	}