
public class Main
{
    static int factorial(int n){
        
        if(n==0){
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
        
        
    }
    
	public static void main(String[] args) {
	  
		//number to be factorial
		int num=factorial(7);
		
		System.out.print(num);
		
	}
}
