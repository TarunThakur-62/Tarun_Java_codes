package constructor;

public class vehicle {
	    private String o;
	    private String vehicleType;
	    private static double r = 25000.0; 
	    public vehicle(String ownerName, String vehicleType) {
	        this.o = ownerName;
	        this.vehicleType = vehicleType;
	    }
	    public void dvd() {
	        System.out.println("Owner Name: " + o);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Fee: " + r);
	    }
	    public static void urf(double newFee) {
	            r = newFee;
	            System.out.println("Registration fee updated to: " + r);
	        }
	    public static void main(String[] args) {
	        vehicle vehicle1 = new vehicle("Tarun Thakur", "XUV Car");
	        vehicle vehicle2 = new vehicle("Keshvi Goyal", "Car");
	        System.out.println("Initial Vehicle Details");
	        vehicle1.dvd();
	        System.out.println(" ");
	        vehicle2.dvd();
	        System.out.println("");
	        vehicle.urf(750.0);
	        vehicle1.dvd();
	        System.out.println(" ");
	        vehicle2.dvd();
	        System.out.println(" ");
	        vehicle.urf(-100.0);
	    }
	}