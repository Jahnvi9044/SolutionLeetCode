class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;


    int xor=0;
         for(int i = 0 ; i<n ; i++ )
         {     
            xor^=nums[i];
            xor^=i;
        }
              xor^=n;
         System.out.println(xor);
           

         
            

         return xor;
    }
}