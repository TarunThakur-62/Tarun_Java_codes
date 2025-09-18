package elements;

public class profit {
	    public static void main(String[] args) {
	        double costPrice = 129.0;
	        double sellingPrice = 191.0;

	        double profit = sellingPrice - costPrice;
	        String resultType;
	        double percentage;

	        if (profit > 0) {
	            resultType = "Profit";
	            percentage = (profit/ costPrice) * 100;
	        } else if (profit< 0) {
	            resultType = "Loss";
	            percentage = (Math.abs(profit) / costPrice) * 100;
	        } else {
	            resultType = "No Profit, No Loss";
	            percentage = 0.0;
	        }

	        System.out.printf("Cost Price:%.2f%n" +
	                          "Selling Price:%.2f%n" +
	                          "%s: INR %.2f%n" +
	                          "%s Percentage: %.2f%%%n",
	                          costPrice, sellingPrice,
	                          resultType, Math.abs(profit),
	                          resultType, percentage);
	    }
	}