package INTERFACE;
	interface Control {
	    void turnOn();
	    void turnOff();
	}
	class Light implements Control {
	    private String location;

	    public Light(String location) {
	        this.location = location;
	    }
	    public void turnOn() {
	        System.out.println(location + " Light is ON.");
	    }
	    public void turnOff() {
	        System.out.println(location + " Light is OFF.");
	    }
	}
	class Air implements Control {
	    private String brand;

	    public Air(String brand) {
	        this.brand = brand;
	    }
	    public void turnOn() {
	        System.out.println(brand + " AC is ON.");
	    }
	    public void turnOff() {
	        System.out.println(brand + " AC is OFF.");
	    }
	}
	class Television implements Control {
	    private String model;

	    public Television(String model) {
	        this.model = model;
	    }
	    public void turnOn() {
	        System.out.println(model + " TV is ON.");
	    }
	    public void turnOff() {
	        System.out.println(model + " TV is OFF.");
	    }
	}
	public class smart_device {
	    public static void main(String[] args) {
	        Control livingRoomLight = new Light("Living Room");
	        Control bedroomAC = new Air("Daikin");
	        Control smartTV = new Television("Samsung Smart TV");
	        livingRoomLight.turnOn();
	        bedroomAC.turnOn();
	        smartTV.turnOn();

	        System.out.println("\n--- Turning off devices ---");
	        livingRoomLight.turnOff();
	        bedroomAC.turnOff();
	        smartTV.turnOff();
	    }
	}
