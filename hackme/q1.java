package hackme;

public class q1 {
	    public static void main(String[] args) {
	        int [][] matrix = {{2,5,6,7},{9,5,2,5},{5,6,2,5},{5,6,8,7}};
	        System.out.println("Matrix elements:");
	        for (int i = 0; i < matrix.length; i++) { 
	            for (int j = 0; j < matrix[i].length; j++) { 
	                System.out.print(matrix[i][j]+ " ");
	            }
	            System.out.println(); 
	        }
	    }
	}