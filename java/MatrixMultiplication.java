import java.util.*;
public class MatrixMultiplication
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //Accepting input for Matrix 1
	    
	    System.out.println("Enter the row size for Matrix 1: ");
	    int row1 = s.nextInt();
	    System.out.println("Enter the column size for Matrix 1: ");
	    int column1 = s.nextInt();
	    int matrix1[][]= new int[row1][column1];
	    
	    for(int i=0;i<row1;i++){
	        System.out.println("Enter "+column1+" values for row:");
	        for(int j=0;j<column1;j++){
	            matrix1[i][j]=s.nextInt();
	        }
	    }
	    
	    System.out.println("Entered values for matrix 1: ");
	    for(int i=0;i<row1;i++){
	        for(int j=0;j<column1;j++){
	            System.out.print(matrix1[i][j] +" \t");
	        }
	       System.out.println("");
	    }
	    
	    //Accepting input for Matrix 2
	    
	    System.out.println("Enter the row size for Matrix 2: ");
	    int row2 = s.nextInt();
	    System.out.println("Enter the column size for Matrix 2: ");
	    int column2 = s.nextInt();
	    int matrix2[][]= new int[row2][column2];
	    
	    for(int i=0;i<row2;i++){
	        System.out.println("Enter "+column2+" values for row:");
	        for(int j=0;j<column2;j++){
	            matrix2[i][j]=s.nextInt();
	        }
	       
	    }
	    
	    System.out.println("Entered values for matrix 2: ");
	    for(int i=0;i<row2;i++){
	        for(int j=0;j<column2;j++){
	            System.out.print(matrix2[i][j] +" \t");
	        }
	       System.out.println("");
	    }
	    
	    int multiply[][] = new int[row1][column2];
	    int sum=0;
	    if(column1!=row2){
	        System.out.println("The matrices can't be multiplied with each other.");
	    }
	    else{
	        for(int i =0;i<row1;i++){
	            for(int j =0;j<column2;j++){
	                for(int k=0;k<row2;k++)
	                sum = sum + matrix1[i][k]*matrix2[k][j];
	                multiply[i][j] = sum;
                    sum = 0;
	            }
	        }
	    }
	    
	   System.out.println("Product of the matrices:");
 
      for (int i = 0; i< row1; i++) {
        for (int j = 0; j < column2; j++)
          System.out.print(multiply[i][j]+"\t");
 
        System.out.print("\n");
      }
	    
	}
}
