class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    
      HashMap<Integer,Integer> map=new HashMap<>();
      
       int sum2=0;
       int n=nums.length;
          map.put(0,1);

       int sum=0;
       int count=0;
      
      
          int fg=0;
      for(int i=0;i<n;i++)
      {   sum+=nums[i];
         
           
                

          if(map.containsKey(sum-goal))
          {
                count+=map.get(sum-goal);
                System.out.println(count);
          }
          System.out.println(count);
          map.put(sum,map.getOrDefault(sum,0)+1);
                

      }
    
        return count;
    }
}