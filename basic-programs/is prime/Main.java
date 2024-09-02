import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int limit=(int)Math.sqrt(num);
		
		int flag=0;
		for(int i=2;i<=limit;i++)
		{
		    if(num%i==0){
		        flag=1;
		    }
		}
		
		System.out.print(flag==0?"it is prime num":"not a prime");
		
		
	}
}
