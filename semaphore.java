// import java.util.Queue;

// public class semaphore {

//    static  class SemaphoreObj{
      
//        static int val;
//         Queue<Integer> bloc_list;
//     }

//    void down(SemaphoreObj s)
//     {
//            s.val= s.val - 1;
           
//            if(s.val<0)
//            {
//                //put process pcb in bloc_list
//                sleep();
//            }

//     }

//     void up(SemaphoreObj s)
//     {
//           s.val=s.val+1;

//           if(s.val<=0)
//           {
//               //Select a preocess from bloc_list put into critical section
//               wake up();
//           }
//     }

    
// }