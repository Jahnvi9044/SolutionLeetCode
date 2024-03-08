class Solution {
    public int maxFrequencyElements(int[] nums) {
          
      int[] freq=new int[101];
       int max=0;
      for(int i:nums)
        {  
            freq[i]++;
            max=Math.max(max,freq[i]);
        }

        int count=0;
        for(int i=0;i<101;i++)
        {
            if(max==freq[i])
            {
               count+= freq[i]++;
   
            }
        }
        return count;


    }
}