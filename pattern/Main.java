import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int N = 5, row, col;
		for(row = 1; row<=N; row++, System.out.println())
		{
		    for(col =1;col<=row;col++,System.out.print("*"));
		   for(col=1;col<=2*(N-row);col++,System.out.print(" "));
		    for(col =1;col<=row;col++,System.out.print("*"));
		}
		for(row = N-1; row>0; row--, System.out.println())
		{
		    for(col =1;col<=row;col++,System.out.print("*"));
		   for(col=1;col<=2*(N-row);col++,System.out.print(" "));
		    for(col =1;col<=row;col++,System.out.print("*"));
		}
	}
}
