class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int i=0,j=nums.length-1;
        int max=-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==0)
            {
                 if(nums[j]>0)
                      max=nums[j];

               return max;       

            }

            else 
            {
                if( Math.abs( nums[i] ) > Math.abs( nums[j] ) )
                {
                     i++;
                }
                else j--;
            }


        }


        return -1;
    }
}