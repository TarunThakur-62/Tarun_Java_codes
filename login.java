package exceptions;
public class login {
	public void runLoginProcess(String username, String password) {
		boolean loggedIn = false;
		while (!loggedIn) {
            try {
                validate(username, password);                
                System.out.println("\n  SUCCESS! Welcome, " + username + "!");
                loggedIn = true;                 
            } 
            catch (Exception e) {
                System.err.println("  ERROR: " + e.getMessage()); 
                break; 
            }
        }    }
    public void validate(String user, String pass) throws Exception {
        if (!user.equals("admin") || !pass.equals("password123")) {
            throw new Exception("Invalid username or password. Please try again.");
        }
    }
}