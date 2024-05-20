class Solution {
    public int subsetXORSum(int[] nums) {
        
        int xor=0,sum=0;
        for(int i=0;i< 1<<nums.length ;i++)
        {
            for(int j=0; j<nums.length ; j++)
            {   if((i&(1<<j))!=0)
               {
                   xor=xor^nums[j];
               }
            }
              sum+=xor;
              xor=0;
        }
         
        // System.out.println(sum);

        return sum;
    }
}