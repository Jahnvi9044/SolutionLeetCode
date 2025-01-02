class Solution {
    public int searchInsert(int[] nums, int target) {

        int ans = 0;
     
         if(target <= nums[0])
            return ans ;
         
       
           for(int i = 1; i<nums.length ; i++)
           {
             if(target == nums[i])
              return i;
             

            if(nums[i-1]<target && nums[i]>target)
                return i;
        
           }

        

        return nums.length ;
    }
}