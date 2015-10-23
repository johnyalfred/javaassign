import java.util.Scanner;
public class Assign5 {

	public static void main(String args [])
	{
		int x;
	    Scanner userInputScanner = new Scanner(System.in);
	
		System.out.print("Enter the age:");
		x = userInputScanner.nextInt();
		if(x>=18)
		{
			System.out.println("Yes,You Are Eligible To Vote");
		}
			else
			System.out.println("No,You Are Not Eligible To Vote");
		
	}


}
