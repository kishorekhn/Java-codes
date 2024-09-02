
//fibonacci

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the fibonacci limit");
		
		Scanner sc=new Scanner(System.in);
		
		int limit=sc.nextInt();
		
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+ " ");
		
		for(int i=2;i<=limit;i++)
		{
		    int n3=n1+n2;
		    
		    System.out.print(n3+" ");
		    n1=n2;
		    n2=n3;
		  
		   
		}
		
	}
}
