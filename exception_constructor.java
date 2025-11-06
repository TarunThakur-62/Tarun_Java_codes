package exceptions;
	import java.io.File;
	import java.io.IOException;
	class FileChecker {
	    public FileChecker(String path) throws IOException { 
	        if (!new File(path).exists()) {
	            throw new IOException("File not found: " + path);
	        }	    }	}
	public class exception_constructor {
	    public static void main(String[] args) {
	        FileChecker fc = null; 
	        try {
	            fc = new FileChecker("nonexistent.txt"); 
	            System.out.println("Object created successfully.");
	        } catch (IOException e) {
	            System.err.println(" ERROR during construction:");
	            System.err.println(e.getMessage());
	        }
	        System.out.println(fc != null ? "Status: Ready to use." : "Status: Object creation failed.");
	    }	}