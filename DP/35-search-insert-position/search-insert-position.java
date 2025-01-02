class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid= 0 ;
        int ans = -1;
        while(low<=high)
        { 
            mid =  low + ( high-low )/2;
            System.out.println(low+" "+high);
            if(nums[mid]==target)
             { ans = mid ; 
               break;
             }
            else if(nums[mid]>target)
            {    
                high = mid-1 ; 
            }
            else if(nums[mid]<target)
              {
                low = mid + 1;
              }
        }
         
        if(ans == -1)
        {
           ans = 0;
           for(int i = 0;i<nums.length;i++)
           {
            if(nums[i]<target)
            {
                ans = i+1;
            }
        
           }

        }

        return ans ;
    }
}