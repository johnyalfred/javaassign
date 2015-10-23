
public class Assign6 {
	
	
	   public static void main (String[] args)
	   {		
	       int a,b;
	       int n=100;
	      String prime ="";
	       System.out.println("Prime numbers between 1 & 100 are :");

	       for (a = 1; a <=n; a++)         
	       { 		  	  
	          int cnt=0; 	  
	          for(b =2; b<a; b++)
		  {
	             if(a%b==0)
		     {
	 		cnt = 1;
		     }
		  }
		  if (cnt ==0)
		  {
			  prime = prime+ a + " ";
		  }	
	       }	
	       
	       System.out.println(prime);
	   }
	}

