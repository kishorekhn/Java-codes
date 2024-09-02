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
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
	    char temp;
	    char[] ch=str.toCharArray();
	    int len=ch.length;
	    for(int st=0,en=len-1;st<=en/2;st++,en--)
	    {
	        ch[st]=(st%2!=0)?(char)(ch[st]+12):(char)(ch[st]-1);
	        ch[en]=(en%2!=0)?(char)(ch[en]+12):(char)(ch[en]-1);
	        temp=ch[st];
	        ch[st]=ch[en];
	        ch[en]=temp;
	    }
	   if(len%2!=0)
	   {
	        ch[(len-1)/2]=(char)(ch[(len-1)/2]-1);
	        String encrypt = String.valueOf(ch);
	        System.out.println(encrypt);
	    }
	    
	    
	 	}
}
