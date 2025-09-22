package encupsolution;
import java.util.*;
abstract class Product {
	    private int productId;
	    private String name;
	    private double price;
	    public Product(int productId, String name, double price) {
	        this.productId = productId;
	        this.name = name;
	        this.price = price;
	    }
	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    public abstract double calculateDiscount();
	    public void displayDetails() {
	        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
	    }
	}
	interface Taxable {
	    double calculateTax();
	    void getTaxDetails();
	}

	// Electronics Category
	class Electronics extends Product implements Taxable {
	    public Electronics(int productId, String name, double price) {
	        super(productId, name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return getPrice() * 0.10; 
	    }

	    @Override
	    public double calculateTax() {
	        return getPrice() * 0.18; 
	    }

	    @Override
	    public void getTaxDetails() {
	        System.out.println("Electronics Tax: 18% GST");
	    }
	}

	// Clothing Category
	class Clothing extends Product implements Taxable {
	    public Clothing(int productId, String name, double price) {
	        super(productId, name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return getPrice() * 0.20; 
	    }

	    public double calculateTax() {
	        return getPrice() * 0.05; 
	    }
	    public void getTaxDetails() {
	        System.out.println("Clothing Tax: 5% GST");
	    }
	}
	class Groceries extends Product {
	    public Groceries(int productId, String name, double price) {
	        super(productId, name, price);
	    }
	    public double calculateDiscount() {
	        return getPrice() * 0.05; 
	    }
	    
	}
	public class commerce {
	    public static void printFinalPrice(List<Product> products) {
	        for (Product p : products) {
	            p.displayDetails();
	            double discount = p.calculateDiscount();
	            double tax = 0.0;

	            if (p instanceof Taxable) {
	                tax = ((Taxable) p).calculateTax();
	                ((Taxable) p).getTaxDetails();
	            }

	            double finalPrice = p.getPrice() + tax - discount;
	            System.out.println("Discount: " + discount);
	            System.out.println("Tax: " + tax);
	            System.out.println("Final Price: " + finalPrice);
	            System.out.println("----------------------");
	        }
	    }

	    public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Electronics(101, "Laptop", 60000));
	        products.add(new Clothing(102, "T-Shirt", 2000));
	        products.add(new Groceries(103, "Rice Bag", 1500));
	        printFinalPrice(products);
	 
	        }
	    }
