class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
      Stack<Integer> s = new Stack<>();
      int n = nums.length;
      for(int i = n-1 ; i>=0 ; i--)
      {  
        // System.out.println(nums[i]);
        while(!s.isEmpty() && s.peek()<=nums[i])
          s.pop();
        s.push(nums[i]);
          
          
      }
    //   System.out.println(s);
       int [] ans =  new int[nums.length];

        for(int i = n-1 ; i>=0 ; i--)
      {

        // System.out.println(nums[i]);
        while(!s.isEmpty() && s.peek()<=nums[i])
          s.pop();

        if(s.isEmpty()) 
           ans[i]=-1;

        else if(s.peek()>nums[i])     
            ans[i]=s.peek();
         s.push(nums[i]);
          
          
      }

      return ans;

    }
}