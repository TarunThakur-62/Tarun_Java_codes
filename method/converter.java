package method;

public class converter {
	    private static final double KM_TO_MILES_FACTOR = 0.621371;
	    private static final double MILES_TO_KM_FACTOR = 1.60934;
	    private static final double METERS_TO_FEET_FACTOR = 3.28084;
	    private static final double FEET_TO_METERS_FACTOR = 0.3048;

	    public static double convertKmToMiles(double km) {
	        return km * KM_TO_MILES_FACTOR;
	    }
	    public static double convertMilesToKm(double miles) {
	        return miles * MILES_TO_KM_FACTOR;
	    }
	    public static double convertMetersToFeet(double meters) {
	        return meters * METERS_TO_FEET_FACTOR;
	    }
	    public static double convertFeetToMeters(double feet) {
	        return feet * FEET_TO_METERS_FACTOR;
	    }
	}