class Solution {
    public int longestSquareStreak(int[] nums) {
        
       Set<Long> set =new HashSet<>();
       Arrays.sort(nums); 
       for(int i : nums)
       {
        set.add((long)i);
       }
       System.out.println(Arrays.toString(nums));
         int count = 1;
       long square  = 0 ;
       int n = nums.length;
     
       int max = 0 ;
       for(int i = 0 ; i<n ;i++ )
       {   
        square = (long)nums[i]*nums[i];
        for(int j = 0;j<4;j++)
        { System.out.println(count+" "+square);
          if(set.contains((Long)square))
          {  
              set.remove(square);
              count++;
              square = square*square ; 
          }
         else break;
       }
        max = (max<count)?count:max;

       count = 1;
       }

       if(max==1)
         return -1;

       else return max ;  
    }
}