/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the no of cars");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int []arr=new int[n];
		System.out.println("enter the car speed");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(i==n-1)
		    {
		        if(arr[i]<arr[i-1])
		        c++;
		    }
		    else if(arr[i]<arr[i+1]){
		        c++;
		    }
		    else if(i>0){
		        if(arr[i]<arr[i-1]){
		            c++;
		        }
		    }
		    
		}
		System.out.println("the ans:" +c);
		
	}
}
