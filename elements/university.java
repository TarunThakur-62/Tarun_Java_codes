package elements;

public class university {
	    public static void main(String[] args) {
	        double fee = 125000.0;
	        int discountPercent = 10;

	        double discount = fee * (discountPercent / 100.0);

	        double finalFee = fee - discount;

	        System.out.println("Original Course Fee: " + fee);
	        System.out.println("Discount Percentage: " + discountPercent + "%");
	        System.out.println("Discounted Amount: " + discount);
	        System.out.println("Final Fee to Pay:" + finalFee);
	    }
	}