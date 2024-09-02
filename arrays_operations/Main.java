import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] ar={12,34,44,56,77};
		
	swap(ar,0,4);
	System.out.print(Arrays.toString(ar)+ " ");
	reverse(ar);
    	System.out.print(Arrays.toString(ar)+ " ");

		
		
}
    static void swap(int[] ar,int i,int j)
    {
        
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
      }

    static void reverse(int[]ar)
    {
        int start=0;
        int end=ar.length-1;
        
        while(start<end){
            swap(ar,start,end);
            start++;
            end--;
        }
        
        
        
        
    }



}