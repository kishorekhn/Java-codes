/******************************************************************************/
//twisted prime

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	Scanner sc = new Scanner (System.in);

	int num = sc.nextInt (), rem = 0, rev = 0, flag = 0;
    int temp=num;
	while (num > 0)
	  {
		rem = num % 10;
		rev = (rev * 10) + rem;
		num /= 10;
	  }

    
    for(int i=1;i<rev/2;i++)
    {
        if(rev%i ==0){
           flag=1; 
           
        }
       
    }
  
  if(flag==0)
  {
     	System.out.println ("It is twisted prime");
  }
  else{
      	System.out.println ("NOT twisted prime");
  }
  



}
}
