package hackme;
public class nullpointer {
	    public static void main(String[] args) {
	    	String text = null;
	     try {
	    	 int length = text.length();
	    	 System.out.println("length" + length);
	    	 	    	 
	     }catch(NullPointerException e) {
	    	 System.out.println(e);
	    	 
	     }
	        
	    }
	    
}
