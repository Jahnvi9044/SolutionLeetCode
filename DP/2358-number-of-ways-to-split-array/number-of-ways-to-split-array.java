class Solution {
    public int waysToSplitArray(int[] nums) {
       
       int n = nums.length;

      long pre = 0l;
       long sum = 0l;
        for(int i = 0;i<n;i++)
        { 
           pre += nums[n-i-1];

        }
         sum=0;
         pre-=nums[0];
       int count =0 ; 
       for(int i = 0 ;i<n-1 ;i++)
       {
           sum += nums[i] ; 
              
        
           if(sum>=pre)
           {
             count++;
           } 
           pre-=nums[i+1];
       }
       
       return count ; 

    }
}