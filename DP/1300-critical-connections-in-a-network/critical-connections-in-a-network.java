class Solution {
    private static int timer;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

         List<List<Integer>> bridges=new ArrayList<>();
          
        List<List<Integer>> arr =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<>());
        }

        for(List<Integer> it:connections)
        {
            int u=it.get(0);
            int v=it.get(1);
            arr.get(u).add(v);
            arr.get(v).add(u);

        }

        int[] tim=new int[n];
        int[] low=new int[n];
        int[]  visited=new int[n];
        dfs(0,-1,visited,tim,low, arr, bridges);

    //    Collections.sort(bridges, (o1,o2)->(o1.get(0)==o2.get(0))?o1.get(1)-o2.get(1):o1.get(0)-o2.get(0) );
        return bridges;

    }
       public static void dfs(int n, int parent, int[] visited, int[] tim, int[] low, List<List<Integer>> adj, List<List<Integer>> bridges) {

        visited[n]=1;
        low[n]=timer;
        tim[n]=timer;
        timer++;

        for(Integer it:adj.get(n))
        {
            if (it == parent) continue;
            if (visited[it] == 0) {
                dfs(it, n, visited, tim, low, adj, bridges);
                low[n] = Math.min(low[n], low[it]);
                if (low[it] > tim[n])
                {
                    List<Integer> a=new ArrayList<>(2);
                        a.add(it);
                        a.add(n);
                    
                    bridges.add(a);

                }
            } else {
                low[n] = Math.min(low[n], low[it]);
            }
        }

    }

    
 }