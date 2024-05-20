class Solution {
    public int subsetXORSum(int[] nums) {
        
    

     return subsetSum(0,nums,0);


    }




    private int subsetSum(int i, int [] nums, int xor)
    {
        if(i==nums.length)
          return xor;


        int sum1=subsetSum(i+1,nums,xor);      
        int sum2=subsetSum(i+1,nums,xor^nums[i]);

        return sum1+sum2;      
    }   
}