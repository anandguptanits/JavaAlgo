
// import java.util.*;

// public class demoStack {

//     final int size;
//     Queue<Integer> q1;
//     Queue<Integer> q2;

//     public demoStack(int size)
//     {   
//         this.size=size;
//         q1=new LinkedList<>();
//         q2=new LinkedList<>();
//     }


//     public boolean push(int val)
//     {  
//        q1.add(val);
//        return true;
//     }

//     public int pop()
//     {
//        while(q.size()!=1)
//        {
//            int temp=q1.poll();
//            q2.add(temp);
//        }

//        int res=q1.poll();
//        Queue<Integer> q=q1;
//        q1=q2;
//        q2=q;
//         return res;
//     }

//     public int top()
//     {
//         if (q1.isEmpty()) 
//                 return -1; 
//             return q1.peek(); 
//     }
   
    
// }