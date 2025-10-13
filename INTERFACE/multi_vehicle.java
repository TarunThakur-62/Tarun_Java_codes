package INTERFACE;
	interface rv {
	    void rent();
	    void returnVehicle();
	}
	class Car implements rv {
	    private String model;
	    public Car(String model) {
	        this.model = model;
	    }
	    public void rent() {
	        System.out.println(" Renting the Car: " + model + ".");
	    }
	    public void returnVehicle() {
	        System.out.println(" Car returned: " + model + ". Ready-->");
	    }
	}
	class Bike implements rv {
	    private String type;
	    public Bike(String type) {
	        this.type = type;
	    }
	    public void rent() {
	        System.out.println(" Renting the Bike: " + type + ".");
	    }
	    public void returnVehicle() {
	        System.out.println(" Bike returned: " + type + ". Inspection. ");
	    }
	}
	class Bus implements rv {
	    private String capacity;
	    public Bus(String capacity) {
	        this.capacity = capacity;
	    }
	    public void rent() {
	        System.out.println(" Renting the Bus: " + capacity + ".");
	    }
	    public void returnVehicle() {
	        System.out.println(" Bus returned: Cleaning " + capacity );
	    }
	}
	public class multi_vehicle {
	    public static void main(String[] args) {
	        rv myCar = new Car("Toyota Fortuner #9555");
	        rv myBike = new Bike("Royal Enfield GT-650  #7555");
	        rv myBus = new Bus("Volvo luxury #0001");	        
	        System.out.println("              RENTING    ");
	        myCar.rent();
	        myBike.rent();
	        myBus.rent();
	        System.out.println("\n               RETURNING    ");
	        myCar.returnVehicle();
	        myBike.returnVehicle();
	        myBus.returnVehicle();
	    }
	}