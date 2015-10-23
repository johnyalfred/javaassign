import java.util.Scanner;
public class Assign8 {
	public static void main(String[] args)
     {
		 int monthno;
	        int year;
	        int noDays = 0;
	        Scanner userInputScanner = new Scanner(System.in);
	        System.out.print("Enter the Month:");
		    monthno = userInputScanner.nextInt();
		    System.out.print("Enter the Year:");
		    year = userInputScanner.nextInt();
	        switch (monthno) 
	        {
	            case 1:
	            case 3: 
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                noDays = 31;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	               noDays = 30;
	                break;
	            case 2:
	                if (((year % 4 == 0) &&!(year % 100 == 0))|| (year % 400 == 0))
	                    noDays = 29;
	                else
	                    noDays = 28;
	                break;
	            default:
	                System.out.println("Invalid month.");
	                break;
	        }
	        System.out.println("The Total Number of Days = "+ noDays);
	    }
	}
      