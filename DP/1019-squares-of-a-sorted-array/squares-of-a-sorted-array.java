class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length ; 

          int [] ans = new int[n];

          int l = 0 ,r = n -1 ;

          for(int i = 0 ;i<n ; i++)
          {
              nums[i] *= nums[i];           
          }

           int i = n-1;
          while(l<=r)
          { 
            if(nums[l]<=nums[r])
               {
                ans[i] = nums[r];
                i--;
                r--;
               }
               else {
                ans[i] = nums[l];
                l++;
                i--;
               }
          }

          System.out.println(Arrays.toString(ans));
          return ans ; 

    }
}