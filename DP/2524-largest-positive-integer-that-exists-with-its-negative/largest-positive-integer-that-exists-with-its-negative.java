class Solution {
    public int findMaxK(int[] nums) {
        
       int max = -1;
       int[] sum = new int[1001]; 
           

       for(int n : nums)
       {
          int i = n>0? n : -1*n;

          if(sum[i]!=n)
          {
            sum[i]+=n;
          }

          if(sum[i]==0)
          {
            max = max<i ? i : max;
          }
       }    


       return  max;


    }
}