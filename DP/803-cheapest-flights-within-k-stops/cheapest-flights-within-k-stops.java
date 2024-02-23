class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Queue<Pair> q=new LinkedList<>();
        int dp[]=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int arr[]:flights){
            adj.get(arr[0]).add(new Pair(arr[1],arr[2]));
        }
        q.add(new Pair(src,0));
        while(!q.isEmpty() && k-->=0){
            int size=q.size();
            while(size-->0){
                Pair x=q.poll();
                for(Pair i:adj.get(x.p)){
                    int cost=i.d;
                    int idx=i.p;
                    if(cost+x.d<dp[idx]){
                        dp[idx]=cost+x.d;
                        q.add(new Pair(idx,dp[idx]));
                    }
                }
            }
        }
        if(dp[dst]==Integer.MAX_VALUE) return -1;
        return dp[dst];
    }
}
class Pair{
    int p;
    int d;
    Pair(int p,int d){
        this.p=p;
        this.d=d;
    }
}