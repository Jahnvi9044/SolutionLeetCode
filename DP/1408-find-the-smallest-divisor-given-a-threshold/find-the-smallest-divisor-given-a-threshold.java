class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int n=nums.length;
         int low=1, mid, high=nums[0];
         for(int i=1;i<n;i++)
         {
             if(high<nums[i])
               high=nums[i];
         }
         int ans=0;

         while(low<=high)
         {
             mid=low+(high-low)/2;

             if(sum(nums,mid,n)<=threshold)
               {
                   ans=mid;
                   high=mid-1;
               }
               else 
               {
                   low=mid+1;
               }

         }
         return low;
    }

    public static int sum(int[] nums, int mid,int n){
        
        int s=0;
        // int d=0;
        for(int i=0;i<n;i++)
        {
            // d=nums[i]/mid;
            // if(d*mid<nums[i])
            //   d++;
            // or
            s+=(nums[i]-1+mid)/mid;
        }
        // System.out.println(s);
        return s;

    }

}