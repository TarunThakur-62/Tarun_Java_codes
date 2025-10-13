package INTERFACE;

public class background_job {
	    public static void main(String[] args) {
	        final double Ts = 20.0;
	        Runnable bgt = () -> {
	            System.out.println("Starting background job execution...");
	            try {
	                Thread.sleep(2000); 
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	            
	            double result = Ts * 2;
	            System.out.println("Background job complete. Calculated value: " + result);
	        };
	        Thread worker = new Thread(bgt);
	        worker.start(); 
	        System.out.println("Main thread continues while the background job runs...");
	        try {
	            worker.join(); 
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        System.out.println("Main thread execution finished.");
	    }
	}