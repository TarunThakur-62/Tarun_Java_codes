package exceptions;
public class nested_trycatch {
	    private static void innerMethod() {
	        System.out.println("  -> B: Inner method starts.");
	        try {
	            String s = null;
	            System.out.println("  !! Trying to cause NPE...");
	            s.length();             
	        } catch (NumberFormatException e) {
	            System.err.println(" --B: Caught NFE (but we got an NPE, so this is SKIPPED).");
	        }
	        System.out.println("  <- B: Inner method ends");	    }
	    public static void main(String[] args) {
	        System.out.println("-> A: Main method starts.");
	        try {
	            innerMethod();
	        } catch (Exception e) {
	            System.err.println("-A Main Caught Propagated Exception: " + e.getClass().getSimpleName());
	            System.err.println("    Message: " + e.getMessage());
	        }
	        System.out.println("<- A: Program continues happily.");
	    }	}