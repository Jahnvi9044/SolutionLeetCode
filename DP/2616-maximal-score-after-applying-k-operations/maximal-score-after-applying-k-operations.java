class Solution {
    public long maxKelements(int[] nums, int k) {
        

        // PriorityQueue<Integer> pq = new PrioritytQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
           
        for(int i: nums)  
          pq.add(i);

        
         long ans = 0 ;
        for(int i = 0;i<k;i++ )
        {
            int d = pq.poll();
            ans+=d;
            pq.add((int)((d+2)/3));
        } 
      return ans ; 
    }
}