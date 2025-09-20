package constructor;

public class carrenta {
	    private String cn;
	    private String cm;
	    private int rd;
	    private double totalCost;
	    private static final double DAILY_RATE = 150000.0;
	    public carrenta(String customerName, String carModel, int rentalDays) {
	        this.cn = customerName;
	        this.cm = carModel;
	        this.rd = rentalDays;
	        this.totalCost = calculateTotalCost();
	    }
	    private double calculateTotalCost() {
	        return rd * DAILY_RATE;
	    }
	    public String getCustomerName() {
	        return cn;
	    }

	    public String getCarModel() {
	        return cm;
	    }

	    public int getRentalDays() {
	        return rd;
	    }

	    public double getTotalCost() {
	        return totalCost;
	    }
	    public void displayRentalDetails() {
	        System.out.println("Customer Name: " + cn);
	        System.out.println("Car Model: " + cm);
	        System.out.println("Rental Days: " + rd);
	        System.out.println("Total Cost: " + String.format("%.2f", totalCost));
	    }
	    public static void main(String[] args) {
	        carrenta rental1 = new carrenta("Tarun Thakur", "Toyota Camry", 45);
	        rental1.displayRentalDetails();
	        carrenta rental2 = new carrenta("Harshit Yadav", "Toyota Fortuner", 30);
	        rental2.displayRentalDetails();
	    }
	}