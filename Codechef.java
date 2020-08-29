/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		   int N=sc.nextInt();
		   int M=sc.nextInt();
		   int X=sc.nextInt();
		   int Y=sc.nextInt();
		   
		   int row_sum1=0;
		   
		   if(M%2==0)
		   {
		       row_sum1=row_sum1+((M/2)*(Y));
		   }else{
		      row_sum1=row_sum1+((M/2)*(Y))+Math.min(X,Y);
		   }
		   
		   int row_sum2=0;
		   if(M%2==0)
		   {
		       row_sum2=row_sum2+((M/2)*(Y));
		   }else{
		      row_sum2=row_sum2+((M/2)*(Y))+Y-Math.min(X,Y);
		   }
		   
		   int res=0;
		   if(N%2==0)
		   {
		     res=res+(N/2)*(row_sum1+row_sum2); 
		   }else{
		      res=res+(N/2)*(row_sum1+row_sum2)+row_sum2; 
		   }
		   
		   System.out.println(res);
		   
		   
		   
		 //  for(int i=0;i<N;i++)
		 //  {
		 //     for(int j=0;j<M;j++)
		 //     {
		         
		 //     }
		 //  }
		}
		
	}
}
