/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		int[] sar=new int[n+2];
		
		for(int i=0;i<n;i++)
		{
		    ar[i]=sc.nextInt();
		}
		
// 		for(int i=0;i<n;i++)
// 		{
// 		    	System.out.print(ar[i]+" .");
// 		}
	
		///////////////
		for(int i=0;i<n;i++){
		    sar[i+1]=ar[i];
		}
		
		
	for(int i=0;i<=n+1;i++)
		{
		    	System.out.print(sar[i]+" ");
		}
		
		
	}
}