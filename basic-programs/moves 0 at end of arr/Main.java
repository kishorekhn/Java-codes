/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		int[] ar={1,0,2,0,3,0,4};
		
		int start=0;
		for(int i=0;i<ar.length;i++)
		{
		    if(ar[i]!=0)
		    {
		        ar[start]=ar[i];
		        start++;
		    }
		}
		
		for(int i=start;i<ar.length;i++){
		    ar[i]=0;
		}
		
		
		for(int val:ar){
		    System.out.print(val+" ");
		}
		
		
		
		
		
		
	}
}
