import java.util.*;


public class TravellingSalesmanProblem {
      
    private static int allVisited;
    static int dp[][];
    public static void main(String[] args) 
    { 
  
        // n is the number of nodes i.e. V 
        //int n = 4; 
  
        int[][] graph = { {0,20,42,25},
        {20,0,30,34},
        {42,30,0,10},
        {25,34,10,0}}; 
  
        // Boolean array to check if a node 
        // has been visited or not 
        allVisited = (1 << graph.length) - 1;
        dp=new int[1 << graph.length][graph.length];

        int ans=tspDp(graph);
        // ans is the minimum weight Hamiltonian Cycle 
        System.out.println(ans); 
    }

       


         static int tspDp(int[][] graph) {

            for (int d[] : dp)
            Arrays.fill(d, -1);

            return tspRecDP(1,0,graph);
          }

         
            private static int tspRecDP(int masked, int pos,int[][] graph) {
              // TODO Auto-generated method stub
            int ans = Integer.MAX_VALUE;

            if (masked == allVisited)
              return graph[pos][0];

            if (dp[masked][pos] != -1)
             return dp[masked][pos];

            for (int i = 0; i < graph.length; i++)
             {
               if ((masked & (1 << i)) == 0) 
               {
                ans = Math.min(ans, graph[pos][i] + tspRecDP(masked | (1 << i), i,graph));
               }
             }
            return dp[masked][pos] = ans;
            }

           
    
}