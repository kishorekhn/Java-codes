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
		
		int[] ar={10,20,10,20,30,40,20,50};
		 int visit=-12;
		
		for(int i=0;i<ar.length;i++){
		    
		 
		  
		  for(int j=i+1;j<ar.length;j++)
		  {
		      if(ar[i]==ar[j]){
		          ar[j]=visit;
		      }
		  }
		    
		}
		 
		  for(int i=0;i<ar.length;i++)
		  {
		      if(ar[i]==-12){
		          continue;
		      }
		      System.out.print(ar[i]+" ");
		  }
		  
		
		
	}
}
