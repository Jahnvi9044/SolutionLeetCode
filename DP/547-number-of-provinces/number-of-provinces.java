class Solution {
    public int findCircleNum(int[][] isConnected) {
      
           int n = isConnected.length;
			  int count = 0 ;
			  boolean[] visited = new boolean[n];
             for(int i = 0;i<n;i++)
			 {
				 if(!visited[i])
				 {
					 bfs(i,isConnected,n,visited);
					 count++;
				 }
			 }

             return count;
	}


      public static void bfs(int s , int[][] adj , int n , boolean [] visited ){
            
            visited[s] = true;
             
			 Queue<Integer> pending = new LinkedList<>();
			 pending.add(s);

			 while(!pending.isEmpty())
           {
			   int u = pending.poll();
		   

			for(int i = 0; i<n ; i++ )
			{
				if(!visited[i] && adj[i][u]!=0)
				{
					pending.add(i);
					visited[i]=  true;
				}
			}


		   }
	  }
}
