/******************************************************************************/
//twisted prime

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	Scanner sc = new Scanner (System.in);

	int number = sc.nextInt (), rev = 0, temp = 0,add=0;
	int len = (int) Math.log10 (number) + 1;
	 // System.out.println (len);


	int mod = (int) Math.pow (10, len / 2);

	while (number > 0)
	  { int rem = 0;
		rem = number % 10;
		rev = (rev * 10) + rem;
		number /= 10;
	  }


	int num=rev;
	
	while(num>0){
	    
	    int last=num%mod;
	    int fisrt=num/mod;
	     add=(last*100)+fisrt;
	    
	    
	}
	

  System.out.println (add);







  }
}
