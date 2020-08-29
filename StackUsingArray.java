
import java.util.*;

public class StackUsingArray {

    static final int MAX=10;
    int top;
    int arr[];


    public StackUsingArray()
    {
        top=-1;
        arr=new int[MAX];
    }

     
    public boolean push(int val)
    {
          if(top==MAX)
          {
              System.out.println("Stack Over Flow");
              return false;
          }
          top++;
          arr[top]=val;
          return true;     
    }

    public int peek()
    {
       if(top<0)
       {  
           System.out.println("Stack Under Flow");
          return -1;
       }
     
       return arr[top];
    }

    public int pop()
    {
        if(top<0)
       {  
          System.out.println("Stack Under Flow");
          return -1;
       }   
       
       int x=arr[top];
       top--;
       return x;
    }

    public void display()
    {
        if(top<0)
        {
            System.out.println("No element is in the stack");
            return;
        }
      
        for(int i=top;i>-1;i--)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }



    
}