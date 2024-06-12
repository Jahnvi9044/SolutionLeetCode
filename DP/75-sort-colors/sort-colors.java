class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1,temp=0;
        while(i<=k)
        {
               if(nums[i]==0)
               {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                    i++;

               }
               else if(nums[i]==1)
               {
                    i++;
               }
               else if(nums[i]==2)
               {    temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                    k--;
                   
               }
        }
    }
}