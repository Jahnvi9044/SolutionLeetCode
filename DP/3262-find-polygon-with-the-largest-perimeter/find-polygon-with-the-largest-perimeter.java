class Solution {
    public long largestPerimeter(int[] nums) {
        int n=nums.length;
        if(n<3)
          return -1;


        Arrays.sort(nums);
       long sum=nums[0]+nums[1];
        long p=-1L;
        for(int i=2;i<n;i++)
        {  
            if(sum>nums[i])
            {
                   sum+=nums[i];
                   p=sum;
            }

           
             else 
             sum+=nums[i];

        }
          return p;
    }
}