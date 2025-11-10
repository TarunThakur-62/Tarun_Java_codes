package generic;
	import java.util.List;
	import java.util.ArrayList;
	class Electronic {}
	class Clothing {}
	class Cart<T> {
	    private List<T> items = new ArrayList<>();

	    public void addItem(T item) {
	        items.add(item);
	        System.out.println("Added: " + item.getClass().getSimpleName());
	    }
	    public void removeItem(T item) {
	        items.remove(item);
	        System.out.println("Removed: " + item.getClass().getSimpleName());
	    }
	    public void displayItems() {
	        System.out.println("\n--- Cart (" + (items.isEmpty() ? "Empty" : items.get(0).getClass().getSimpleName()) + ") ---");
	        items.forEach(item -> System.out.println("- " + item.getClass().getSimpleName()));
	        System.out.println("--------------------");
	    }
	}
	public class generic_card {
	    public static void main(String[] args) {
	        Cart<Electronic> eCart = new Cart<>();
	        System.out.println("**Electronic Cart**");
	        eCart.addItem(new Electronic());
	        eCart.displayItems();
	        Cart<Clothing> cCart = new Cart<>();
	        System.out.println("\n**Clothing Cart**");
	        cCart.addItem(new Clothing());
	        cCart.addItem(new Clothing());
	        cCart.displayItems();
	    }
	}