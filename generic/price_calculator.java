package generic;
import java.util.List;
import java.util.Arrays;
public class price_calculator {
	    static abstract class Product {
	        protected double price;
	        public Product(double price) { this.price = price; }
	        public double getPrice() { return price; }
	    }
	    static class Mobile extends Product {
	        public Mobile(double price) { super(price); }
	    }
	    static class Laptop extends Product {
	        public Laptop(double price) { super(price); }
	    }
	    public static double calculateTotal(List<? extends Product> items) {
	        double total = 0.0;
	        for (Product item : items) {
	            total += item.getPrice();
	        }
	        return total;
	    }
	    public static void main(String[] args) {
	        List<Mobile> mobileList = Arrays.asList(
	            new Mobile(155499.00),
	            new Mobile(1099.00) );
	        double total = calculateTotal(mobileList);
	        System.out.println("--- Generic Price Calculator ---");
	        System.out.println("Items in list: " + mobileList.size());
	        System.out.printf("Calculated Total: %.2f%n", total);
	    }
	}