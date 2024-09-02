import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number  to check armstrong");
		int num=410;
		int temp=num;
		int arm=0;
		
		while(num>0)
		{
		    int last=num%10;
		    arm=arm+(last*last*last);
		    num=num/10;
		    
		}
		
		System.out.print(arm+"is ");
	  if(arm==temp){
	       System.out.print("it is armstrong");
	  }
	  
	  else{
	      System.out.print("Not a armstrong");
	  }
	     
		
	}
}
