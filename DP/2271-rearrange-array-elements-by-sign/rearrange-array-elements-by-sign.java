class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList();
        ArrayList<Integer> neg=new ArrayList();
        int n=nums.length;

        for(int i =0;i<n;i++)
        { 
            if(nums[i]>0)
             pos.add(nums[i]);
            else 
              neg.add(nums[i]); 
        } 

       
    
      for(int i=0;i<n;i+=2)
      { 
          nums[i]=pos.get(i/2);
          nums[i+1]=neg.get(i/2);

          
      }
        
        
        return nums;
    }
}