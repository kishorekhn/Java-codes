
//factorial

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
        int fact=1;
	   
	   for(int i=1;i<=num;i++)
	   {
	       fact=fact*i;
	       
	   }
		System.out.print(fact+" ");
	
	}
}
