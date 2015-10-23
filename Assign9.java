import java.util.Scanner;
public class Assign9 {
	public static void main(String[] args) {	
		
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter value to find Square root ");
		 	  
		  double num = scanner.nextDouble();
		 
		  System.out.println();
		 
		   double res = Math.sqrt(num);
		 
		  System.out.println("Square root of " + num + " is : " + res);
		 
		  System.out.println();
		 		
		  System.out.println("Enter value to find Cube root ");
		 	
		  num = scanner.nextDouble();
		 
		  System.out.println();
		 
		  res = Math.cbrt(num);
		 
		  System.out.println("Cube root of " + num + " is : " + res);
		 
			 }
		 
		}