class Solution {
    public int missingNumber(int[] nums) {
       
       if(nums.length==0)
          return 0;

         int [] dummy=new int[nums.length+1];
         for(int i:nums)
         {   dummy[i]++;

         }
         for(int i=0;i<nums.length+1;i++)
         {
             if(dummy[i]==0)
               return i;

         }

         return 0;
    }
}