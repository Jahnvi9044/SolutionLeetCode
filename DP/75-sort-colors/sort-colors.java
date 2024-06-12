class Solution {
    public void sortColors(int[] nums) {
        
      int i = 0, j = 0, k= nums.length - 1 ;

      while(i<=k)
      {
        if(nums[i]==0)
        {
           nums[i]=nums[j];
           nums[j]=0;
           j++;
           i++;
          
        }
        else if(nums[i]==2)
        {
           nums[i]=nums[k];
           nums[k]=2;
           k--;
           
        }
        else if(nums[i]==1){
        i++;
        }
      } 




    }
}