class Solution {
    public int waysToSplitArray(int[] nums) {
       
       int n = nums.length;

    long []pre =  new long[n];  
       long sum = 0;
        for(int i = 0;i<n;i++)
        { 
           sum += nums[n-i-1];
           pre[n-i-1] = sum ;
        }
         sum=0;
         System.out.println(Arrays.toString(pre));
       int count =0 ; 
       for(int i = 0 ;i<n-1 ;i++)
       {
           sum += nums[i] ; 
              
           System.out.println(sum+" "+pre[i+1]);
           if(sum>=pre[i+1])
           {
             count++;
           } 
       }
       
       return count ; 

    }
}