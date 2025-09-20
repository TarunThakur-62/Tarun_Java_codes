package constructor;

public class product {
	    private String pn;
	    private double p;
	    private static int tp = 0;
	    public product(String productName, double price) {
	        this.pn = productName;
	        this.p = price;
	        tp++; 
	    }
	    public void dpd() {
	        System.out.println("Product Name: " + this.pn);
	        System.out.println("Price: " + this.p);
	    }
	    public static void displayTotalProducts() {
	        System.out.println("Total number of products " + tp);
	    }
	    public static void main(String[] args) {
	        product product1 = new product("Laptop", 1200.00);
	        product product2 = new product("Mouse", 25.50);
	        product product3 = new product("Keyboard", 75.00);
	        System.out.println("Product 1 ");
	        product1.dpd();
	        System.out.println("\nProduct 2 ");
	        product2.dpd();
	        System.out.println("\nProduct 3 ");
	        product3.dpd();
	        System.out.println();
	        product.displayTotalProducts(); 
	    }
	}