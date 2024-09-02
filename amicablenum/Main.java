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
		System.out.println("Enter the number1");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt(),sod=0,sod2=0;
		System.out.println("Enter the number1");
	     int num2=sc.nextInt();
	     	System.out.println("/////////////");
		
	   for(int i=1;i<=num/2;i++)
	   {
	       if(num%i==0){
	            sod=sod+i;
	       }
	  } System.out.println(sod+" is sum of factors of"+num);
	  
	  
	  
    for(int j=1;j<=num2/2;j++)
    {
        if(num2%j==0)
        {
            sod2=sod2+j;
        }
    } System.out.println(sod2+"is the sum of factors of"+sod);
    
	//if(num==sod2&&sod==sod2)
	System.out.println( (num==sod2&&num2==sod)?"it is amicable":"Not amicable");
}
}
